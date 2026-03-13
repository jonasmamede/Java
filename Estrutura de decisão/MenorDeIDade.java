import java.util.Scanner;

public class MenorDeIDade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Digite o seu ano de nascimento: ");
        int idade = entrada.nextInt();
        int maioridade = 2026-idade;
        if (maioridade >= 18) {
            System.out.println("Olá, "+ nome+ ". Acesso Permitido." );
        }else{
            System.out.println("Olá, "+ nome+ ". Acesso Negado.");
        }
    }
}
