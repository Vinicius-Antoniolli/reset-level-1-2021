package AulasMario;

public class Players {
    public static void main(String[] args) {
        Mario mario = new Mario("Mario", 1.5, 50);
        Luigi luigi = new Luigi("Luigi", 1.8, 35);
        Yoshi yoshi = new Yoshi("Yoshi", 0.3,3);

        mario.montadoNoYoshi();
        mario.montarNoYoshi(yoshi);
        mario.montadoNoYoshi();

        luigi.voar();

        System.out.println("Correndo a " + yoshi.getVelocidade() + "km/h!");
        yoshi.comerFrutas();
        System.out.println("Correndo a " + yoshi.getVelocidade() + "km/h!");
        yoshi.comerFrutas();
        System.out.println("Correndo a " + yoshi.getVelocidade() + "km/h!");
        yoshi.comerFrutas();
        System.out.println("Correndo a " + yoshi.getVelocidade() + "km/h!");
    }
}

Mario não está montado no Yoshi!
Mario está montado no Yoshi!
Luigi está voando!
Correndo a 10.0km/h!
Correndo a 10.0km/h!
Correndo a 20.0km/h!
Correndo a 20.0km/h!
