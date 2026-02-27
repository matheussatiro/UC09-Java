package aual7;

public class loops {
    
    public static void countdown(int num){
    int n= 0;

    while (n != num) {
        System.out.println(n);
        n++;
    }
     
    System.out.println("BOOM!");
    }

public static void sequence(int n) {
    while (n != 1) {
        System.out.println(n);
        if(n%2==0) n = n /2;
        else n = n * 3 +1;
    }
    System.out.println(n);
}

public static void appreciate(){
    int i = 10000000;
    while (i >= 0) {
        System.out.print(i + ", ");
        i -=2;
    }
}
public static void appreciate2(){

    for (int i = 2; i <= 8; i+= 2){
        System.out.print(i + ", ");
    }
}

public static void loopvar(){
    int n;
    for (n = 3; n > 0; n--){
        System.out.println("valor de n: " + n);
    }
}

public static void nested(){
    for (int x = 1; x <=10; x++){
      for (int y = 1; y <=10; y++){
        System.out.printf("%5d" , x * y);
      }
    }
}
    public static void main(Strings[] args) {
        int num = 10;
        // sequence (3)
        // appreciate();
        //appreciate2();
        //loopvar();
        nested();
        System.out.println("Sistema Finalizado.");
    }


}


    