
import java.util.Scanner;

public class senha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String senhacorreta = "1234";

        while (true) {
            System.out.println("Digite a senha: ");
            String digitado = entrada.nextLine();

            if (digitado.equals(senhacorreta)) {
                System.out.println("Acesso Permitido");
                break;
            } else {
                System.out.println("Acesso negado");

            }
        }
    }
}
