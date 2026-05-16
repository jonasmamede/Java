/*Dado o tipo de chá real e as respostas fornecidas, determinar o número de participantes que receberam a resposta correta. */

package TipoDeCha;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> tipocha = new ArrayList<>();
        int soma = 0;
        int T = entrada.nextInt();
        int A = entrada.nextInt();
        int B = entrada.nextInt();
        int C = entrada.nextInt();
        int D = entrada.nextInt();
        int E = entrada.nextInt();
        tipocha.add(A);
        tipocha.add(B);
        tipocha.add(C);
        tipocha.add(D);
        tipocha.add(E);
        for (int i = 0; i < tipocha.size(); i++) {
            if (tipocha.get(i) == T) {
                soma += 1;
            }
        }
        System.out.println(soma);
    }
}