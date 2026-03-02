import java.util.Scanner;

// Decomposição de Métodos: Implemente uma nota fiscal usando métodos imprimirCabecalho, imprimirItem, imprimirTotal.

public class EXE49 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        imprimirCabecalho();

        System.out.print("Digite o nome do item: ");
        String item1 = leitor.nextLine();
        System.out.print("Digite o preço do item: ");
        double preco1 = leitor.nextDouble();
        imprimirItem(item1, preco1);

        leitor.nextLine(); // Consumir a nova linha

        System.out.print("Digite o nome do item: ");
        String item2 = leitor.nextLine();
        System.out.print("Digite o preço do item: ");
        double preco2 = leitor.nextDouble();
        imprimirItem(item2, preco2);

        double total = preco1 + preco2;
        imprimirTotal(total);

        leitor.close();
    }

    public static void imprimirCabecalho() {
        System.out.println("===== NOTA FISCAL =====");
    }

    public static void imprimirItem(String nome, double preco) {
        System.out.printf("%s: R$ %.2f%n", nome, preco); // %s: É um marcador para o texto (String) e %.2f: Formata o número decimal para mostrar exatamente duas casas decimais neste caso estou usando para formatar o preço do item
    }

    public static void imprimirTotal(double total) {
        System.out.printf("TOTAL: R$ %.2f%n", total);
    }

}
