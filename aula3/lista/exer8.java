package lista;

import java.util.Scanner;

public class exer8 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        double idade;

        System.out.println("Digite sua idade jovem gafonhoto: ");
        idade = in.nextDouble();

        if (idade <= 12 ) {
            System.out.println("Voce ainda é uma Criança. vá assistir Pepa Pig");
        }else if(idade <= 18){
            System.out.println("Você ja é um Adolescente");
        }else if(idade <= 59){
            System.out.println("Você é um Adulto triste igual a vida do Jonas ");
        }else {
            System.out.println("Você ja viveu o suficiente, hora de morrer né? Chega de viver de INSS");
        }

        System.out.println("Sempre aparecer");
    }
    
}
