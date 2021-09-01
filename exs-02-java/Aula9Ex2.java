import java.util.Scanner;

public class Aula9Ex2 {
    public static void main(String[] args) {
        Scanner inserirNumero = new Scanner(System.in);

        System.out.println("Digite o valor inicial: ");
        double valorInicial = inserirNumero.nextDouble();

        boolean valorFinalMaior = false;
        double valorFinal = 0;
        do {
            System.out.println("Digite o valor final: ");
            valorFinal = inserirNumero.nextDouble();
            if (valorFinal > valorInicial) {
                valorFinalMaior = true;
            } else {
                System.out.println("O valor final precisa ser maior que o valor inicial, tente novamente.");
            }
        } while (!valorFinalMaior);

        for (double i = ++valorInicial; i < valorFinal; i++)
            System.out.print(i + ", ");
        System.out.println("são os valores entre eles.");
    }
}