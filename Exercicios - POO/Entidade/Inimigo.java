public class Inimigo extends Entidade{
    public String tipo;
    public Inimigo(String nome, int vida, String tipo){
        super(nome, vida);
        this.tipo = tipo;
    }
    public void atacar(){
        System.out.println("Ataque realizado com sucesso!");
    }
}