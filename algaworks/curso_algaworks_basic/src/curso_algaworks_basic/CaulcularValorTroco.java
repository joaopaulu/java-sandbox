package curso_algaworks_basic;

import java.util.Scanner;

public class CaulcularValorTroco {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.println("Digite quantidade passada pelo cliente: ");
		Double valorPassadoPeloCliente = scanner.nextDouble();
		
		Double resultado = valorPassadoPeloCliente - valorProduto;
		
		System.out.println("Troco: " + resultado);
		
		scanner.close();
	}
}
