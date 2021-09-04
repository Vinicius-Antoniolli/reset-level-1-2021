package Aula2Mario;

public class Personagem {
    public static void main(String[] args) {
        Aula2Mario.Mario h1 = new Aula2Mario.Mario();
        h1.nome = "Mario3 Bros";
        // h1.altura = 1.50; (NÃO PODE MAIS ALTERAR POR SER PRIVADO)
        h1.corDaPele = "Clara";
        h1.corDosOlhos = "Azuis";
        h1.tamanhoNariz = "Grande";
        h1.corCamiseta = "Vermelha";
        // h1.bigode = true; (NÃO PODE MAIS ALTERAR POR SER PRIVADO)
        h1.costeletas = true;
        h1.bone = true;
        //h1.idade = 46; (NÃO PODE MAIS ALTERAR POR SER PRIVADO)

        h1.imprimeCaracteristicas();
        //h1.imprimeSuperPoderes(); (NÃO PODE MAIS IMPRIMIR POR SER PRIVADO)
    }
}
