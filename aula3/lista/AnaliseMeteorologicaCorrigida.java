import java.util.Arrays;

public class AnaliseMeteorologica { //Aqui é criada a classe principal chamada


    // 1️ Média ponderada (70% max, 30% min)
    public static double calcularMediaPonderadaTemperatura(double max, double min) {

        if (max < -50 || max > 60 || min < -50 || min > 60) { // Valida se as temperaturas estão num intervalo realista (-50°C a 60°C)
            System.out.print("A Temperatura dessa cidade está fora do intervalo permitido.");
        }
//É o nome de uma classe de exceção que já existe na biblioteca padrão do Java. O nome é bem descritivo: ela foi feita para ser usada quando um método recebe um argumento (um parâmetro) que é inválido ou inadequado.
        return (max * 0.7) + (min * 0.3); 
        
    }

        // 2️ Classificação do clima
    public static String classificarClima(double tempMedia, double umidadeMedia) {

        if (tempMedia >= 30 && umidadeMedia >= 75)
            return "MUITO QUENTE";
        else if (tempMedia >= 20 && tempMedia <= 25 && umidadeMedia >= 50 && umidadeMedia <= 70)
            return "CONFORTAVEL";
        else if (tempMedia < 15 && umidadeMedia < 50)
            return "FRIO E SECO";
        else if (tempMedia > 25)
            return "QUENTE MODERADO";
        else
            return "QUENTE LEVE"; //aqui com if e else, estou pegando o calculo da "calcularMediaPonderadaTemperatura" para definir aonde a cidade se encaixa
    }

    // 3️ Cidade com maior amplitude térmica
    public static int identificarCidadeComMaiorAmplitudeTermica() {

        double maiorAmplitude = 0; // Começa com zero para comparar
        int indice = 0; // Guarda qual cidade tem a maior amplitude

        for (int i = 0; i < temperaturas.length; i++) { // Percorre todas as cidades
            double amplitude = temperaturas[i][0] - temperaturas[i][1];

            if (amplitude > maiorAmplitude) { // Se encontrou amplitude maior, atualiza
                maiorAmplitude = amplitude;
                indice = i;
            }
        }

        return indice;  // Retorna o índice (posição) da cidade vencedora
    }

    // 4️ Índice de calor
    public static double calcularIndiceCalor(double temp, int umidade) { // Fórmula personalizada: quanto maior a umidade, mais "pesada" fica a temperatura sentida

        double indice = temp + 0.5 * (umidade / 100.0) * (temp - 20);

        return Math.round(indice * 10.0) / 10.0; // Arredonda para 1 casa decimal, assim sempre arredondando a umidade para casa decimal, mesmo colocando numero quebrado em umidade
    }

    // 5️ Sistema de alertas
    public static int gerarAlertas(int cidadeIndex) {

        double max = temperaturas[cidadeIndex][0];
        double min = temperaturas[cidadeIndex][1];
        double variacao = max - min;
// Lê os dados da cidade pelo índice recebido

        int umidadeMedia = (umidades[cidadeIndex][0] +
                umidades[cidadeIndex][1] +
                umidades[cidadeIndex][2]) / 3;

        if (max > 35 || umidadeMedia > 90)
            return 2; // vermelho

        else if ((max >= 30 && max <= 35 && umidadeMedia > 80) || variacao > 15)
            return 1; // amarelo

        else
            return 0; // verde  //if e else para definir se é verde, amarelo ou vermelho com base nos dados.
    }

