import java.util.Scanner;

public class TabuadaCompleta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);  
        System.out.println("Digite um numero: ");  
        int num = entrada.nextInt();
        System.out.println("=====Soma====");
        //Soma//
        for (int i = 0; i <= 10; i++){
            int resultadoSoma = num+i;
            System.out.println(num + " + " + i + " = " + resultadoSoma);
        }
        System.out.println("=====Subtração====");
        //subtração
        for (int i = 0; i <= 10; i++){
            int resultadoSub = num-i;
            System.out.println(num + " - " + i + " = " + resultadoSub);
        }
System.out.println("=====Multiplicação====");
        for (int i = 0; i <= 10; i++){
            int resultadoMulti = num*i;
            System.out.println(num + " x " + i + " = " + resultadoMulti);
        }
System.out.println("=====Divisão====");
        for (int i = 0; i <= 10; i++){
            int resultadoDivi = num/i;
            System.out.println(num + " / " + i + " = " + resultadoDivi);
        }
    }
}
