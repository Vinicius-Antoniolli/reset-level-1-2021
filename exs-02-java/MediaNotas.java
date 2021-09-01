import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner inserirNotas = new Scanner(System.in);

        System.out.println("Insira sua primeira nota: ");
        double nota1 = inserirNotas.nextDouble();

        System.out.println("Insira sua segunda nota: ");
        double nota2 = inserirNotas.nextDouble();

        System.out.println("Insira sua terceira nota: ");
        double nota3 = inserirNotas.nextDouble();

        System.out.println("Insira sua quarta nota: ");
        double nota4 = inserirNotas.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.println("\nSua média final é de " + media);
    }
}
