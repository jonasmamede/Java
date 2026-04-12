/*Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais, segundo a fórmula: */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Double x1 = entrada.nextDouble();
        Double y1 = entrada.nextDouble();

        Double x2 = entrada.nextDouble();
        Double y2 = entrada.nextDouble();

        Double calcX = (x2 - x1);
        Double potX = Math.pow(calcX, 2);

         Double calcY = (y2 - y1);
        Double potY = Math.pow(calcY, 2);

        Double soma = potX+potY;

        Double raizQ = Math.sqrt(soma);

        System.out.printf("%.4f%n", raizQ);
    }
}
