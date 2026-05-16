import java.util.Scanner;

public class OrdenarTresNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double a = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double b = scanner.nextDouble();
        System.out.print("Digite o terceiro número: ");
        double c = scanner.nextDouble();

        // ordenar os três valores
        double temp;
        if (a > b) {
            temp = a; a = b; b = temp;
        }
        if (a > c) {
            temp = a; a = c; c = temp;
        }
        if (b > c) {
            temp = b; b = c; c = temp;
        }

        System.out.println("Números em ordem crescente:");
        System.out.println(a + " " + b + " " + c);
        scanner.close();
    }
}