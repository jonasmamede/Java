
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Estoque estoque = new Estoque();
        System.out.println("Nome do produto: ");
        String nome = entrada.nextLine();
        Produtos p = new Produtos(nome);
        Produtos Nome = nome;
        estoque.adicionarProduto(p);
    }

}
