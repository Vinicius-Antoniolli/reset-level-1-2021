import java.util.Scanner;

public class SalarioMensal {
    public static void main(String[] args) {
        Scanner inserirDadosTeclado = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora? ");
        double salarioHora = inserirDadosTeclado.nextDouble();

        System.out.println("Quantas horas você trabalha por mês? ");
        double horasMensais = inserirDadosTeclado.nextDouble();

        double salarioMensal = salarioHora*horasMensais;
        System.out.println("\nO seu salário é de R$" + salarioMensal);
    }
}


Quanto você ganha por hora? 
40
Quantas horas você trabalha por mês? 
200
    
O seu salário é de R$8000.0
