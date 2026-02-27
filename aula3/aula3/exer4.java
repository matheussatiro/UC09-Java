package aula3;

import java.net.Socket;

public class exer4 {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;
        int temp;

        temp = a;
        a = b;
        b = temp;

        
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("temp = "+temp);
    }
    
}
