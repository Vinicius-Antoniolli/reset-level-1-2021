package AulasMario;

public class Mario {
    private String nome;
    private double altura;
    private int idade;
    private String corDosOlhos;
    private String corCamiseta;
    private boolean bigode;
    private boolean costeletas;
    private boolean bone;
    private int estamina;

    public Mario() {
        this.nome = "Mario Bros";
        this.idade = 40;
        this.estamina = 100;
        this.altura = 1.5;
    }

    public Mario(String nome, double altura, int idade) {
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
        this.estamina = 100;
    }

    public void imprimeCaracteristicas() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Cor dos Olhos: " + this.getCorDosOlhos());
        System.out.println("Cor da camiseta:  " + this.getCorCamiseta());
        System.out.println("Ele tem bigode?: " + this.bigode);
        System.out.println("Ele usa costeletas? " + this.costeletas);
        System.out.println("Está de boné? " + this.bone);
        System.out.println("Ele tem " + this.getEstamina() + " de energia.");
    }

    public void imprimeSuperPoderes() {
        System.out.println("Super salto, respirar em baixo d'água, manipulação de tamanho");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCorDosOlhos() {
        return corDosOlhos;
    }

    public void setCorDosOlhos(String corDosOlhos) {
        this.corDosOlhos = corDosOlhos;
    }

    public String getCorCamiseta() {
        return corCamiseta;
    }

    public void setCorCamiseta(String corCamiseta) {
        this.corCamiseta = corCamiseta;
    }

    public boolean isBigode() {
        return bigode;
    }

    public void setBigode(boolean bigode) {
        this.bigode = bigode;
    }

    public boolean isCosteletas() {
        return costeletas;
    }

    public void setCosteletas(boolean costeletas) {
        this.costeletas = costeletas;
    }

    public boolean isBone() {
        return bone;
    }

    public void setBone(boolean bone) {
        this.bone = bone;
    }

    public int getEstamina() {
        return estamina;
    }

    public void setEstamina(int estamina) {
        this.estamina = estamina;
    }
}
