import java.util.ArrayList;
import java.util.Scanner;

public class MainTexto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Pessoa> pessoas = new ArrayList<>();

        int opcao;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar Pessoa");
            System.out.println("2 - Cadastrar Aluno");
            System.out.println("3 - Cadastrar Professor");
            System.out.println("4 - Mostrar Cadastros");
            System.out.println("0 - Sair");

            opcao = Validador.lerInteiro(sc);

            switch (opcao) {

                case 1:

                    Pessoa p = new Pessoa();
                    p.cadastrarTexto(sc);

                    pessoas.add(p);

                    break;

                case 2:

                    Aluno a = new Aluno();
                    a.cadastrarTexto(sc);

                    pessoas.add(a);

                    break;

                case 3:

                    Professor prof = new Professor();
                    prof.cadastrarTexto(sc);

                    pessoas.add(prof);

                    break;

                case 4:

                    System.out.println("\n===== CADASTROS =====");

                    for (Pessoa pessoa : pessoas) {

                        System.out.println(pessoa);
                    }

                    break;

                case 0:

                    System.out.println("Encerrando...");
                    break;

                default:

                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}