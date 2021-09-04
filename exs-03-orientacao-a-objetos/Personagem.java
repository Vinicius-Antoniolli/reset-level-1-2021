package AulasMario;

public class Personagem {
    public static void main(String[] args) {
        Mario pl1 = new Mario();
        pl1.imprimeCaracteristicas();
        pl1.imprimeSuperPoderes();
        System.out.println("---");
        System.out.println("---");
        Mario pl2 = new Mario("Mario Gigante,", 1.9, 28);
        pl2.imprimeCaracteristicas();
        pl2.imprimeSuperPoderes();
    }
}