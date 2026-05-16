public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta("Jonas", 4921.4);
        conta.mostrarSaldo();
        System.out.println("------------------------------");
        conta.depositar(4125.3);
        System.out.println("------------------------------");
        conta.sacar(834.5);
        System.out.println("------------------------------");
        conta.mostrarSaldo();
    }  
}
