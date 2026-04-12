import java.util.Scanner;

public class gabarito {

    public static void main(String[] args) {
        char [] gabarito = {'b', 'd', 'a', 'e', 'd'};
        char [] respostas = new char[5];
        int nota = 0;
        Scanner entrada = new Scanner(System.in);


        for (int i = 0; i < gabarito.length; i++) {
                System.out.printf("Informe a reposta da pergunta %d: ",i);
                respostas[i] = entrada.nextLine().charAt(0);
            }
        

        for (int i = 0; i < gabarito.length; i++) {
            if (gabarito[i] == respostas[i]) {
                nota += 1;
            }
        }
        System.out.printf("Nota: %d", nota);
    }
}