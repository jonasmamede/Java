import java.util.Scanner;

public class lacoderepeticao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = entrada.nextInt();
        int cont = 0;

        while (cont <= 100) {
            System.out.println(num);
            num += 6;
            cont+=1;
        }

    }
}