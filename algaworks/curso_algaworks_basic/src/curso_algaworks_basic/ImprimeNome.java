package curso_algaworks_basic;

import java.util.Scanner;

public class ImprimeNome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        String nomeCompleto = nome + " " + sobrenome;

        System.out.println(nomeCompleto);

    }
}
