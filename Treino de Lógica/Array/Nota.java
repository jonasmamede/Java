import java.util.ArrayList;
import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> notas = new ArrayList<>();

        int media = 0;
        for (int i = 0; i < 6; i++) {
            System.out.println("Digite: ");
            int escreva = entrada.nextInt();
            if (escreva >= 7) {
                notas.add(escreva);
            }
            media+= escreva;
        }

        System.out.println("Quantidade de notas aprovadas: " + notas.size());
        System.out.println("Média: "+ media/5);
    }
}
