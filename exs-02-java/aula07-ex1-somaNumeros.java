import java.util.Scanner;

public class somaNumeros {
    public static void main(String[] args) {
        Scanner inserirNumeros = new Scanner(System.in);

        System.out.println("Insira o primeiro numero:");
        int numero1 = inserirNumeros.nextInt();
        System.out.println("Insira o segundo numero:");
        int numero2 = inserirNumeros.nextInt();
        int resultado = numero1 + numero2;
        System.out.println("A soma dos dois valores é: " + resultado);
    }
}


Insira o primeiro numero:
10
Insira o segundo numero:
5
A soma dos dois valores é: 15
