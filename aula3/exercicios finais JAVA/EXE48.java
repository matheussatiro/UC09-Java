import java.util.Scanner;
// Calculadora de Custo de Energia: Calcule o custo diário e mensal de um aparelho elétrico.

public class EXE48 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a potência do aparelho em watts: ");
        double potencia = leitor.nextDouble();

        System.out.print("Digite o número de horas que o aparelho é usado por dia: ");
        double horasPorDia = leitor.nextDouble();

        System.out.print("Digite o custo da energia por kWh: ");
        double custoPorKWh = leitor.nextDouble();

        double consumoDiarioKWh = (potencia * horasPorDia) / 1000; // Convertendo watts para kWh
        double custoDiario = consumoDiarioKWh * custoPorKWh;
        double custoMensal = custoDiario * 30; // Considerando 30 dias no mês

        System.out.printf("O custo diário de usar o aparelho é: R$ %.2f%n", custoDiario);
        System.out.printf("O custo mensal de usar o aparelho é: R$ %.2f%n", custoMensal);

        leitor.close();
    }
}
