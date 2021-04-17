import java.util.Scanner;

public class LeituraDadosTeclado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine();

        System.out.println("Digite sua idade: ");
        String idade = scan.nextLine();
        System.out.println("Seu nome é " + nomeCompleto + ", sua idade é " + idade + " anos");


    }
}
