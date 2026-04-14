import java.time.LocalTime;

public class Aluno {

    String nome;
    String dtNascimento;
    String telefone;
    String nomeResponsavel;

    public Aluno(String nome, String dtNascimento, String telefone, String nomeResponsavel) {
        this.nome = nome;
        this.dtNascimento = dtNascimento;
        this.telefone = telefone;
        this.nomeResponsavel = nomeResponsavel;
    }

    public void apresentar() {
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dtNascimento);
        System.out.println("Telefone: " + telefone);
        System.out.println("Responsável: " + nomeResponsavel);
    }

    public void saudacao() {
        int hora = LocalTime.now().getHour();

        if (hora >= 5 && hora < 12) {
            System.out.println("Bom dia");
        } else if (hora >= 12 && hora < 18) {
            System.out.println("Boa tarde");
        } else {
            System.out.println("Boa noite");
        }
    }
}