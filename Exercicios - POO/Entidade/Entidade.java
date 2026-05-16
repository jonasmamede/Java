public class Entidade {

    protected String nome;
    protected int vida;
    public Entidade(String nome, int vida){
        this.nome = nome;
        this.vida = vida;
    }
    protected void mostrarVida(){
        System.out.println("Vida: " + vida);
    }
}