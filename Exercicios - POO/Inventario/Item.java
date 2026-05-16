
public class Item {
    public String nome;
    public int quantidade;

    public Item(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public void mostrarItem(){
        System.out.println(nome + " - " + quantidade);
    }

    public void remover(String item){
        inventario.remove(item);
    }

}