package AulasMario;

public class Personagem {
    public static void main(String[] args) {
        Mario pl1 = new Mario();
        System.out.println("Teste caracteristicas iniciais");
        pl1.imprimeCaracteristicas();
        System.out.println("---");
        pl1.perdeEstamina();
        pl1.coletarMoedas();
        pl1.coletarMoedas();
        pl1.coletarMoedas();
        pl1.coletarMoedas();
        pl1.coletarMoedas();
        pl1.coletarMoedas();
        pl1.coletarMoedas();
        pl1.coletarMoedas();
        pl1.coletarMoedas();
        pl1.coletarMoedas();
        System.out.println("Teste 10 moedas ganha vida e perder estamina");
        pl1.imprimeCaracteristicas();
        System.out.println("---");
        pl1.revigorar();
        System.out.println("Teste do revigorar");
        pl1.imprimeCaracteristicas();
        System.out.println("---");
        pl1.morrer();
        System.out.println("Teste morrer ainda com vidas sobrando (estamina volta a 100)");
        pl1.imprimeCaracteristicas();
        System.out.println("---");
        pl1.cresce();
        pl1.morrer();
        pl1.morrer();
        System.out.println("Teste de GAME OVER");
        pl1.imprimeCaracteristicas();
    }
}