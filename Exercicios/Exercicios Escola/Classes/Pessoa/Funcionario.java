public class Funcionario extends Pessoa{
    public int cod;
    public String funcao;

    void desempenhaFuncao(){
        System.out.println("Desempenha função: " + funcao);
    }
}
