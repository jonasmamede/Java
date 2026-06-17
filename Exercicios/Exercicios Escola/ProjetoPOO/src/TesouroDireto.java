public class TesouroDireto extends Investimento {
    public TesouroDireto(double valorInicial, int tempoMeses) {
        super("Tesouro Direto", 0.065, valorInicial, tempoMeses);
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
        return "Tesouro Direto - Investimento de risco baixo com rendimento de 6,5% ao ano.";
    }
}
