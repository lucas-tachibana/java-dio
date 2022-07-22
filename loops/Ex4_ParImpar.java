package loops;

import java.util.Scanner;

public class Ex4_ParImpar {
    static int quantidadePares;
    static int quantidadeImpares;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeNumeros;

        System.out.println("Digite a quantidade de números: ");
        quantidadeNumeros = scan.nextInt();

        for (int i = 0; i < quantidadeNumeros; i++) {
            System.out.println("Digite o " + (i + 1) + " número: ");
            int numero = scan.nextInt();
            parOuImpar(numero);
        }

        System.out.println("Você digitou " + quantidadePares + " números pares");
        System.out.println("Você digitou " + quantidadeImpares + " números ímpares");

        scan.close();

    }

    public static void parOuImpar(int numero) {
        if ((numero % 2) == 0) {
            System.out.println(numero + " é par");
            quantidadePares++;
        } else {
            System.out.println(numero + " é ímpar");
            quantidadeImpares++;
        }
    }

}
