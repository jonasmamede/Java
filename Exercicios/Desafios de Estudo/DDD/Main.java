import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Map<Integer, String> DDD = new HashMap<>();
        DDD.put(61, "Brasilia");
        DDD.put(71, "Salvador");
        DDD.put(11, "Sao Paulo");
        DDD.put(21, "Rio de Janeiro");
        DDD.put(32, "Juiz de Fora");
        DDD.put(19, "Campinas");
        DDD.put(27, "Vitoria");
        DDD.put(31, "Belo Horizonte");

        int info = entrada.nextInt();

        
        if (!DDD.containsKey(info)) {
            System.out.println("DDD nao cadastrado");
        }else{
            System.out.println(DDD.get(info));
        }
    }
}