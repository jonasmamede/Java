import java.util.Arrays;
import java.util.Scanner;

public class JuntarVetores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[20];
        int[] vetor3 = new int[30];

        for(int i = 0; i < 10; i++) {
            System.out.println("Vetor1 posição " + i + ":");
            vetor1[i] = entrada.nextInt();
        }

        for(int i = 0; i < 20; i++) {
            System.out.println("Vetor2 posição " + i + ":");
            vetor2[i] = entrada.nextInt();
        }

        for(int i = 0; i < 10; i++) {
            vetor3[i] = vetor1[i];
        }

        for(int i = 0; i < 20; i++) {
            vetor3[i+10] = vetor2[i];
        }

        Arrays.sort(vetor3);

        for(int i = 0; i < vetor3.length; i++) {
            System.out.println(vetor3[i]);
        }
    }
}