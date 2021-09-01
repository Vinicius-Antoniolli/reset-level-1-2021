import java.util.Scanner;

public class Aula9Ex3 {
    public static void main(String[] args) {
        Scanner digitarNumeros = new Scanner(System.in);

        System.out.println("Digite um número:");
        double numero = digitarNumeros.nextDouble();
        double maiorNumero = numero;

        for (int i = 1; i < 5; i++) {
            System.out.println("Digite outro número:");
            numero = digitarNumeros.nextDouble();
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }
        System.out.println("\nO maior número é: " + maiorNumero);
    }
}


Digite um número:
351
Digite outro número:
12,8
Digite outro número:
68
Digite outro número:
128
Digite outro número:
356,9

O maior número é: 356.9
