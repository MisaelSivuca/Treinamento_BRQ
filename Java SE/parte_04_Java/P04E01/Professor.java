package parte_04_Java.P04E01;
// https://github.com/MisaelSivuca

import java.util.Date;

public class Professor extends Pessoa{

    private String disciplina;
    private double salario;

    Professor(){

    }

    public Professor(String disciplina, double salario) {
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public Professor(String nome, String cpf, Date dataNascimento, String disciplina, double salario) {
        super(nome, cpf, dataNascimento);
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
