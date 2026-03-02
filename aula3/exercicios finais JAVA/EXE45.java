import java.util.Scanner;

// Menu Simples de "Caixa Eletrônico": Simule operações de depósito, saque e consulta de saldo.

public class EXE45 {
    public static void main(String[] args) {
        double saldo = 1000.0; // Saldo inicial
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("=== CAIXA ELETRÔNICO ===");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = new java.util.Scanner(System.in).nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("Saldo atual: R$ %.2f%n", saldo); // %.2f: Formata o número decimal para mostrar exatamente duas casas decimais
                    break;
                case 2:
                    System.out.print("Digite o valor para depósito: R$ ");
                    double deposito = new java.util.Scanner(System.in).nextDouble();
                    saldo += deposito;
                    System.out.printf("Depósito realizado. Novo saldo: R$ %.2f%n", saldo); // %n: Adiciona uma quebra de linha
                    break;
                case 3:
                    System.out.print("Digite o valor para saque: R$ ");
                    double saque = new java.util.Scanner(System.in).nextDouble();
                    if (saque <= saldo) {
                        saldo -= saque;
                        System.out.printf("Saque realizado. Novo saldo: R$ %.2f%n", saldo);
                    } else {
                        System.out.println("Saldo insuficiente para saque.");
                    }
                    break;
                case 4:
                    System.out.println("Saindo do caixa eletrônico. Até o proximo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");

               }
        }
    }
}
