package aula3;

import java.util.Scanner;


class exer3 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
    System.out.println("Digite a base de um retangulo");
    double base = sc.nextDouble();

    System.out.println("Digite a altura do retangulo");
    double altura = sc.nextDouble();

    double area = base * altura;

    System.out.println("A area do retangulo é " + area);
    
}
    
}
