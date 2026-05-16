public class Conta {
    public String titular;
    public Double saldo;

    Double deposito = 0.0;

    public Conta(String titular, Double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void mostrarSaldo() {
        System.out.println("Saldo: " + saldo);
        System.out.println("Dinheiro no deposito: " + deposito);
    }

    public void depositar(double valor) {
        if (saldo >= valor) {
            deposito += valor;
            saldo -= valor;
            System.out.println("Deposito realizado com sucesso!");
        } else {
            System.out.println("Não foi possivel realizar o deposito!");
        }
    }

    public void sacar(double valor) {
        if (valor <= deposito) {
            saldo += valor;
            deposito -= valor;
            System.out.println("Saque realizado com sucesso");
        } else {
            System.out.println("Não foi possivel realizar o saque!");
        }
    }

}
