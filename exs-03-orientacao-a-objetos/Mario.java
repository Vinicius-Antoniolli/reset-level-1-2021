package AulasMario;

public class Mario extends Character {
    private Yoshi yoshi;
    public Mario(String nome, double altura, int idade) {
        super(nome, altura, idade);
    }

    public void montarNoYoshi(Yoshi yoshi) {
        this.yoshi = yoshi;
    }

    @Override
    public void cresce (){
        this.altura=this.altura*1.5;
    }
    public void montadoNoYoshi(){
        if(this.yoshi != null) {
        System.out.println("Mario está montado no Yoshi!");
        } else {
        System.out.println("Mario não está montado no Yoshi!");
        }
    }
 }
