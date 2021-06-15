package parte_04_Java.P04E03;

public class Veiculo {
    private int velocidade;
    private int velocidadeMax;

    public Veiculo() {}

    public Veiculo(int velocidade, int velocidadeMax) {
        this.velocidade = velocidade;
        this.velocidadeMax = velocidadeMax;
    }

    public void acelera(int incremento) throws Exception {
        if(velocidade + incremento > velocidadeMax)
            throw new Exception("Velocidade NÃO pode ser MENOR que: " + velocidadeMax + "km/h.");
        else
            velocidade += incremento;
    }

    public void desacelera(int decremento) throws Exception {
        if(velocidade - decremento < 0)
            throw new Exception("Velocidade DEVE ser MAIOR que zero.");
        else
            velocidade -= decremento;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getVelocidadeMax() {
        return velocidadeMax;
    }

}
