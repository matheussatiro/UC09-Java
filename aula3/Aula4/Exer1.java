package Aula4;

import java.util.Scanner;

public class Exer1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int x;

        System.out.println("Digite um numero");
         x = in.nextInt();

        if(x % 2 == 0){
            System.out.println("X é par");

        }else{
            System.out.println("X é impar");
        }
        System.out.println("Sempre executa");
    }
    
}
