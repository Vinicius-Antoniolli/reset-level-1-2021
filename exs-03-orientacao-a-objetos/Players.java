package AulasMario;

public class Players {
    public static void main(String[] args) {
        Character[] p = new Character[2];
        p[0] = new Character("Mario", 1.5, 45);
        p[1] = new Character("Luigi", 1.8, 30);
        Jogo fase1 = new Jogo();
        fase1.iniciarFase(p[0], p[1]);
        fase1.jogar();
    }
}