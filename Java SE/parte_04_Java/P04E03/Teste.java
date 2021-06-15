package parte_04_Java.P04E03;

public class Teste {
    public static void main(String[] args) throws Exception {

        Veiculo v_01 = new Veiculo(85, 100);
        Veiculo v_02 = new Veiculo(120, 100);

        v_01.acelera(40);
        v_01.desacelera(50);
        v_02.acelera(50);
        v_02.desacelera(100);
    }
}
