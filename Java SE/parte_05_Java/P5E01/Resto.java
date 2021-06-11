package parte_05_Java.P5E01;
// https://github.com/MisaelSivuca

public class Resto extends OperacaoMatematica {
    @Override
    public double calcular(double x, double y) {
        if(y==0) {
            throw new ArithmeticException("O divisor não pode ser zero");
        }
        return x % y;
    }
}
