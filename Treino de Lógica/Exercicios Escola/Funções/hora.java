import java.time.LocalTime;

public class hora {
    public static void hora(){
        int hora = LocalTime.now().getHour();

        if (hora >= 5 && hora < 12) {
            System.out.println("Bom dia");
        } else if (hora >= 12 && hora < 18) {
            System.out.println("Boa tarde");
        } else {
            System.out.println("Boa noite");
        }
    }

    public static void main(String[] args) {
        hora();
    }
}