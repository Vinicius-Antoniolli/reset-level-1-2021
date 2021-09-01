import java.util.Scanner;

public class Aula9Ex1 {
    public static void main(String[] args) {
        Scanner nota = new Scanner(System.in);

        System.out.println("Insira a sua nota: ");
        boolean notaValida = false;

        while (!notaValida){
            double suaNota = nota.nextDouble();
            if (suaNota<=10){
                notaValida = true;
                System.out.println("\nSua nota é de: " + suaNota);
            }
            else {
                System.out.println("Insira uma nota válida (de 0 a 10) ");
            }
        }
    }
}



Insira a sua nota: 
15
Insira uma nota válida (de 0 a 10) 
12
Insira uma nota válida (de 0 a 10) 
10

Sua nota é de: 10.0
