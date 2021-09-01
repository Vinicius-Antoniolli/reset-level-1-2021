import java.util.Scanner;

class AlunoResetLeituraTeclado {

    public static void main(String[] args) {
        System.out.println("Digite seu nome completo: ");
        Scanner sc = new Scanner(System.in);
        String nomeCompleto = sc.nextLine();
        System.out.println("\nSou aluno do Level 1 do CWI Reset! Me chamo " + nomeCompleto);
    }
}