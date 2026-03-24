import java.util.Scanner;

public class inverso {
    public static void numeroinverso() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = entrada.nextInt();
        int inverso = 0;

        while (num > 0) {
            int digito = num % 10;
            inverso = inverso * 10 + digito;
            num = num / 10;
        }

        System.out.println(inverso); 
    }
    
    public static void main(String[] args) {
        numeroinverso();
    }
}
