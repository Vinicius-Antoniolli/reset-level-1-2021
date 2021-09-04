package AulasMario;

import java.util.Random;

public class Jogo {
    private Character player1;
    private Character player2;

    public void iniciarFase(Character player1, Character player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void jogar() {
        Random randomMoedas = new Random();

        int moedasColetadasPlayer1 = randomMoedas.nextInt(30);
        for (int i = 0; i < moedasColetadasPlayer1; i++) {
            player1.coletarMoedas();
        }

        int moedasColetadasPlayer2 = randomMoedas.nextInt(30);
        for (int i = 0; i < moedasColetadasPlayer2; i++) {
            player2.coletarMoedas();
        }
        System.out.println("O player 1 coletou " + moedasColetadasPlayer1 + " moedas!!");
        System.out.println("");
        player1.imprimeCaracteristicas();
        System.out.println("");
        System.out.println("-----");
        System.out.println("");

        System.out.println("O player 2 coletou " + moedasColetadasPlayer2 + " moedas!!");
        System.out.println("");
        player2.imprimeCaracteristicas();
    }
}
