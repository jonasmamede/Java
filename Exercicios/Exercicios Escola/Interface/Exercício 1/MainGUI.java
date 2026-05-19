import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class MainGUI extends JFrame {

    JButton btnPessoa = new JButton("Cadastrar Pessoa");
    JButton btnAluno = new JButton("Cadastrar Aluno");
    JButton btnProfessor = new JButton("Cadastrar Professor");

    JTextArea areaPessoa = new JTextArea();
    JTextArea areaAluno = new JTextArea();
    JTextArea areaProfessor = new JTextArea();

    ArrayList<Pessoa> listaPessoas = new ArrayList<>();
    ArrayList<Aluno> listaAlunos = new ArrayList<>();
    ArrayList<Professor> listaProfessores = new ArrayList<>();

    public MainGUI() {

        setTitle("Sistema de Cadastro");
        setSize(950, 500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // BOTÕES

        btnPessoa.setBounds(20, 20, 220, 30);
        btnAluno.setBounds(360, 20, 220, 30);
        btnProfessor.setBounds(690, 20, 220, 30);

        add(btnPessoa);
        add(btnAluno);
        add(btnProfessor);

        // PESSOAS

        JLabel lblPessoa = new JLabel("Pessoas Cadastradas");
        lblPessoa.setBounds(20, 60, 200, 20);

        JScrollPane scrollPessoa = new JScrollPane(areaPessoa);
        scrollPessoa.setBounds(20, 90, 250, 320);

        add(lblPessoa);
        add(scrollPessoa);

        // ALUNOS

        JLabel lblAluno = new JLabel("Alunos Cadastrados");
        lblAluno.setBounds(360, 60, 200, 20);

        JScrollPane scrollAluno = new JScrollPane(areaAluno);
        scrollAluno.setBounds(360, 90, 250, 320);

        add(lblAluno);
        add(scrollAluno);

        // PROFESSORES

        JLabel lblProfessor = new JLabel("Professores Cadastrados");
        lblProfessor.setBounds(690, 60, 220, 20);

        JScrollPane scrollProfessor = new JScrollPane(areaProfessor);
        scrollProfessor.setBounds(690, 90, 250, 320);

        add(lblProfessor);
        add(scrollProfessor);

        // EVENTO PESSOA

        btnPessoa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                Pessoa p = new Pessoa();

                try {

                    p.cadastrar();

                    listaPessoas.add(p);

                    atualizarPessoas();

                } catch (Exception ex) {

                    JOptionPane.showMessageDialog(null,
                            ex.getMessage());
                }
            }
        });

        // EVENTO ALUNO

        btnAluno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                Aluno a = new Aluno();

                try {

                    a.cadastrar();

                    listaAlunos.add(a);

                    atualizarAlunos();

                } catch (Exception ex) {

                    JOptionPane.showMessageDialog(null,
                            ex.getMessage());
                }
            }
        });

        // EVENTO PROFESSOR

        btnProfessor.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                Professor p = new Professor();

                try {

                    p.cadastrar();

                    listaProfessores.add(p);

                    atualizarProfessores();

                } catch (Exception ex) {

                    JOptionPane.showMessageDialog(null,
                            ex.getMessage());
                }
            }
        });

        setVisible(true);
    }

    public void atualizarPessoas() {

        areaPessoa.setText("");

        for (Pessoa p : listaPessoas) {

            areaPessoa.append(p + "\n\n");
        }
    }

    public void atualizarAlunos() {

        areaAluno.setText("");

        for (Aluno a : listaAlunos) {

            areaAluno.append(a + "\n\n");
        }
    }

    public void atualizarProfessores() {

        areaProfessor.setText("");

        for (Professor p : listaProfessores) {

            areaProfessor.append(p + "\n\n");
        }
    }

    public static void main(String[] args) {

        new MainGUI();
    }
}