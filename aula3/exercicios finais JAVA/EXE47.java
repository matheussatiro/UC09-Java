
// Tabela de Juros Compostos: Imprima uma tabela do crescimento do investimento por 5 anos.

public class EXE47 {
    public static void main(String[] args) {
        double investimentoInicial = 4000.0; // Valor inicial do investimento
        double taxaJuros = 0.15; // Taxa de juros anual CDI (15%)

        System.out.println("Ano\tValor do Investimento");
        System.out.println("-----------------------------");

        for (int ano = 1; ano <= 5; ano++) {
            investimentoInicial += investimentoInicial * taxaJuros; // Calcula o valor com juros compostos
            System.out.printf("%d\tR$ %.2f%n", ano, investimentoInicial);
        }
    }
}
