package parte_05_Java.P5E02;
// https://github.com/MisaelSivuca

public class Teste {
    public static void main(String[] a) {
        
        DVD dvd = new DVD();
        CD cd = new CD();
        cd.inserirDados();
        dvd.inserirDados();
        cd.printDados();
        dvd.printDados();


    }
}
