package parte_04_Java.P04E01;
import java.util.Date;
// https://github.com/MisaelSivuca

public class Aluno extends Pessoa{
    public String matricula;

    @Override
    public double tirarCopias(int qtd){
        double preco = qtd * 0.07;
        return preco;
    }

    public Aluno(String matricula) {
        this.matricula = matricula;
    }
    public Aluno(){

    }

    public Aluno(String nome, String cpf, Date dataNascimento, String matricula) {
        super(nome, cpf, dataNascimento);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + getNome() + '\'' +
                "matricula='" + matricula + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
}
