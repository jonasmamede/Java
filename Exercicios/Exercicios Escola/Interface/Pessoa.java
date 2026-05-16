import javax.swing.*;

public class Pessoa {

    protected String nome;
    protected String cpf;
    protected String telefone;

    public void cadastrar() {

        nome = JOptionPane.showInputDialog("Digite o nome:");
        cpf = JOptionPane.showInputDialog("Digite o CPF:");
        telefone = JOptionPane.showInputDialog("Digite o telefone:");
    }

    public String mostrarDados() {

        return "Nome: " + nome +
                " | CPF: " + cpf +
                " | Telefone: " + telefone;
    }
}