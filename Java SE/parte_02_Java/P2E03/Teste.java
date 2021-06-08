package parte_02_Java.P2E03;

public class Teste {

    public static void main(String[] args) {

        ContaCorrente c1 = new ContaCorrente(1085, 0);
        System.out.println("Saldo Atual: " + c1.getSaldo());
        c1.depositar(15350);
        System.out.println("Saldo Atual: " + c1.getSaldo());
        c1.sacar(345);
        System.out.println("Saldo Atual: " + c1.getSaldo());
    }
}
