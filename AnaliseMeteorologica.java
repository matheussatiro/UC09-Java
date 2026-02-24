package lista;

import java.util.Arrays;

public class AnaliseMeteorologica {

    // ===============================
    // DADOS INICIAIS (Hard-coded)
    // ===============================

    static double[][] temperaturas = {
            {20.5, 25.1},
            {29.3, 25.7},
            {28.8, 19.9},
            {30.2, 20.5},
            {20.7, 11.3}
    };

    static int[][] umidades = {
            {85, 60, 75},
            {71, 50, 65},
            {90, 65, 80},
            {72, 58, 70},
            {80, 50, 68}
    };

    public static void main(String[] args) {

        gerarRelatorioDetalhado();
    }

    // 1️⃣ Média ponderada (70% max, 30% min)
    public static double calcularMediaPonderadaTemperatura(double max, double min) {

        if (max < -50 || max > 60 || min < -50 || min > 60) {
            throw new IllegalArgumentException("Temperatura fora do intervalo permitido.");
        }

        return (max * 0.7) + (min * 0.3);
    }

    // 2️⃣ Classificação do clima
    public static String classificarClima(double tempMedia, int umidadeMedia) {

        if (tempMedia > 30 && umidadeMedia > 75)
            return "MUITO QUENTE";
        else if (tempMedia >= 20 && tempMedia <= 25 && umidadeMedia >= 50 && umidadeMedia <= 70)
            return "CONFORTAVEL";
        else if (tempMedia < 15 && umidadeMedia < 50)
            return "FRIO E SECO";
        else if (tempMedia > 25)
            return "QUENTE MODERADO";
        else
            return "QUENTE LEVE";
    }

    // 3️⃣ Cidade com maior amplitude térmica
    public static int identificarCidadeComMaiorAmplitudeTermica() {

        double maiorAmplitude = 0;
        int indice = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            double amplitude = temperaturas[i][0] - temperaturas[i][1];

            if (amplitude > maiorAmplitude) {
                maiorAmplitude = amplitude;
                indice = i;
            }
        }

        return indice;
    }

    // 4️⃣ Índice de calor
    public static double calcularIndiceCalor(double temp, int umidade) {

        double indice = temp + 0.5 * (umidade / 100.0) * (temp - 20);

        return Math.round(indice * 10.0) / 10.0;
    }

    // 5️⃣ Sistema de alertas
    public static int gerarAlertas(int cidadeIndex) {

        double max = temperaturas[cidadeIndex][0];
        double min = temperaturas[cidadeIndex][1];
        double variacao = max - min;

        int umidadeMedia = (umidades[cidadeIndex][0] +
                umidades[cidadeIndex][1] +
                umidades[cidadeIndex][2]) / 3;

        if (max > 35 || umidadeMedia > 90)
            return 2; // vermelho

        else if ((max >= 30 && max <= 35 && umidadeMedia > 80) || variacao > 15)
            return 1; // amarelo

        else
            return 0; // verde
    }

    // 6️⃣ Estatísticas gerais
    public static double[] calcularEstatisticasAvancadas() {

        double soma = 0;
        double maior = temperaturas[0][0];
        double menor = temperaturas[0][1];
        int total = 0;

        for (double[] cidade : temperaturas) {
            for (double temp : cidade) {
                soma += temp;
                total++;
                if (temp > maior) maior = temp;
                if (temp < menor) menor = temp;
            }
        }

        double media = soma / total;

        // Desvio padrão simples
        double somaQuadrados = 0;
        for (double[] cidade : temperaturas) {
            for (double temp : cidade) {
                somaQuadrados += Math.pow(temp - media, 2);
            }
        }

        double desvio = Math.sqrt(somaQuadrados / total);

        return new double[]{media, maior, menor, desvio};
    }

    // 7️⃣ Comparação entre cidades
    public static String compararCidades(int c1, int c2, int c3, int c4) {

        double media1 = calcularMediaPonderadaTemperatura(
                temperaturas[c1][0], temperaturas[c1][1]);

        double media2 = calcularMediaPonderadaTemperatura(
                temperaturas[c2][0], temperaturas[c2][1]);

         double media3 = calcularMediaPonderadaTemperatura(
                temperaturas[c3][0], temperaturas[c3][1]);

         double media4 = calcularMediaPonderadaTemperatura(
                temperaturas[c4][0], temperaturas[c4][1]);

        if (media1 > media2 && media1 > media3 && media1 > media4)
            return "Cidade #" + (c1 + 1) + " é mais quente.";
        else if (media2 > media1 && media2 > media3 && media2 > media4)
            return "Cidade #" + (c2 + 1) + " é mais quente.";
        else if (media3 > media1 && media3 > media2 && media3 > media4)
            return "Cidade #" + (c3 + 1) + " é mais quente.";
        else if (media4 > media1 && media4 > media2 && media4 > media3)
            return "Cidade #" + (c4 + 1) + " é mais quente.";
        
            
        return "Temperaturas equivalentes.";
    }

    // 8️⃣ Relatório principal
    public static void gerarRelatorioDetalhado() {

        System.out.println("======================================================");
        System.out.println("   SISTEMA DE ANÁLISE METEOROLÓGICA INTELIGENTE");
        System.out.println("======================================================\n");

        System.out.println("CIDADE | T.MAX | T.MIN | T.MÉD | UMID% | CLASSIFICAÇÃO     | ALERTA");

        for (int i = 0; i < temperaturas.length; i++) {

            double max = temperaturas[i][0];
            double min = temperaturas[i][1];

            double media = calcularMediaPonderadaTemperatura(max, min);

            int umidadeMedia = (umidades[i][0] +
                    umidades[i][1] +
                    umidades[i][2]) / 3;

            String classificacao = classificarClima(media, umidadeMedia);

            int alerta = gerarAlertas(i);

            String alertaStr = (alerta == 2) ? "VERMELHO"
                    : (alerta == 1) ? "AMARELO" : "VERDE";

            System.out.printf("   %d   | %.1f°C| %.1f°C| %.1f°C|  %d  | %-18s| %s\n",
                    (i + 1), max, min, media, umidadeMedia,
                    classificacao, alertaStr);
        }

        double[] stats = calcularEstatisticasAvancadas();

        System.out.println("\nESTATÍSTICAS GERAIS:");
        System.out.printf("• Temperatura média geral: %.1f°C\n", stats[0]);
        System.out.printf("• Maior temperatura: %.1f°C\n", stats[1]);
        System.out.printf("• Menor temperatura: %.1f°C\n", stats[2]);
        System.out.printf("• Desvio padrão: %.2f\n", stats[3]);

        int maiorAmplitude = identificarCidadeComMaiorAmplitudeTermica();
        System.out.println("• Maior amplitude térmica: Cidade #" + (maiorAmplitude + 1));

        System.out.println("\nANÁLISE COMPARATIVA:");
        System.out.println(compararCidades(1, 2, 3, 4));
    }
}
