import java.util.Scanner;

public class Aula10Ex2 {
    public static void main(String[] args) {
        Scanner inserirIdades = new Scanner(System.in);

        double[] idades = new double[10];
        int maiores = 0;

        for (int i = 0; i < idades.length; i++) {
            System.out.println("Insira a " + (i + 1) + "a idade:");
            idades[i] = inserirIdades.nextDouble();
            if (idades[i] >= 18) {
                maiores++;
            }
        }
        System.out.println("Idades das pessoas: ");
        for (double idade : idades) {
            System.out.println(idade);
        }
        System.out.println("");
        System.out.println(maiores + " pessoas são maiores de idade.");
    }
}
