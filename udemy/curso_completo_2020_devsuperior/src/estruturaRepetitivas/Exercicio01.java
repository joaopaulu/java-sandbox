package estruturaRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senha = sc.nextInt();

        while (senha != 2002){
            System.out.println("Senha inválida!");
            senha = sc.nextInt();
        }
        System.out.println("Senha correta");
        sc.close();
    }
}