import java.util.Scanner;

public class FrequenciaDeNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //array contador: indice = numero, valor = frequencia
        int [] contador = new int[10];
        System.out.println("Digite 20 numeros de 0 - 9");

        //lê 20 numeros
        for (int i = 0; i < 20; i++) {
            System.out.println("Numero " + (i+1) + ":");
            int numero = entrada.nextInt();

            //garante que seja 0-9
            if (numero >= 0 && numero <= 9) {
                contador[numero]++; //incrementa frequencia
            }
        }

        //mostra apenas os que aparecem (frequencia > 0)
        System.out.println("\nFrequência dos números:");
        boolean primeiro = true;
        for (int i = 0; i < 10; i++) {
            if (contador[i] > 0) {
                if (!primeiro) {
                    System.out.println(", ");
                }
                System.out.println(i + "=" + contador[i]);
                primeiro = false;
            }
        }
        System.out.println();
        entrada.close();
    }
}
