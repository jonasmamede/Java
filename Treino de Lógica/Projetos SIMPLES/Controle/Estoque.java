import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {
    ArrayList <Produtos>produtosList = new ArrayList<>();
    Scanner entrada = new Scanner(System.in);
    public void adicionarProduto(int quant){
        for (int i = 0; i < quant; i++) {
            Produtos prod = new Produtos();
            System.out.println("Código " + (i+1) + ": ");
            prod.Codigo = entrada.nextInt();
            entrada.nextLine();

            System.out.println("");
            System.out.println("Produto " + (i+1) + ": ");
            prod.Nome = entrada.nextLine();
            System.out.println("");

            System.out.println("Quantidade " + (i+1) + ": ");
            prod.Quantidade = entrada.nextInt();
            produtosList.add(prod);
            System.out.println("");
            System.out.println("Preço Unitário" + (i+1) + ": ");
            prod.Preco = entrada.nextDouble();
            System.out.println("---------------------------");
        }
    }
    public void listarProdutos(){
        for (int i = 0; i < produtosList.size(); i++) {
            Produtos p = produtosList.get(i);
            System.out.println((i+1) + " - "+ p.Codigo + " // " + p.Nome + " // Quantidade - " + p.Quantidade + "x // " + p.Preco + "$");
        }
    }
}
