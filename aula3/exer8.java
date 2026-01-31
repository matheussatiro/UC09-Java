package aula3;

import java.util.Scanner;

public class exer8 {

    public static void main(String[] args) {
        Scanner doublScanner = new Scanner(System.in);
    

        System.out.println("Digite uma temperatura em Fahrenheit para converter para celcius");
        Double Fahrenheit = doublScanner.nextDouble();
      

        Double celcius = (Fahrenheit - 32) * 5 / 9;

        System.out.printf("A temperatura em Celsius é %.2f%n", celcius);
        



    }
    
}
