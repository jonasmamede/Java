import java.util.Scanner;

public class MultiplosDeTres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);   
        System.out.print("Digite um numero: ");
        int num1 = entrada.nextInt();
        System.out.print("Digite outro numero: ");
        int num2 = entrada.nextInt();
        while (num1<=num2) {
            if (num1%3 == 0){
                System.out.println(num1);
                num1 +=1;
            }else{
                num1+=1;
            }
        }
    }
}
