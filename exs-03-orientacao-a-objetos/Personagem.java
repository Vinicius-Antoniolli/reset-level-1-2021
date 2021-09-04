package AulasMario;

public class Personagem {
    public static void main(String[] args) {
        Mario pl1 = new Mario();
        pl1.imprimeCaracteristicas();
        pl1.imprimeSuperPoderes();
        System.out.println("---");
        pl1.perdeEstamina();
        pl1.imprimeCaracteristicas();
        System.out.println("---");
        pl1.ganhaEstamina();
        pl1.cresce();
        pl1.imprimeCaracteristicas();
        System.out.println("---");
    }
}