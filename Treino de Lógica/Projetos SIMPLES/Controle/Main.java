import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Estoque estoque = new Estoque();
        while(true) {
        
        System.out.println("-----------------");
        System.out.println("Bem vindo ao controle de estoque");
        System.out.println("1 - Adicionar produtos");
        System.out.println("2 - Listar produtos");
        System.out.println("3 - Deletar produtos");
        System.out.println("4 - Atualizar produtos");
        System.out.println("5 - Encerrar programa");
        System.out.println("-----------------'");
        System.out.println("Escolha: ");
        int escolha = entrada.nextInt();
        if(escolha == 5){
            System.out.println("Programa encerrado");
            break;
        }
        switch(escolha){
            case 1:
                System.out.println();
                System.out.println("Quantidade de produtos que deseja cadastrar: ");
                int quant = entrada.nextInt();
                estoque.adicionarProduto(quant);
                break;
            case 2:
                System.out.println();
                System.out.println("------------------------");
                estoque.listarProdutos();
                break;
            case 3:
                System.out.println();
                System.out.println("Codigo: ");
                int codigo = entrada.nextInt();
                estoque.deletarProduto(codigo);
                break;
            case 4:
                System.out.println();
                System.out.println("Codigo: ");
                int codigo2 = entrada.nextInt();
                estoque.updateProduto(codigo2);
            default:
                System.out.println("Digite uma opção válida");
        }}

        /* System.out.println("Quantidade de produtos que deseja cadastrar: ");
        int quant = entrada.nextInt();
        estoque.adicionarProduto(quant);

        System.out.println("-----------------");
        estoque.listarProdutos();
        
        System.out.println("Codigo: ");
        int codigo = entrada.nextInt();
        estoque.deletarProduto(codigo);
        
        System.out.println("-----------------");
        estoque.listarProdutos();

        System.out.println("---------------------");
        System.out.println("Codigo: ");
        int codigo2 = entrada.nextInt();
        estoque.updateProduto(codigo);
        estoque.listarProdutos(); */
    }

}
