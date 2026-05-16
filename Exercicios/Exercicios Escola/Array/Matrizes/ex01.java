import java.security.SecureRandom;

public class ex01 {

    public static void main(String[] args) {
        final int linhas = 3;
        final int colunas = 3;
        int[][] numeros = new int[linhas][colunas];


        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                numeros[i][j] = new SecureRandom().nextInt(100);
            }
        }

        // for (int i = 0; i < linhas; i++) {
        //     for (int j = 0; j < colunas; j++) {
        //         System.out.printf("%2d |", numeros[i][j]);
        //     }
        //     System.out.print("%n");
        // }

           for (int []n : numeros) {
                for (int j : n) {
                    System.out.printf("%2d | ", j);
                }
                System.out.printf("%n");
           } 
           

    }
}
