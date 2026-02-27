package aula5;

public class exer {

    public static void calcularDistancia(double t1, double w1, double t2, double w2) {
        
    }
           //Exemplo de desenvolvimento incremental:

        //Calcular a distância entre dois pontos

        //Distancia dada por : dist = (x2 - x1)^ (y2 - y1)^2}^1/2
    public static void main(String[] args) {
        //declaração de variáveis
        double x1,x2,y1,y2;
        double distx,disty,dx,dy,resultado;

        x1 = 0;
        y1 = 1;
        x2 = 0;
        y2 = 1;
        dx = x2 -x1;
        dy = y2 - y1;
        distx = Math.pow(dx, 2.0);
        disty = Math.pow(dy, 2.0);
        calcularDistancia(x1, x2, y1, y2);
        

        System.out.println("Distancia do eixo x: " + distx);
        System.out.println("Distancia do eixo y: " + disty);
        resultado = Math.sqrt((distx + disty));
        System.out.println(resultado);
    }

}
