import java.util.Scanner;

public class SalarioMensal {
    public static void main(String[] args) {
        Scanner inserirDadosTeclado = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora? ");
        double salarioHora = inserirDadosTeclado.nextDouble();

        System.out.println("Quantas horas você trabalha por mês? ");
        double horasMensais = inserirDadosTeclado.nextDouble();

        double salarioMensal = salarioHora*horasMensais;
        System.out.println("O seu salário é de R$" + salarioMensal);
    }
}
