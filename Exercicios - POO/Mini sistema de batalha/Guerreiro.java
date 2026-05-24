public class Guerreiro extends Personagem {
    public Guerreiro(String nome, int vida){
        super(nome, vida);
    }
    
    @Override
    public void atacar(){
        System.out.println("Guerreiro -> Espadada");
    }

    public String toString(){
        return "Guerreiro -> Espadada";
    }
}
