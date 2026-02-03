package Aula4;

import java.util.Scanner;

public class Exer2 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int num;

        System.out.println("Digite um numero");
        num = in.nextInt();

        if (num < 0){
                System.out.println("numero é negativo e o Jonas da o bumbum");
            }else if (num > 0){
                System.out.println("numero é Positivo, Mas o Jonas curte chupar rolas");
            }else{
                System.out.println("é neutro e o Jonas está na lista de melhores amigos de Jeffrey Epstein");
            }
            System.out.println("Sempre Executa");
    }
    
}
