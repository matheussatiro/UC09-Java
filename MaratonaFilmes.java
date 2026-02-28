package aula6;

import java.util.Scanner;


public class MaratonaFilmes {

public static void exibirCabecalho(){

    System.out.printf("--------------------------------------- \n BEM VINDO.\n--------------------------------------- \n");


}

public static double calcularTempoTotal (double filmed, double tothour){
 return filmed * tothour;
}

public static void classificarMaratona(double filmed, double tothour) {
    if (calcularTempoTotal(filmed, tothour) < 4 ) {
            System.out.println("Maratona Leve");
        }else if (calcularTempoTotal(filmed, tothour) > 8){
            System.out.println("Maratona Épica!!");
        }else{
            System.out.println("Maratona Moderada");
        }
}


 
    public static void main(String[] args) {
        
    
        Scanner in = new Scanner(System.in);
        String user;
        int filmnum;
        double tothour;
        double media;
        
        
        //Declarando Variaveis
        
        exibirCabecalho();
        
        System.out.printf("Ola, Esse o seu, nosso de todos. Super organizador de marafilmns, Digite seu nome: \n");
        user = in.nextLine();

        System.out.printf("Agora digite a quantidade de filmes que voce espera assisitir no dia de hoje: ");
        filmnum = in.nextInt();

        double filmed = filmnum; //aqui estou convertendo o int para double, para conseguir multiplicar double com double

        System.out.printf("Quantas horas durará cada filme? ");
        tothour = in.nextDouble();

        //aqui o usuario me deu todas as informações necessarias.

        System.out.printf("A média de horas que você ficará assistindo hoje é: ");
       
        
        //media =(filmed * tothour);
        //System.out.println(media);
        //media = calcularTempoTotal(filmed, tothour);
        System.out.println(calcularTempoTotal(filmed, tothour));
        //estou multiplicando o double com double que eu converti

        classificarMaratona(filmed, tothour);


        //if (calcularTempoTotal(filmed, tothour) < 4 ) {
        //    System.out.println("Maratona Leve");
        //}else if (calcularTempoTotal(filmed, tothour) > 8){
        //    System.out.println("Maratona Épica!!");
        //}else{
        //    System.out.println("Maratona Moderada");
        //}
    
    }
    
}
