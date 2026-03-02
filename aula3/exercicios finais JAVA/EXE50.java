
import java.util.Scanner;

public class EXE50 {

    public static void main(String[] args) {
        // Criar o Scanner apenas UMA vez aqui no main
        Scanner leitor = new Scanner(System.in);

        // Chamar o input budget para obter os valor, e armanezar em variáveis
        double valor1 = obterEntrada(leitor);
        double valor2 = obterEntrada(leitor);

        // Chamamos o processamento para cada valor individualmente
        double resultado1 = calcular(valor1);
        double resultado2 = calcular(valor2);

        // Mostramos os resultados
        imprimirResultados(resultado1);
        imprimirResultados(resultado2);
        
        leitor.close(); // fechar o scanner in
    }

    // Método focado apenas em interagir com o usuário e retornar o valor
    public static double obterEntrada(Scanner sc) {
        System.out.print("Digite um número: ");
        return sc.nextDouble();
    }

    // Método focado apenas na captura logica (o cálculo)
    public static double calcular(double n) {
        n = n * n;
        n = n + n;
        n = n - 1;
        n = n / 2;
        return n;
    }

    // Método focado apenas em exibir o resultado
    public static void imprimirResultados(double n) {
        System.out.println("O resultado calculado é: " + n);
    }
}
