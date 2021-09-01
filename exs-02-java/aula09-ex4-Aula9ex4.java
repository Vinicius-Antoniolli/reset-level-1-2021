import java.util.Scanner;

public class Aula9ex4 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Digite o número desejado para calculo da sua tabuada");
        int numero = num.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(numero + "x" + i + " = " +(i*numero));
        }
    }
}



Digite o número desejado para calculo da sua tabuada
11
11x1 = 11
11x2 = 22
11x3 = 33
11x4 = 44
11x5 = 55
11x6 = 66
11x7 = 77
11x8 = 88
11x9 = 99
11x10 = 110
