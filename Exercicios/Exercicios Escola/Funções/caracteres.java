import java.util.Scanner;

public class caracteres {
    public static void mostrar() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = entrada.nextLine();
        char [] letras = palavra.toCharArray();
        System.err.println("A palavra digitada tem: "+letras.length + " caracteres!");
    }
    public static void main(String[] args) {
        mostrar();
    }
}
