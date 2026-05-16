import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> inventario = new ArrayList<>();
        Item madeira = new Item("Madeira", 5);
        Item pedra = new Item("Pedra", 10);
        Item ferro = new Item("Ferro", 19);
        Item carne = new Item("Carne", 45);
        Item espada = new Item("Espada", 1);
        Item cobre = new Item("Cobre",28);

        inventario.add(madeira);
        inventario.add(pedra);
        inventario.add(ferro);
        inventario.add(carne);
        inventario.add(espada);
        inventario.add(cobre);

        for (Item item : inventario) {
            item.mostrarItem();
        }

        System.out.println();
    }
}
