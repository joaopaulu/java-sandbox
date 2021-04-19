import java.util.Scanner;

public class CalcularValorTroco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        Double valorProduto = scanner.nextDouble();

        System.out.println("Digite a quantidade passada pelo cliente: ");
        Double valorDoCliente = scanner.nextDouble();

        Double resultado = valorDoCliente - valorProduto;

        System.out.println("Troco: " +resultado);

        scanner.close();
    }
}
