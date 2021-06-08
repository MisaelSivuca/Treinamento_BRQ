package parte_01_Java;

import java.util.Scanner;

public class P1E03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        double c = sc.nextDouble();
        double fh = c * 1.8 +32;
        double klv = c + 273.15;
        double rmr = c * 0.8;
        double rkn = c * 1.8 + 32 + 459.67;

        System.out.println("Você digitou " + c + " graus celsius que ao comverter para fahrenheit são " + fh);
        System.out.println("Você digitou " + c + " graus celsius que ao comverter para kelvin são " + klv);
        System.out.println("Você digitou " + c + " graus celsius que ao comverter para reaumur são " + rmr);
        System.out.println("Você digitou " + c + " graus celsius que ao comverter para rankine são " + rkn);
    }
}
