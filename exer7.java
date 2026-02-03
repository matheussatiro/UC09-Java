package lista;

import java.util.Scanner;

import aula3.string;

public class exer7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num1;
        int num2;

        int cal;
        int n1 = 1;
        int n2 = 2;
        int n3 = 3;
        int n4 = 4;


        System.out.println("Digite um número");
          num1 = in.nextInt();

        System.out.println("Digite outro número");
          num2 = in.nextInt();

        System.out.println("Escolha qual Operação deseja escolher 1 = soma  2 = Subtração  3 = multiplicação  4 = Divisão");
          cal = in.nextInt();

        switch (cal) {
            case 1:
                System.out.println(num1 + num2);
                break;
        
            case 2:
                System.out.println(num1 - num2);
                break;
            
            case 3:
                System.out.println(num1 * num2);
                break;

            case 4:
                System.out.println(num1 / num2);
                break;

                default:
                    System.out.println("Não fazer esse tipo de operação");
        }

    }
}
