import java.util.Scanner;

public class Aula8Ex1 {
    public static void main(String[] args) {
        Scanner notasAluno = new Scanner(System.in);

        System.out.println("Insira sua primeira nota: ");
        double nota1 = notasAluno.nextDouble();

        System.out.println("Insira sua segunda nota: ");
        double nota2 = notasAluno.nextDouble();

        System.out.println("Insira sua terceira nota: ");
        double nota3 = notasAluno.nextDouble();

        System.out.println("Insira sua quarta nota: ");
        double nota4 = notasAluno.nextDouble();

        double mediaNotas = (nota1+nota2+nota3+nota4)/4;

        if (mediaNotas==10){
            System.out.println("\nAluno aprovado com louvores");
        }   else if (mediaNotas >= 7) {
            System.out.println("\nAluno aprovado");
        }   else {
            System.out.println("\nAluno reprovado");
        }

    }
}



Insira sua primeira nota: 
5,6
Insira sua segunda nota: 
8,1
Insira sua terceira nota: 
9,7
Insira sua quarta nota: 
7,8

Aluno aprovado
