package parte_01_Java;
// https://github.com/MisaelSivuca

public class P1E05 {
    public static void main(String[] args){
        double DP = 9.5;
        double DG = 12.5;
        double PP = 8;
        double PG = 12;

        double PM = (PP + PG) / 2;
        double qtdLitros = DG * DP * PM * 785;

        System.out.println("Serão necessários  " + qtdLitros + "  litros de água para encher a piscina.");
    }
}
