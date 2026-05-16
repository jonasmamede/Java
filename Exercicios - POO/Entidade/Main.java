public class Main {
    public static void main(String[] args) {
        Heroi heroi = new Heroi("Sasq", 100, 50);
        Inimigo inimigo = new Inimigo("Clark", 500, "Orc");

        heroi.usarMagia();
        heroi.mostrarVida();
        System.out.println("-------------------------");
        inimigo.atacar();
        inimigo.mostrarVida();
    }
}
