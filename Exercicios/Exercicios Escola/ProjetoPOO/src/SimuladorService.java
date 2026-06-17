import java.util.ArrayList;
import java.util.List;

public class SimuladorService {
    private List<String> historico;

    public SimuladorService() {
        this.historico = new ArrayList<>();
    }

    public double simularInvestimento(String tipo, double valor, int tempo)
            throws ValorInvalidoException, TempoInvalidoException {

        if (valor <= 0) {
            throw new ValorInvalidoException("Valor investido deve ser maior que zero.");
        }
        if (tempo <= 0) {
            throw new TempoInvalidoException("Tempo em meses deve ser maior que zero.");
        }

        Investimento investimento;

        switch (tipo) {
            case "Poupança":
                investimento = new Poupanca(valor, tempo);
                break;
            case "CDB":
                investimento = new CDB(valor, tempo);
                break;
            case "Tesouro Direto":
                investimento = new TesouroDireto(valor, tempo);
                break;
            default:
                throw new IllegalArgumentException("Tipo de investimento desconhecido.");
        }

        double valorFinal = investimento.calcularRetorno();
        adicionarAoHistorico(tipo, valor, tempo, valorFinal);

        return valorFinal;
    }

    public List<String> compararInvestimentos(double valor, int tempo)
            throws ValorInvalidoException, TempoInvalidoException {

        if (valor <= 0) {
            throw new ValorInvalidoException("Valor investido deve ser maior que zero.");
        }
        if (tempo <= 0) {
            throw new TempoInvalidoException("Tempo em meses deve ser maior que zero.");
        }

        List<String> resultados = new ArrayList<>();

        Poupanca poupanca = new Poupanca(valor, tempo);
        CDB cdb = new CDB(valor, tempo);
        TesouroDireto tesouro = new TesouroDireto(valor, tempo);

        double valPoupanca = poupanca.calcularRetorno();
        double valCDB = cdb.calcularRetorno();
        double valTesouro = tesouro.calcularRetorno();

        resultados.add(String.format("INVESTIMENTO          VALOR FINAL\n"));
        resultados.add(String.format("Poupança              R$ %.2f\n", valPoupanca));
        resultados.add(String.format("CDB                   R$ %.2f\n", valCDB));
        resultados.add(String.format("Tesouro Direto        R$ %.2f\n", valTesouro));

        String melhor = encontrarMelhorInvestimento(valPoupanca, valCDB, valTesouro);
        resultados.add(String.format("\nMelhor investimento encontrado:\n%s", melhor));

        adicionarAoHistorico("Comparação", valor, tempo, Math.max(Math.max(valPoupanca, valCDB), valTesouro));

        return resultados;
    }

    private String encontrarMelhorInvestimento(double poupanca, double cdb, double tesouro) {
        if (cdb > poupanca && cdb > tesouro) {
            return "CDB";
        } else if (tesouro > poupanca && tesouro > cdb) {
            return "Tesouro Direto";
        } else {
            return "Poupança";
        }
    }

    public void adicionarAoHistorico(String tipo, double valor, int tempo, double resultado) {
        String registro = String.format("%s | R$ %.2f | %d meses | R$ %.2f",
                tipo, valor, tempo, resultado);
        historico.add(registro);
    }

    public List<String> obterHistorico() {
        return new ArrayList<>(historico);
    }

    public void limparHistorico() {
        historico.clear();
    }
}
