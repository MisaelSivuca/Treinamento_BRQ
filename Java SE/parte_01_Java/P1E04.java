package parte_01_Java;

public class P1E04 {
    public static void main(String[] args){
        int hora = 1;
        int minuto = 30;
        int segundo = 30;
        int segDia = 86400;

        int converMin = minuto * 60;
        int converHora = hora * 60 * 60;
        int totalSeg = converHora + converMin + segundo;

        System.out.println("Total de segundos passados desde a 0h0min0s " + totalSeg + " segundos.");
        System.out.println("Total de segundos para a 0h0min0s " + (segDia - totalSeg + " segundos."));
    }
}
