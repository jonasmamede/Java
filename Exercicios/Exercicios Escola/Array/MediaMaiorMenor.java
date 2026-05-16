import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MediaMaiorMenor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();

        int cont = 1;
        while (cont < 5) {
            System.out.println("Digite um numero: ");
            int num = entrada.nextInt();
            numeros.add(num);
            cont += 1;
        }

        int soma = 0;
        int maior = numeros.get(0);
        int menor = numeros.get(0);

        for(int nume : numeros){
            soma += nume;
            if (maior < nume) {
                maior = nume;
            };
            if (nume < menor) {
                menor = nume;
            };
        };
        int media = soma / 5;

        System.out.println("A média dos numeros do array é : " + media);
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor numero é: " + menor);
        entrada.close();
    }
}
