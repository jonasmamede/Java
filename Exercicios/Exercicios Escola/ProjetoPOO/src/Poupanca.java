public class Poupanca extends Investimento {
    public Poupanca(double valorInicial, int tempoMeses) {
        super("Poupança", 0.005, valorInicial, tempoMeses);
    }

    @Override
    public double calcularRetorno() throws ValorInvalidoException, TempoInvalidoException {
        if (getValorInicial() <= 0) {
            throw new ValorInvalidoException("Valor inicial deve ser maior que zero.");
        }
        if (getTempoMeses() <= 0) {
            throw new TempoInvalidoException("Tempo em meses deve ser maior que zero.");
        }

        double taxaMensal = getTaxaAnual() / 12;
        double valorFinal = getValorInicial();

        for (int i = 0; i < getTempoMeses(); i++) {
            valorFinal = valorFinal * (1 + taxaMensal);
        }

        return valorFinal;
    }

    @Override
    public String obterDescricao() {
        return "Poupança - Investimento de baixo risco com rendimento de 0,5% ao ano.";
    }
}
