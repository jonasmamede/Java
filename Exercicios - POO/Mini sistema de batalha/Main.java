public class Main {
    public static void main(String[] args) {
        Personagem generico = new Personagem("Boneco", 0);
        Mago mago = new Mago(null, 0);
        Guerreiro guerreiro = new Guerreiro(null, 0);
        Arqueiro arqueiro = new Arqueiro(null, 0);
        Object [] classes = new Object[4];
        classes[0] = generico;
        classes[1] = guerreiro;
        classes[2] = mago;
        classes[3] = arqueiro;
        for (Object object : classes) {
            System.out.println(object);
        }
    }
}
