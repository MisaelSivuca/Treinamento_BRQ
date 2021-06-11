package parte_05_Java.P5E02;
// https://github.com/MisaelSivuca

import java.util.Scanner;

public abstract class Midia {
    protected int codigo;
    protected double preco;
    protected String nome;

    public abstract String getTipo();

     public String getDetalhes() {
        return "Codigo: " + codigo +"\n" + "Preco: " + preco +"\n" + "Nome: " + nome +"\n";
    }

    public void printDados() {
        System.out.println(getTipo() + "\n" + getDetalhes() + "\n----");
    }

    public void inserirDados() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cadastro de Midia: " + getTipo());
        System.out.print("Digite o Codigo: ");
        codigo = Integer.parseInt(sc.nextLine());
        System.out.print("Digite o Preco: ");
        preco = Double.parseDouble(sc.nextLine());
        System.out.print("Digite o Nome: ");
        nome = sc.nextLine();
    }

    public Midia() {}

    public Midia(int codigo, double preco, String nome){
        this.codigo = codigo;
        this.preco = preco;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }
}
