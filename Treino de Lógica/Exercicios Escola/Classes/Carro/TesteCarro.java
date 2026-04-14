public class TesteCarro {
    public static void main(String[] args) {
        ModeloCarro novoCarro = new ModeloCarro();
        novoCarro.modelo ="Toyota";
        novoCarro.ano=2021;
        novoCarro.placa ="14D9BS2";
        novoCarro.localizarCarro();
        System.out.println(novoCarro);
    }
}
