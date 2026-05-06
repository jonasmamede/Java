public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.saudacao("aluno");
        System.out.println("----------------");
        pessoa.saudacao("professor");
        System.out.println("----------------");
        pessoa.saudacao("outro");
    }
}