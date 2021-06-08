package parte_03_Java.P03E03;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o numero da turma e a quantidade de alunos: ");
        @SuppressWarnings("unused")
        Turma turma01 = new Turma(sc.nextInt(), sc.nextInt());

        System.out.println("Informe a quantidade de notas: ");
        double [] notas1 = new double[sc.nextInt()];

        for(int i = 0; i <notas1.length; i++) {
            System.out.println("Informe a nota " + (i + 1) + " : ");
            double nota = sc.nextDouble();
            notas1[i] = nota;

        }

        Turma notas11 = new Turma(notas1);
        System.out.println("Media: " + notas11.getMedia());
        notas11.imprimirMediaAcima(notas1);

        sc.close();
    }
}
