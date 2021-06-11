package parte_04_Java.P04E01;
// https://github.com/MisaelSivuca

import java.util.Date;

public class Pessoa {
    private String nome;
    protected String cpf;
    protected Date dataNascimento;

    public double tirarCopias(int qtd){
        double preco = qtd * 0.10;
        return preco;
    }

   Pessoa () {
    }

    public Pessoa(String nome, String cpf, Date dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
