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


O player 1 coletou 17 moedas!!

Nome: Mario
Altura: 1.5m.
Idade: 45 anos.
2 vida(s)
Possui 17 moedas.
Você tem 100 de energia.

-----

O player 2 coletou 14 moedas!!

Nome: Luigi
Altura: 1.8m.
Idade: 30 anos.
2 vida(s)
Possui 14 moedas.
Você tem 100 de energia.
