import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int N = entrada.nextInt();
        int M = entrada.nextInt();
        int diferenca = N-M;
        System.out.println(diferenca);
    }
}
