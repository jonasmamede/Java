import javax.swing.*;
import java.util.Scanner;

public class Validador {

    // =========================
    // VALIDAR NOME
    // =========================

    public static String lerNome(Scanner sc, String mensagem) {

        while (true) {

            try {

                System.out.print(mensagem);

                String nome = sc.nextLine();

                validarNome(nome);

                return nome;

            } catch (IllegalArgumentException e) {

                System.out.println("Erro: " + e.getMessage());
            }
        }
    }

    public static void validarNome(String nome) {

        if (nome == null || nome.trim().isEmpty()) {

            throw new IllegalArgumentException(
                    "O nome não pode ser vazio!"
            );
        }

        if (!nome.matches("[a-zA-ZÀ-ÿ ]+")) {

            throw new IllegalArgumentException(
                    "O nome deve conter apenas letras!"
            );
        }
    }

    // =========================
    // VALIDAR CPF
    // =========================

    public static String lerCPF(Scanner sc, String mensagem) {

        while (true) {

            try {

                System.out.print(mensagem);

                String cpf = sc.nextLine();

                validarCPF(cpf);

                return cpf;

            } catch (IllegalArgumentException e) {

                System.out.println("Erro: " + e.getMessage());
            }
        }
    }

    public static void validarCPF(String cpf) {

        if (cpf == null || cpf.trim().isEmpty()) {

            throw new IllegalArgumentException(
                    "CPF vazio!"
            );
        }

        cpf = cpf.replaceAll("[^0-9]", "");

        if (cpf.length() != 11) {

            throw new IllegalArgumentException(
                    "CPF deve possuir 11 números!"
            );
        }
    }

    // =========================
    // VALIDAR TELEFONE
    // =========================

    public static String lerTelefone(Scanner sc, String mensagem) {

        while (true) {

            try {

                System.out.print(mensagem);

                String telefone = sc.nextLine();

                validarTelefone(telefone);

                return telefone;

            } catch (IllegalArgumentException e) {

                System.out.println("Erro: " + e.getMessage());
            }
        }
    }

    public static void validarTelefone(String telefone) {

        if (telefone == null || telefone.trim().isEmpty()) {

            throw new IllegalArgumentException(
                    "Telefone vazio!"
            );
        }

        telefone = telefone.replaceAll("[^0-9]", "");

        if (telefone.length() < 8 || telefone.length() > 11) {

            throw new IllegalArgumentException(
                    "Telefone inválido!"
            );
        }
    }

    // =========================
    // VALIDAR INTEIRO
    // =========================

    public static int lerInteiro(Scanner sc) {

        while (true) {

            try {

                System.out.print("Digite a opção: ");

                return Integer.parseInt(sc.nextLine());

            } catch (NumberFormatException e) {

                System.out.println(
                        "Digite apenas números!"
                );
            }
        }
    }

    // =========================
    // GUI
    // =========================

    public static String lerNomeGUI(String mensagem) {

        while (true) {

            try {

                String nome =
                        JOptionPane.showInputDialog(mensagem);

                validarNome(nome);

                return nome;

            } catch (IllegalArgumentException e) {

                JOptionPane.showMessageDialog(
                        null,
                        e.getMessage()
                );
            }
        }
    }

    public static String lerCPF_GUI(String mensagem) {

        while (true) {

            try {

                String cpf =
                        JOptionPane.showInputDialog(mensagem);

                validarCPF(cpf);

                return cpf;

            } catch (IllegalArgumentException e) {

                JOptionPane.showMessageDialog(
                        null,
                        e.getMessage()
                );
            }
        }
    }

    public static String lerTelefoneGUI(String mensagem) {

        while (true) {

            try {

                String telefone =
                        JOptionPane.showInputDialog(mensagem);

                validarTelefone(telefone);

                return telefone;

            } catch (IllegalArgumentException e) {

                JOptionPane.showMessageDialog(
                        null,
                        e.getMessage()
                );
            }
        }
    }
}