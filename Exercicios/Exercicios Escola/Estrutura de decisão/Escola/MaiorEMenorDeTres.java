import java.util.Scanner;

public class MaiorEMenorDeTres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int a = entrada.nextInt();
        System.out.println("Digite outro numero: ");
        int b = entrada.nextInt();
        System.out.println("Digite outro numero: ");
        int c = entrada.nextInt();
        if (a > b && a > b){
            System.out.println("Maior numero: " + a);
        }else if(b > a && b > c){
            System.out.println("Maior numero: " + b);
        }else if(c > a && c > b){
            System.out.println("Maior numero: " + c);
        }else{

        };

        if (a < b && a < b){
            System.out.println("Menor numero: " + a);
        }else if(b < a && b < c){
            System.out.println("Menor numero: " + b);
        }else if(c < a && c < b){
            System.out.println("Menor numero: " + c);
        } else{
            
        };

        if (a == b && b == c) {
            System.out.println("Todos os numeros são iguais");
        }
    };
}
