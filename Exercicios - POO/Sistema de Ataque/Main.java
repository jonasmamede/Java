public class Main {
    public static void main(String[] args) {
        Ataque ataque = new Ataque();
        Boladefogo boladefogo = new Boladefogo();
        AtaqueEspada espadada = new AtaqueEspada();
        Flecha flechada = new Flecha();
        RaioSombrio raio = new RaioSombrio();

        Object [] ataques = new Object[5];
        ataques [0] = ataque;
        ataques [1] = boladefogo;
        ataques [2] = espadada;
        ataques [3] = flechada;
        ataques [4] = raio;

        for (Object object : ataques) {
            System.out.println(object);
        }
    }
}
