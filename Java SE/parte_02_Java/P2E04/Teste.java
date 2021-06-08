package parte_02_Java.P2E04;

public class Teste {
    public static void main(String[] args) {

        AlunoDisciplina a1 = new AlunoDisciplina(01, 8, 5.5, 8.5);
        AlunoDisciplina a2 = new AlunoDisciplina(02, 17, 7.3, 4.9);
        System.out.println("A Media aritmetica do Aluno " + a1.getIdAluno() + " é " + a1.getMediaArit());
        System.out.println("A Media ponderada do Aluno " + a1.getIdAluno() + " é " + a1.getMediaPond());
        System.out.println("A Media aritmetica do Aluno " + a2.getIdAluno() + " é " + a2.getMediaArit());
        System.out.println("A Media ponderada do Aluno " + a2.getIdAluno() + " é " + a2.getMediaPond());
    }
}
