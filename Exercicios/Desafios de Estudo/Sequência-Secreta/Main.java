//Neste problema, dada a sequência original de números desenhados no chão da calçada, seu programa deve computar e imprimir a quantidade máxima de números da sequência que poderiam ser marcados com um círculo sem que haja dois números iguais consecutivos na sequência marcada.4

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();
        int quantidade = entrada.nextInt();
        int soma = 0;

        //Preenche o array.
        for (int i = 0; i < quantidade; i++) {
            int numero = entrada.nextInt();
            num.add(numero);
        }
        
        //verificia se a condição pedinte é verdadeira.
        for (int i = 0; i < num.size(); i++) {
            if (i == 0 || !num.get(i).equals(num.get(i - 1))) {
            soma++;
            }
        }
        
        System.out.println(soma);
    }
}