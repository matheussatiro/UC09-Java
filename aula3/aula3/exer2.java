package aula3;

import java.util.Scanner;

public class exer2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String n1;
        int n2;

        System.out.println("Digite um numero de 0 a 100");
        n1 = in.nextLine();

        System.out.println("Digite outro numero de 0 a 100");
        n2 = in.nextInt();
        
        System.out.println("Voce digitou os numeros ");
        System.out.print(n1);
        System.out.print(" E ");
        System.out.print(n2);
    }
}
