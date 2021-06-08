package parte_02_Java.P2E05;

public class Teste {
    public static void main(String[] args) {

        Relogio r1 = new Relogio(12, 00, 00);
        Relogio r2 = new Relogio(18, 55, 39);
        System.out.println(r1.getHoraParaSeg());
        System.out.println(r1.getAdiantaHora(20140));
        System.out.println(r1.getAtrasaHora(9));

        System.out.println(r2.getHoraParaSeg());
        System.out.println(r2.getAdiantaHora(20160));
        System.out.println(r2.getAtrasaHora(3));
    }
}
