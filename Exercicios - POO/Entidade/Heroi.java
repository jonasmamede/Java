public class Heroi extends Entidade {
    public int mana;

    public Heroi(String nome, int vida, int mana) {
        super(nome, vida);
        this.mana = mana;
    }

    public void usarMagia() {
        if (mana > 30) {
            System.out.println("Magia usada com sucesso!");
        }else{
            System.out.println("Magia falha!");
        }
    }
}