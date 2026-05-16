import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ParEImparRandom {
    public static void main(String[] args) {
        int [] numeros = new int[15];
        ArrayList<Integer> par = new ArrayList<>(); 
        ArrayList<Integer> impar = new ArrayList<>(); 

        Random gerador = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = gerador.nextInt(100);
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]%2 == 0) {
                par.add(numeros[i]);
            }else if (numeros[i] %2 != 0) {
                impar.add(numeros[i]);
            }
        }

        System.out.println("Numeros pares: " + par);

        System.out.println("NUmeros Impares: " + impar);
    }
}
