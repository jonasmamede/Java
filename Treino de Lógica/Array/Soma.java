import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int [] numeros = new int[5];
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um numero: ");
            numeros[i] = entrada.nextInt();
        };

        for (int i = 0; i < numeros.length; i++) {
            soma+=numeros[i];
        }
        System.out.println(soma);
    }    

    
}
