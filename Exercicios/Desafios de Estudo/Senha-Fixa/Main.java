import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int senha = 2002;

        while (true) {
            int senhaDigitada = entrada.nextInt();
            if (senhaDigitada==senha) {
                System.out.println("Acesso Permitido");
                break;
            }else{
                System.out.println("Senha Invalida");
            }
        }
    }
}