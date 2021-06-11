package parte_04_Java.P04E01;
// https://github.com/MisaelSivuca

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class teste {

    public static void main(String[] args) throws java.lang.Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a data de Nascimento do Aluno");
        String dataRecebida = scanner.next();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataFormatada = formato.parse(dataRecebida);
        Date data = formato.parse(dataRecebida);

        Aluno aluno = new Aluno("Pedrinho", "045.789.456-55", data, "201715");
        Professor pofessor = new Professor();
        pofessor.setNome("Marcos");
        pofessor.setDisciplina("Matemática");
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Andre");
        funcionario.setSalario(152255);

        // Deste modo o resultado fica com muitos números
        // System.out.println(aluno.tirarCopias(25));

        System.out.println("Nome: " + aluno.getNome());

        String valorFormatado = NumberFormat.getCurrencyInstance().format(aluno.tirarCopias(25));
        String salarioFormatado = NumberFormat.getCurrencyInstance().format(funcionario.getSalario());

        System.out.println("Valor a ser pago pelo aluno " + aluno.getNome() + ": " + valorFormatado);

        System.out.println(aluno.toString());

        System.out.println("O professor " + pofessor.getNome()
                + " solicitou que o aluno " + aluno.getNome()
                + " fizesse copias e ele pagou " + valorFormatado);

        System.out.println(" O Funcionario " + funcionario.getNome()
                + " tem o salario equivalente a " + salarioFormatado);

    }
   /* public Date converteData(String dataRecebida) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataFormatada = formato.parse(dataRecebida);
        Date data = formato.parse(dataRecebida);
        return data;
    } */


}
