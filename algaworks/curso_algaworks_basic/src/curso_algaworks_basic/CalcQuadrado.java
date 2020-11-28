package curso_algaworks_basic;

import java.util.Scanner;

public class CalcQuadrado {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um numero");
    Double numCalc = scanner.nextDouble();

    Double resultado = (numCalc * numCalc);

    System.out.println("O quadrado do numero "+ numCalc + " é " + resultado);

    scanner.close();
  
  }
}