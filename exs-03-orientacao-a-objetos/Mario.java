package AulasMario;

public class Mario {
    private String nome;
    private double altura;
    private int idade;
    private int estamina;
    private int moedas;
    private int vidas;

    public Mario() {
        this.nome = "Mario Bros";
        this.idade = 40;
        this.estamina = 100;
        this.altura = 1.5;
        this.moedas = 0;
        this.vidas = 1;
    }

    public Mario(String nome, double altura, int idade) {
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
        this.estamina = 100;
        this.moedas = 0;
        this.vidas = 1;
    }

    public void imprimeCaracteristicas() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Altura: " + this.getAltura() + "m.");
        System.out.println("Idade: " + this.getIdade() + " anos.");
        System.out.println("Você tem " + this.getVidas() + " vida(s)");
        System.out.println("Possui " + this.getMoedas() + " moedas.");
        System.out.println("Ele tem " + this.getEstamina() + " de energia.");
    }

    public void imprimeSuperPoderes() {
        System.out.println("Super salto, respirar em baixo d'água, manipulação de tamanho");
    }

    public void perdeEstamina() {
        this.estamina = this.estamina - 10;
        if (this.estamina < 0) {
            this.estamina = 0;
        }
    }

    public void ganhaEstamina() {
        this.estamina = this.estamina + 5;
        if (this.estamina > 100) {
            this.estamina = 100;
        }
    }

    public void cresce() {
        this.altura = this.altura * 2;
    }

    public void revigorar(){
        this.estamina = 100;
    }

    public void morrer(){
        this.vidas--;
        this.estamina = 0;
        if(vidas<0){
            vidas=0;
            System.out.println("GAME OVER");
        } else {
            revigorar();
        }
    }

    public void coletarMoedas(){
        this.moedas++;
        if (moedas % 10 == 0){
            vidas++;
        }
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

    public int getEstamina() {
        return estamina;
    }

    public void setEstamina(int estamina) {
        this.estamina = estamina;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public int getMoedas() {
        return moedas;
    }

    public void setMoedas(int moedas) {
        this.moedas = moedas;
    }
}