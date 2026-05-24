public class Arqueiro extends Personagem {
    public Arqueiro(String nome, int vida){
        super(nome, vida);
    }
    
    @Override
    public void atacar(){
        System.out.println("Arqueiro -> Flechada");
    }

    public String toString(){
        return "Arqueiro -> Flechada";
    }
}
