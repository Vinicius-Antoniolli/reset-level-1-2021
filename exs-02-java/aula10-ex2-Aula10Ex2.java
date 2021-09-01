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



Insira a 1a idade:
12
Insira a 2a idade:
29
Insira a 3a idade:
58
Insira a 4a idade:
10
Insira a 5a idade:
9
Insira a 6a idade:
69
Insira a 7a idade:
28
Insira a 8a idade:
3
Insira a 9a idade:
97
Insira a 10a idade:
8
Idades das pessoas: 
12.0
29.0
58.0
10.0
9.0
69.0
28.0
3.0
97.0
8.0

5 pessoas são maiores de idade.
