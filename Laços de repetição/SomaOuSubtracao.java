import java.util.Scanner;

public class SomaOuSubtracao{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num1 = entrada.nextInt();
        System.out.println("Digite outro numero: ");
        int num2 = entrada.nextInt();

        if (num1 > num2) {
            int sub = num1 - num2;
            System.out.println(sub);
        }else if(num2 > num1){
            int soma = num2 + num1;
            System.out.println(soma);
        }
    }
}