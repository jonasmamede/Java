import java.util.ArrayList;
import java.util.Scanner;

public class ListaNumeros {
    public static void main(String[] args) {
        // 1. Criar Scanner e ArrayList
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>(5);
        
        System.out.println("=== DIGITE NÚMEROS (0 para parar) ===");
        
        int cont = 0;
        while (cont <= 4) {
            System.out.println("Digite um numero: ");
            int num = entrada.nextInt();
            numeros.add(num);
            System.out.println(numeros);
            cont += 1;


            
        }
    }
}