package parte_01_Java;

public class P1E02 {
    public static void main(String[] args){
        double q1 = 1;
        double q2 = 50;
        double q3 = 25;
        double q4 = 10;
        double q5 = 5;
        double q6 = 1;
        double dolar = 5.04;

        double total = dolar * (1 * q1 + 0.50 * q2 + 0.25 * q3 + 0.10 * q4 + 0.05 * q5 + 0.01 * q6);
        System.out.println("No cofre tem US$ " + total + " de dolares");
    }
}
