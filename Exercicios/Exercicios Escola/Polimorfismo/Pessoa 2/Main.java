public class Main {

    public static void main(String[] args) {

        Pessoa p = new Pessoa();

        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        p.saudacao(pessoa);
        p.saudacao(aluno);
        p.saudacao(professor);
    }
}