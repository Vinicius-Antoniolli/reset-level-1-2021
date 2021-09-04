package Aula2Mario;

public class Mario {
    String nome;
    String corDaPele;
    String corDosOlhos;
    String tamanhoNariz;
    String corCamiseta;
    boolean bigode;
    boolean costeletas;
    boolean bone;
    double altura;

    void imprimeCaracteristicas() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Altura: " + this.altura);
        System.out.println("Cor da Pele: " + this.corDaPele);
        System.out.println("Cor do Olhos: " + this.corDosOlhos);
        System.out.println("Tamanho do nariz: " + this.tamanhoNariz);
        System.out.println("Cor da camiseta:  " + this.corCamiseta);
        System.out.println("Ele tem bigode?: " + this.bigode);
        System.out.println("Ele usa costeletas? " + this.costeletas);
        System.out.println("Está de boné? " + this.bone);

    }

    void imprimeSuperPoderes() {
        System.out.println("Super salto, respirar em baixo d'água, teleporte, comunicação telepática com Luigi, manipulação de tamanho");
    }
}
