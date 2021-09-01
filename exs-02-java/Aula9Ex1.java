import java.util.Scanner;

public class Aula9Ex1 {
    public static void main(String[] args) {
        Scanner nota = new Scanner(System.in);

        System.out.println("Insira a sua nota: ");
        boolean notaValida = false;

        do {
            double suaNota = nota.nextDouble();
            if (suaNota<=10){
                notaValida = true;
                System.out.println("\nSua nota é de: " + suaNota);
            }
            else {
                System.out.println("Insira uma nota válida (de 0 a 10) ");
            }
        } while (!notaValida);
    }
}
