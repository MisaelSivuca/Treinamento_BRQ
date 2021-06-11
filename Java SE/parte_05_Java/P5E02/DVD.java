package parte_05_Java.P5E02;
// https://github.com/MisaelSivuca

import java.util.Scanner;

public class DVD extends Midia{
    protected int nFaixas;
    public DVD(int codigo, double preco, String nome,int nFaixas) {
        super(codigo, preco, nome);
        this.nFaixas = nFaixas;
    }
    public DVD() {}

    public String getTipo() {
        return DVD.class.getSimpleName();
    }

    public String getDetalhes() {
        return super.getDetalhes() + "O DVD tem : " + nFaixas + " faixas.";
    }

    @Override
    public void printDados() {
        super.printDados();
    }

    public void inserirDados() {
        Scanner sc = new Scanner(System.in);
        super.inserirDados();
        System.out.print("Digite o numero de faixas: ");
        nFaixas = Integer.parseInt(sc.nextLine());
        System.out.println("----");
        DVD dvd = new DVD(codigo, preco, nome, nFaixas);
    }
}
