package parte_05_Java.P5E01;
// https://github.com/MisaelSivuca

public class Calculadora {

    public static void main(String[] args) throws ArithmeticException {

        System.out.print("Soma: " );
        Contas.mostrarCalculo(new Soma(), 8,3);
        System.out.print("Subtracao: " );
        Contas.mostrarCalculo(new Subtracao(), 158, 80);
        System.out.print("Divisao: " );
        Contas.mostrarCalculo(new Divisao(), 100, 8);
        System.out.print("Multiplicacao: " );
        Contas.mostrarCalculo(new Multiplicacao(), 80, 14);
        System.out.print("Resto: " );
        Contas.mostrarCalculo(new Resto(), 8, 3);


    }
}
