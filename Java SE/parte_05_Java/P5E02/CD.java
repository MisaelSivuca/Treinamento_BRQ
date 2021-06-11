package parte_05_Java.P5E02;
// https://github.com/MisaelSivuca

import java.util.Scanner;

public class CD extends Midia{
    private int nMusicas;

    public void inserirDados() {
        Scanner sc = new Scanner(System.in);
        super.inserirDados();
        System.out.print("Digite o numero de musicas: ");
        nMusicas = Integer.parseInt(sc.nextLine());
        System.out.println("----");
        CD cd = new CD(codigo, preco, nome, nMusicas);
    }

    public CD() {}

    public CD(int codigo, double preco, String nome,int nMusicas) {
        super(codigo, preco, nome);
        this.nMusicas = nMusicas;
    }

    public String getTipo() {
        return CD.class.getSimpleName();
    }
    @Override
    public String getDetalhes() {
        return super.getDetalhes() + "O CD tem : " + nMusicas + " Musicas.";
    }
    @Override
    public void printDados() {
      super.printDados();
    }

}
