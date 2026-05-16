public class Personagem{
    public String nome;
    public int vida;
    public int ataque;

    public Personagem(String nome, int vida, int ataque){
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
    }

    public void mostrarStatus (){
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
        System.out.println("Ataque: " + ataque);
    }

    public void atacar(){
        System.out.println(nome + " Atacou e deu " + ataque +" de dano!");
    }
}