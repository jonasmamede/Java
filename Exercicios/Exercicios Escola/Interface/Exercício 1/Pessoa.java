import java.util.Scanner;

public class Pessoa {

    protected String nome;
    protected String cpf;
    protected String telefone;

    // GUI

    public void cadastrar() {

        nome = Validador.lerNomeGUI(
                "Digite o nome:"
        );

        cpf = Validador.lerCPF_GUI(
                "Digite o CPF:"
        );

        telefone = Validador.lerTelefoneGUI(
                "Digite o telefone:"
        );
    }

    // TEXTO

    public void cadastrarTexto(Scanner sc) {

        nome = Validador.lerNome(
                sc,
                "Nome: "
        );

        cpf = Validador.lerCPF(
                sc,
                "CPF: "
        );

        telefone = Validador.lerTelefone(
                sc,
                "Telefone: "
        );
    }

    @Override
    public String toString() {

        return "Nome: " + nome +
                " | CPF: " + cpf +
                " | Telefone: " + telefone;
    }
}