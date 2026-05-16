import java.util.Scanner;
import java.util.Random;

public class JogoDeNumeros {
    public static void nivel1() {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        int aleatorio = random.nextInt(51);
        System.out.println("Você Escolheu o Modo FÁCIL!");
        int contador = 0;

        while (true) {
            
            System.out.println("\nDigite um numero: ");
            int numero = entrada.nextInt();
            contador += 1;
            if (numero == aleatorio) {
                System.out.println("Você acertou!");
                System.out.println("Número de tentativas até o acerto: " + contador);
                break;
            }
            if(numero > 50){
                System.out.println("O numero digitado é maior que 50! Tente outro!");
            }else if (numero > aleatorio) {
                System.out.println("Errou! O número correto é MENOR!");
            }else if (numero < aleatorio) {
                System.out.println("Errou! O número correto é MAIOR!");
            }
            
            System.out.println("Número de tentativas: " + contador);
            
        }
    }

    public static void nivel2() {
            Scanner entrada = new Scanner(System.in);
            Random random = new Random();
            int aleatorio = random.nextInt(101);
            System.out.println("Você Escolheu o Modo MÉDIO!");
            int contador = 0;

            while (true) {
                System.out.println("\nDigite um numero: ");
                int numero = entrada.nextInt();
                contador += 1;
                if (numero == aleatorio) {
                    System.out.println("Você acertou!");
                    System.out.println("Número de tentativas até o acerto: " + contador);
                    break;
                }
                if(numero > 100){
                    System.out.println("O numero digitado é maior que 100! Tente outro!");
                }else if (numero > aleatorio) {
                    System.out.println("Errou! O número correto é MENOR!");
                }else if (numero < aleatorio) {
                    System.out.println("Errou! O número correto é MAIOR!");
                }
                
                System.out.println("Número de tentativas: " + contador);
            }
        }



public static void nivel3() {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        int aleatorio = random.nextInt(1001);
        System.out.println("Você Escolheu o Modo DIFÍCIL!");
        int contador = 0;
        

        while (true) {
            System.out.println("\nDigite um numero: ");
            int numero = entrada.nextInt();
            contador += 1;
            if (numero == aleatorio) {
                System.out.println("Você acertou!");
                System.out.println("Número de tentativas até o acerto: " + contador);
                break;
            }
            if(numero > 1000){
                System.out.println("O numero digitado é maior que 1000! Tente outro!");
            }else if (numero > aleatorio) {
                System.out.println("Errou! O número correto é MENOR!");
            }else if (numero < aleatorio) {
                System.out.println("Errou! O número correto é MAIOR!");
            }
            
            System.out.println("Número de tentativas: " + contador);
        }
    }






    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("=====================================");
        System.out.println("  JOGO DE ADIVINHAÇÃO DE NÚMEROS");
        System.out.println("=====================================\n");

        System.out.println("Tente descobrir o número secreto!");
        System.out.println("Você receberá dicas se o número é maior ou menor.\n");

        System.out.println(" ESCOLHA A DIFICULDADE:\n");

        System.out.println("1  FÁCIL   -> Números de 1 a 50");
        System.out.println("2  MÉDIO   -> Números de 1 a 100");
        System.out.println("3  DIFÍCIL -> Números de 1 a 1000");

        System.out.println("\nDigite sua escolha: ");
        System.out.println("-------------------------------------");
        int dificuldade = entrada.nextInt();
        
        switch (dificuldade) {
            case 1:
                nivel1();
                break;
            case 2: 
                nivel2();
                break; 
            case 3:
                nivel3();
                break;
            default:
                System.out.println("Digite um número VÁLIDO");
                break;
            }   
            
        
    }


}
