import java.util.Scanner;

public class MaiorDeDoisNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int a = entrada.nextInt();
        System.out.println("Digite outro numero: ");
        int b = entrada.nextInt();
        if (a > b) {
            System.out.println("O maior numero é: " + a);
        } else if (b > a) {
            System.out.println("O maior numero é: " + b);
        } else {
            System.out.println("Os numeros são iguais");
        }
    }   
}
