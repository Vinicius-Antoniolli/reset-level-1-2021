package AulasMario;

public class Yoshi extends Character{
    private int quantidadeFrutas;
    private double velocidade;

    public Yoshi(String nome, double altura, int idade) {
        super(nome, altura, idade);
    quantidadeFrutas = 0;
    velocidade = 10;
    }

@Override
    public void cresce(){
        this.altura=this.altura*1.1;
    }
    public void comerFrutas(){
        quantidadeFrutas++;
        if (this.quantidadeFrutas % 2 == 0){
            this.velocidade *= 2;
        }
    }
    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
}
