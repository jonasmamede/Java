import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Estoque estoque = new Estoque();
        System.out.println("Quantidade de produtos que deseja cadastrar: ");
        int quant = entrada.nextInt();
        estoque.adicionarProduto(quant);

        System.out.println("-----------------");
        estoque.listarProdutos();
        
        System.out.println("Codigo: ");
        int codigo = entrada.nextInt();
        estoque.deletarProduto(codigo);
        
        System.out.println("-----------------");
        estoque.listarProdutos();
    }

}
