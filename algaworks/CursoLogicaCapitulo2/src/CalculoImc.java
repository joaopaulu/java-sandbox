import java.util.Scanner;

public class CalculoImc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CÁLCULO DO ÍNDICE DE MASSA CORPORAL");

        System.out.print("Digite seu peso (em Kg): ");
        Double peso = scanner.nextDouble();

        System.out.print("Digite sua altura (em metros): ");
        Double altura = scanner.nextDouble();

        Double imc = peso / (altura * altura);

        System.out.println("Seu IMC é: " + imc);

        scanner.close();

    }
}
