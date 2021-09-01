import java.util.Scanner;

public class Aula9ex4 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Digite o numero desejado para calculo da sua tabuada");
        int numero = num.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(numero + "x" + i + "=" +(i*numero));
        }
    }
}
