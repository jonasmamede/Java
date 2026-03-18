import java.util.Scanner;

public class ConsoantesFrase {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String frase = entrada.nextLine().toLowerCase();

        int cont = 0;
        String consoantes = "";

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            if (c >= 'a' && c <= 'z') {
                if (c!='a' && c!='e' && c!='i' && c!='o' && c!='u') {
                    cont++;
                    consoantes += c + " ";
                }
            }
        }

        System.out.println("Quantidade de consoantes: " + cont);
        System.out.println("Consoantes: " + consoantes);
    }
}