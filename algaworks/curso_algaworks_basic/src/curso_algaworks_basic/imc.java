package curso_algaworks_basic;

import java.util.Scanner;

public class imc {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite seu peso");
    Double peso = scanner.nextDouble();

    System.out.println("Digite sua altura");
    Double altura = scanner.nextDouble();

    Double imc = peso / (altura * altura);

    System.out.println("O seu IMC é " + imc);

    scanner.close();
  }
}
