package lista;

import java.util.Scanner;

public class exer9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
    
        String login;
        int senha;

        System.out.println("Digite seu login");
        login = in.nextLine();

        System.out.println("Agora digite sua senha");
        senha = in.nextInt();

        if(login.equals("admin") && (senha == 1234)){
            System.out.println("Seja bem vindo ao seu site de cassino legalizado");
        }else{
            System.out.println("login ou senha incorreta");
        }

    }
}
