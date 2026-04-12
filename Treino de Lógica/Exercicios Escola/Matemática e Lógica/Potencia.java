import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite um numero: ");
    int num1 = entrada.nextInt();
    System.out.println("Digite outro numero: ");
    int num2 = entrada.nextInt();
    int cont = 1;

    while (cont <=num2) {
        System.out.println(num1);
        num1 = num1*num1;
        cont +=1;
        
        
    }

    }
}