     // 6️ Estatísticas gerais
    public static double[] calcularEstatisticasAvancadas() { // Percorre TODOS os valores do array 2D para calcular média, maior, menor e desvio padrão

        double soma = 0; //É o ponto de partida para uma soma acumulada (elemento neutro da adição).
        double maior = temperaturas[0][0]; //Assume o primeiro valor como o maior para ter um ponto de referência real do próprio conjunto de dados para iniciar as comparações.
        double menor = temperaturas[0][0]; //Assume o segundo valor como o menor para iniciar as comparações.
        int total = 0; //É o ponto de partida para uma contagem de itens.

        for (double[] cidade : temperaturas) {
            for (double temp : cidade) {
                soma += temp;
                total++;
                if (temp > maior) maior = temp;
                if (temp < menor) menor = temp;
            }
        }

        double media = soma / total;

        // Desvio padrão: mede o quanto os valores se afastam da média
        double somaQuadrados = 0; 
        for (double[] cidade : temperaturas) {
            for (double temp : cidade) {
                somaQuadrados += Math.pow(temp - media, 2); // (valor - média)²
            }
        }

        double desvio = Math.sqrt(somaQuadrados / total); // Raiz da média dos quadrados

        return new double[]{media, maior, menor, desvio}; // Retorna 4 valores num array
    }
    // 7️ Comparação entre cidades
    public static String compararCidades(int c1, int c2, int c3, int c4) {// Calcula a média ponderada de cada cidade recebida por parâmetro
        // Calcula a média ponderada de cada cidade recebida por parâmetro
        double media1 = calcularMediaPonderadaTemperatura( // Calcula a média ponderada para a primeira cidade usando o método 'calcularMediaPonderadaTemperatura'
                temperaturas[c1][0], temperaturas[c1][1]); // Passa a temperatura máxima e mínima da cidade 'c1'.

        double media2 = calcularMediaPonderadaTemperatura(
                temperaturas[c2][0], temperaturas[c2][1]);

         double media3 = calcularMediaPonderadaTemperatura(
                temperaturas[c3][0], temperaturas[c3][1]);

         double media4 = calcularMediaPonderadaTemperatura(
                temperaturas[c4][0], temperaturas[c4][1]);

        if (media1 > media2 && media1 > media3 && media1 > media4) // Verifica se a média da cidade 1 é a maior entre as quatro.
            return "Cidade #" + (c1 + 1) + " é mais quente."; // Se for, retorna uma string indicando que a Cidade 1 é a mais quente.
        else if (media2 > media1 && media2 > media3 && media2 > media4)
            return "Cidade #" + (c2 + 1) + " é mais quente.";
        else if (media3 > media1 && media3 > media2 && media3 > media4)
            return "Cidade #" + (c3 + 1) + " é mais quente.";
        else if (media4 > media1 && media4 > media2 && media4 > media3)
            return "Cidade #" + (c4 + 1) + " é mais quente.";
        
            
        return "Temperaturas equivalentes.";
    }

     // 8️ Relatório principal
    public static void gerarRelatorioDetalhado() { //main chma esses dados

        System.out.println("======================================================");
        System.out.println("   SISTEMA DE ANÁLISE METEOROLÓGICA INTELIGENTE");
        System.out.println("======================================================\n");

        System.out.println("CIDADE | T.MAX | T.MIN | T.MÉD | UMID% | CLASSIFICAÇÃO     | ALERTA");

        for (int i = 0; i < temperaturas.length; i++) { // Inicia um loop 'for' que itera sobre cada cidade, usando seu índice 'i'

            double max = temperaturas[i][0]; // Obtém a temperatura máxima da cidade atual.
            double min = temperaturas[i][1]; // Obtém a temperatura mínima da cidade atual.

            double media = calcularMediaPonderadaTemperatura(max, min); // Calcula a temperatura média ponderada para a cidade atual.

            int umidadeMedia = (umidades[i][0] + // Calcula a umidade média para a cidade atual.
                    umidades[i][1] +
                    umidades[i][2]) / 3;

            String classificacao = classificarClima(media, umidadeMedia); // Classifica o clima da cidade atual usando a temperatura e umidade médias.

            int alerta = gerarAlertas(i); // Gera o nível de alerta para a cidade atual.

            String alertaStr = (alerta == 2) ? "VERMELHO"
                    : (alerta == 1) ? "AMARELO" : "VERDE";

            System.out.printf("   %d   | %.1f°C| %.1f°C| %.1f°C|  %d  | %-18s| %s\n",
                    (i + 1), max, min, media, umidadeMedia,
                    classificacao, alertaStr);
        }

        double[] stats = calcularEstatisticasAvancadas();
 
        System.out.println("\nESTATÍSTICAS GERAIS:"); // Imprime um cabeçalho para as estatísticas gerais.
        System.out.printf("• Temperatura média geral: %.1f°C\n", stats[0]); // Imprime a temperatura média geral.
        System.out.printf("• Maior temperatura: %.1f°C\n", stats[1]); // Imprime a maior temperatura registrada.
        System.out.printf("• Menor temperatura: %.1f°C\n", stats[2]); // Imprime a menor temperatura registrada
        System.out.printf("• Desvio padrão: %.2f\n", stats[3]); // Imprime o desvio padrão.

        int maiorAmplitude = identificarCidadeComMaiorAmplitudeTermica();
        System.out.println("• Maior amplitude térmica: Cidade #" + (maiorAmplitude + 1));

        System.out.println("\nANÁLISE COMPARATIVA:");
        System.out.println(compararCidades(1, 2, 3, 4));
    }

    static double[][] temperaturas = {
            {10.5, 10.1},
            {10.3, 15.7},
            {31.8, 21.9},
            {20.0, 24.1},
            {45.7, 27.3}
    };

    static int[][] umidades = { //estes são os dados da cidade, podemos alterar e cada linha representa uma cidade.
            {10, 20, 30},
            {55, 60, 65},
            {90, 65, 80},
            {72, 58, 70},
            {75, 75, 75}
    };                          

    public static void main(String[] args) {  //esse método cordena todo o sistema

        gerarRelatorioDetalhado();
    }

   
}


