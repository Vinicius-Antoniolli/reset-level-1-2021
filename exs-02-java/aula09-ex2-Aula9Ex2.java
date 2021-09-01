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


Digite o valor inicial: 
31
Digite o valor final: 
25
O valor final precisa ser maior que o valor inicial, tente novamente.
Digite o valor final: 
39
32.0, 33.0, 34.0, 35.0, 36.0, 37.0, 38.0, são os valores entre eles.
