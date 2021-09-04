package Aula2Mario;

public class Mario {
    public String nome;
    public String corDaPele;
    public String corDosOlhos;
    public String tamanhoNariz;
    protected String corCamiseta;
    private boolean bigode;
    protected boolean costeletas;
    public boolean bone;
    private double altura;
    private int idade;

    public void imprimeCaracteristicas() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Altura: " + this.altura);
        System.out.println("Idade: " + this.idade);
        System.out.println("Cor da Pele: " + this.corDaPele);
        System.out.println("Cor do Olhos: " + this.corDosOlhos);
        System.out.println("Tamanho do nariz: " + this.tamanhoNariz);
        System.out.println("Cor da camiseta:  " + this.corCamiseta);
        System.out.println("Ele tem bigode?: " + this.bigode);
        System.out.println("Ele usa costeletas? " + this.costeletas);
        System.out.println("Está de boné? " + this.bone);

    }

    private void imprimeSuperPoderes() {
        System.out.println("Super salto, respirar em baixo d'água, teleporte, comunicação telepática com Luigi, manipulação de tamanho");
    }
}
