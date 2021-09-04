package Aula2Mario;

public class Personagem {
    public static void main(String[] args) {
        Mario h1 = new Mario();
        h1.nome = "Mario Bros";
        h1.altura = 1.50;
        h1.corDaPele = "Clara";
        h1.corDosOlhos = "Azuis";
        h1.tamanhoNariz = "Grande";
        h1.corCamiseta = "Vermelha";
        h1.bigode = true;
        h1.costeletas = true;
        h1.bone = true;
        
        h1.imprimeCaracteristicas();
        h1.imprimeSuperPoderes();
    }
}
