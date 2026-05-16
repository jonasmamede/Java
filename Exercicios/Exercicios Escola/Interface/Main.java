import javax.swing.*;
import java.awt.event.*;

class Pessoa {
    public void saudacao() {
        JOptionPane.showMessageDialog(null,
                "Olá! Seja bem-vindo.");
    }
}

class Aluno extends Pessoa {
    @Override
    public void saudacao() {
        JOptionPane.showMessageDialog(null,
                "Olá Aluno! Bons estudos.");
    }
}

class Professor extends Pessoa {
    @Override
    public void saudacao() {
        JOptionPane.showMessageDialog(null,
                "Olá Professor! Boa aula.");
    }
}

public class Main extends JFrame {

    JButton btnPessoa = new JButton("Pessoa");
    JButton btnAluno = new JButton("Aluno");
    JButton btnProfessor = new JButton("Professor");

    Pessoa pessoa = new Pessoa();
    Aluno aluno = new Aluno();
    Professor professor = new Professor();

    public Main() {

        setTitle("Sistema de Saudação");
        setSize(350, 250);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnPessoa.setBounds(100, 30, 120, 30);
        btnAluno.setBounds(100, 80, 120, 30);
        btnProfessor.setBounds(100, 130, 120, 30);

        add(btnPessoa);
        add(btnAluno);
        add(btnProfessor);

        btnPessoa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pessoa.saudacao();
            }
        });

        btnAluno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                aluno.saudacao();
            }
        });

        btnProfessor.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                professor.saudacao();
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}