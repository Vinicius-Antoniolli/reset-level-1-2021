import java.util.Scanner;

public class Aula8Ex2 {
    public static void main(String[] args) {
        Scanner nDia = new Scanner(System.in);

        System.out.println("Digite um dia da semana (de 1 a 7) ");
        int diaDaSemana = nDia.nextInt();

        switch (diaDaSemana){
            case 1:
                System.out.println("\nHoje é Domingo");
                break;
            case 2:
                System.out.println("\nHoje é Segunda-Feira");
                break;
            case 3:
                System.out.println("\nHoje é Terça-Feira");
                break;
            case 4:
                System.out.println("\nHoje é Quarta-Feira");
                break;
            case 5:
                System.out.println("\nHoje é Quinta-Feira");
                break;
            case 6:
                System.out.println("\nHoje é Sextou");
                break;
            case 7:
                System.out.println("\nHoje é Sábado");
                break;
            default:
                System.out.println("\nValor inválido");
                break;
        }
    }
}



Digite um dia da semana (de 1 a 7) 
6

Hoje é Sextou
