import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Double n = 3.14159;
        Double raio = entrada.nextDouble();
        Double raioC = Math.pow(raio, 2);
        Double area = n*raioC;
        System.out.printf("A=%.4f%n", area);
    }
}
