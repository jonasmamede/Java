import java.util.Scanner;

public class calculadora {

    public static void soma(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int a = entrada.nextInt();
        System.out.println("Digite o segundo numero: ");
        int b = entrada.nextInt();
        int resultado = a+b;
        System.out.println("Soma: " + resultado);
    }

    public static void subtracao(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int a = entrada.nextInt();
        System.out.println("Digite o segundo numero: ");
        int b = entrada.nextInt();
        int resultado = a-b;
        System.out.println("Subtração: " + resultado);
    }

    public static void multiplicação(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int a = entrada.nextInt();
        System.out.println("Digite o segundo numero: ");
        int b = entrada.nextInt();
        int resultado = a*b;
        System.out.println("Multiplicação: " + resultado);
    } 

    public static void divisao(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int a = entrada.nextInt();
        System.out.println("Digite o segundo numero: ");
        int b = entrada.nextInt();
        int resultado = a/b;
        System.out.println("Divisão: " + resultado);
    }


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escola a operação que você deseja fazer: Soma (1), Sutração (2), Multiplicação (3) ou Divisão(4)");
        int escolha = entrada.nextInt();
        switch (escolha) {
            case 1: 
                soma();
                
                break;
            case 2:
                subtracao();
                break;

            case 3:
                multiplicação();
                break;

            case 4:
                divisao();
                break;
            default:
                System.out.println("Digite um numero válido!");
                break;
        }
        
    }
}
    
