package aula3;

import java.util.Scanner;

class Matematica {

    public static void main(String[] args) {
        // area circulo: PI r^2
        //Declarações de variavel
        Scanner entradaUsuario = new Scanner(System.in);
        //double x;
        double diam;
        //double raio;
        double resultado;
        double quad = Math.pow(2.0, 3.0);

        

        
        
        //x= Math.PI;
        
        System.out.println("Digite o diametro");
        diam = entradaUsuario.nextDouble();
        //raio = diam/2;
        resultado=(Math.pow(diam/2, 2.0) * Math.PI);
        System.out.println("O resultado é " + (resultado));

    }
    
}
