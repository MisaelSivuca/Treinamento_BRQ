package parte_03_Java.P03E03;

public class Turma {
    private int idTurma;
    private int qtdAlunos;
    private double [] notas;

    Turma(int id, int alunos){ this.idTurma = id; this.qtdAlunos = alunos;
    }

    Turma(double [] notas) {
        this.notas = notas;
    }

    public void setIdTurma(int id) {
        this.idTurma = id;
    }

    public void setQtdAlunos(int qtd) {
        this.qtdAlunos = qtd;
    }

    public void setNotas(double [] notas) {
        this.notas = notas;
    }

    public int getIdTurma() {
        return idTurma;
    }

    public int getQtdAlunos() {
        return qtdAlunos;
    }

    public double [] getNotas() {
        return notas;
    }

    public void imprimirMediaAcima(double [] nota) {
        for(int i = 0; i < nota.length; i++) {
            if(nota[i] >= getMedia())
                System.out.println(nota[i]);
        }
    }

    public double getMedia() {
        double media = 0;
        for(int i = 0; i < notas.length; i++) {
            media = media + notas[i];
        } return media / notas.length;

    }

    public String toString() {
        return "idTurma " + idTurma + "\nqtdAlunos " + qtdAlunos + "\nnotas" + notas;
    }

}
