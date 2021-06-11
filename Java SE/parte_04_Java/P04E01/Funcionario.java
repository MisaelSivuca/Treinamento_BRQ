package parte_04_Java.P04E01;
// https://github.com/MisaelSivuca

import java.util.Date;

public class Funcionario extends Pessoa{

    private  double salario;
    private String cargo;
    private Date dataAdmissao;

    public Funcionario (){

    }

    public Funcionario(double salario, String cargo, Date dataAdmissao) {
        this.salario = salario;
        this.cargo = cargo;
        this.dataAdmissao = dataAdmissao;
    }

    public Funcionario(String nome, String cpf, Date dataNascimento, double salario, String cargo, Date dataAdmissao) {
        super(nome, cpf, dataNascimento);
        this.salario = salario;
        this.cargo = cargo;
        this.dataAdmissao = dataAdmissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
}
