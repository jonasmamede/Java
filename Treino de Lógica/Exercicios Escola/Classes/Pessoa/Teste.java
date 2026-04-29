public class Teste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Jonas";
        aluno1.cpf = "745.567.321-99";
        aluno1.fone = "(85) 98863-5992";
        aluno1.saudacao();
        System.out.println("----------------------");

        Funcionario funcionario1 = new Funcionario();
        funcionario1.nome = "Carlos";
        funcionario1.cpf = "356.782.478-34";
        funcionario1.fone = "(11) 9457-4567";
        funcionario1.cod = 432678;
        funcionario1.funcao = "Atendente";
        funcionario1.saudacao();   
        funcionario1.desempenhaFuncao();     
    }
}
