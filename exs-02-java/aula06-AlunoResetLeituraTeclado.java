import java.util.Scanner;

public class AlunoResetLeituraTeclado {

    public static void main(String[] args) {
        
        Scanner inserirNome = new Scanner(System.in);
        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = inserirNome.nextLine();
        System.out.println("\nSou aluno do Level 1 do CWI Reset! Me chamo " + nomeCompleto);
    }
}
