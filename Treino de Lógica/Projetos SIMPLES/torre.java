import java.util.Scanner;

public class torre {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = entrada.nextInt();
        for (int i = 0; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                System.err.print("*");
            }
            System.out.println();
        }
    }
}
