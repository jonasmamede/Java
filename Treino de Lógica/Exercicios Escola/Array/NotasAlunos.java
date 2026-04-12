import java.util.Scanner;

public class NotasAlunos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[][] notas = new double[10][4];

        double soma = 0;
        double maior = -1;
        double menor = 11;

        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.println("Aluno " + (i+1) + " nota " + (j+1) + ":");
                notas[i][j] = entrada.nextDouble();

                soma += notas[i][j];

                if(notas[i][j] > maior) {
                    maior = notas[i][j];
                }

                if(notas[i][j] < menor) {
                    menor = notas[i][j];
                }
            }
        }

        double media = soma / 40;

        System.out.println("Media: " + media);
        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);
    }
}