package parte_01_Java;

public class P1E01 {
    public static void main(String[] args){
        double altura = 30;
        double massa = 100;
        double tempo = 100;
        double cavalos = massa * altura * tempo / 745.6999;
        System.out.println("Serão necessários " + cavalos + " Cavalos");
    }
}
