public class Personagem{
    public String nome;
    public int vida;
    
    public Personagem(String nome, int vida){
        this.nome = nome;
        this.vida = vida;
    }

    public void atacar(){
        System.out.println("Atacando!");
    }
    public String toString(){
        return "Atacando!";
    }
}