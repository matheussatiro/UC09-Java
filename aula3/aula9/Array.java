package aula9;
import java.util.Arrays;
public class Array {


    public static void printArray(int[] a) {
        // for (int pika = 0; pika < 4;pika++){
        // System.out.println(a[pika]);

        }
    }
    public static void main(String[] args) {
        
        //inicialização dos vetores:
        int[] counts; // um Array ou vetor de int's
        double [] values; // um array ou vetor de double's
        
        int size = 10;

        //criação dos vetores:
        counts = new int [4]; //har array tamanho fixo;
        values = new double[size]; //um  array com tamanho variável.
        
        //inicialização com atribuição de valores;
        int[] a = {1, 2, 3, 4};
        int[] b = {1, 2, 3, 4, 5};
        counts[0] = 7;
        counts[1] = counts[0]*2;
        counts[2]++;
        counts[3] -=60;

        //printArray(counts);

        System.out.println(Arrays.toString(counts));
        
        // for (int pika = 0; pika < 4;pika++){
        // System.out.println(counts[pika]);
        // }
       
       
        //int i = 0;
        //while (i < 4) {
        //    System.out.println(counts[i]);
        //    System.out.println("o valor do i: " + i);
        //    i++;
        //}
    


    }
}
