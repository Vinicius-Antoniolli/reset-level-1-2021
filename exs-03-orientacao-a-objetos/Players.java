package AulasMario;

public class Players {
    public static void main(String[] args) {
        Mario mario = new Mario("Mario", 1.5, 50);
        Luigi luigi = new Luigi("Luigi", 1.8, 35);
        Yoshi yoshi = new Yoshi("Yoshi", 0.3,3);

        mario.imprimeCaracteristicas();
        mario.cresce();
        mario.saltar(2);
        System.out.println("");
        System.out.println("---");
        System.out.println("");
        mario.imprimeCaracteristicas();
        System.out.println("");
        System.out.println("---");
        System.out.println("");
        luigi.imprimeCaracteristicas();
        luigi.cresce();
        luigi.saltar(4);
        System.out.println("");
        System.out.println("---");
        System.out.println("");
        luigi.imprimeCaracteristicas();
        System.out.println("");
        System.out.println("---");
        System.out.println("");
        yoshi.imprimeCaracteristicas();
        yoshi.cresce();
        yoshi.saltar(6);
        System.out.println("");
        System.out.println("---");
        System.out.println("");
        yoshi.imprimeCaracteristicas();





    }
}