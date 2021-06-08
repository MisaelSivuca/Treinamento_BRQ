package parte_02_Java.P2E01;

public class TesteFuncionario {
    public static void main(String[] args) {

        Funcionario f01 = new Funcionario("José", "Frentista", 01, 12500);
        Funcionario f02 = new Funcionario("Antônio", "Gerente", 02, 26000);
        Funcionario f03 = new Funcionario();

        f03.setNome("Claudia");
        f03.setCargo("Atendente");
        f03.setId(03);
        f03.setSalario(13000);

        f02.imprimirFicha();
        f01.imprimirFicha();
        f03.imprimirFicha();

        f01.setAumento(10);
        f02.setAumento(15.2);
        f03.setAumento(8.1);

        System.out.println("O Salário Anual do " + f01.getNome() + " é de " + f01.salarioAnual());
        System.out.println("O Salário Anual do " + f02.getNome() + " é de " + f02.salarioAnual());
        System.out.println("O Salário Anual do " + f03.getNome() + " é de " + f03.salarioAnual());

    }
}
