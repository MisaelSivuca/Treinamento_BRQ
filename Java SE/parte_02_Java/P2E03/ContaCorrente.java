package parte_02_Java.P2E03;

public class ContaCorrente {
    private int numCC;
    private double saldo;

    ContaCorrente(int numCC, double saldo){
        this.numCC = numCC;
        this.saldo = saldo;
    }

    public void setNumCC(int numCC) {
        this.numCC = numCC;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumCC() {
        return numCC;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double deposito) {
        saldo = saldo + deposito;
    }

    public void sacar(double saque) {
        saldo = saldo - saque;
    }
}
