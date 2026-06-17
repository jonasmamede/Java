public abstract class Investimento {
    private String nome;
    private double taxaAnual;
    private double valorInicial;
    private int tempoMeses;
    
    public Investimento(String nome, double taxaAnual, double valorInicial, int tempoMeses) {
        this.nome = nome;
        this.taxaAnual = taxaAnual;
        this.valorInicial = valorInicial;
        this.tempoMeses = tempoMeses;
    }
    
    public abstract double calcularRetorno() throws ValorInvalidoException, TempoInvalidoException;
    
    public abstract String obterDescricao();
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getTaxaAnual() {
        return taxaAnual;
    }
    
    public void setTaxaAnual(double taxaAnual) {
        this.taxaAnual = taxaAnual;
    }
    
    public double getValorInicial() {
        return valorInicial;
    }
    
    public void setValorInicial(double valorInicial) {
        this.valorInicial = valorInicial;
    }
    
    public int getTempoMeses() {
        return tempoMeses;
    }
    
    public void setTempoMeses(int tempoMeses) {
        this.tempoMeses = tempoMeses;
    }
}
