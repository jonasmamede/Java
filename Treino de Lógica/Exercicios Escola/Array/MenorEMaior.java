import java.util.Arrays;
import java.util.Scanner;

public class MenorEMaior {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int [] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("");
            numeros[i] = entrada.nextInt();
        }
        Arrays.sort(numeros);
        System.out.println(numeros[0]);
        System.out.println(numeros[9]);
    }
}
