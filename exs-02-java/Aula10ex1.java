import java.util.Scanner;

public class Aula10ex1 {
    public static void main(String[] args) {
        Scanner typeValue = new Scanner(System.in);

        double[] primeiroVetor = new double[5];
        double[] segundoVetor = new double[primeiroVetor.length];

        for (int i = 0; i < primeiroVetor.length;
        i++){
            System.out.println("Insira o " + (i + 1) + "o valor:");
            primeiroVetor[i] = typeValue.nextDouble();
            segundoVetor[i] = primeiroVetor[i] * 2;
        }

        System.out.println("Valores do primeiro vetor: ");
        for (double valores : primeiroVetor) {
            System.out.println(valores);
        }

        System.out.println("Valores do segundo vetor: ");
        for (double valores : segundoVetor) {
            System.out.println(valores);
        }

    }
}
