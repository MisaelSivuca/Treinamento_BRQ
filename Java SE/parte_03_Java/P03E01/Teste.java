package parte_03_Java.P03E01;

public class Teste {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa (01, "Pedro", 1.95);
        Pessoa pessoa2 = new Pessoa (02, "Marcos", 1.83);
        Pessoa pessoa3 = new Pessoa (03, "Thiago" , 1.58);
        Pessoa pessoa4 = new Pessoa (04, "Matheus" , 1.63);

        double alturas[] = {pessoa1.getAlturaPessoa(),pessoa2.getAlturaPessoa(),pessoa3.getAlturaPessoa(),pessoa4.getAlturaPessoa()};

        System.out.println("Altura de " + pessoa1.getNomePessoa() + " é " + pessoa1.getAlturaPessoa());
        System.out.println("Altura de " + pessoa2.getNomePessoa() + " é " + pessoa2.getAlturaPessoa());
        System.out.println("Altura de " + pessoa3.getNomePessoa() + " é " + pessoa3.getAlturaPessoa());
        System.out.println("Altura de " + pessoa4.getNomePessoa() + " é " + pessoa4.getAlturaPessoa());

        System.out.println("A Média das alturas é "+ mediaAltura(alturas));

    }

    public static double mediaAltura(double [] alturaPessoa) {
        double totalAlturas = 0;
        for(int i=0; i < alturaPessoa.length; i++)
            totalAlturas = totalAlturas + alturaPessoa[i];
        return totalAlturas / alturaPessoa.length;
    }

}
