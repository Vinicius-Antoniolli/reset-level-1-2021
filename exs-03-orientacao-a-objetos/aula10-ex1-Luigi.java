package AulasMario;

public class Luigi extends Character{
    public Luigi(String nome, double altura, int idade) {
        super(nome, altura, idade);
    }

@Override
    public void cresce(){
        this.altura=this.altura*1.75;
    }

    public void voar(){
        System.out.println("Luigi está voando!");
    }
}
