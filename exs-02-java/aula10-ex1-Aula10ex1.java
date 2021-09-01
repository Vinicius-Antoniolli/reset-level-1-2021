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



Insira o 1o valor:
10
Insira o 2o valor:
20
Insira o 3o valor:
30
Insira o 4o valor:
40
Insira o 5o valor:
50
Valores do primeiro vetor: 
10.0
20.0
30.0
40.0
50.0
Valores do segundo vetor: 
20.0
40.0
60.0
80.0
100.0
