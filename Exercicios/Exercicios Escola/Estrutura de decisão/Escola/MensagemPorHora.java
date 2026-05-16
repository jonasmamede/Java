import java.time.LocalTime;

public class MensagemPorHora {
    public static void main(String[] args) {

        LocalTime agora = LocalTime.now();
        int hora = agora.getHour();

        if (hora >= 0 && hora < 5) {
            System.out.println("VÁ DORMIR");
        } 
        else if (hora < 12) {
            System.out.println("Bom dia!");
        } 
        else if (hora < 18) {
            System.out.println("Boa tarde!");
        } 
        else {
            System.out.println("Boa noite!");
        }

    }
}