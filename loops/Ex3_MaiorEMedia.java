package loops;

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int maior = 0;
        int menor = 9999;
        float soma = 0;
        int quantidadeNumeros = 5;

        for (int i = 0; i < quantidadeNumeros; i++) {
            System.out.println("Digite o " + (i + 1) + "o numero ");
            int numero = scan.nextInt();
            maior = pegaMaior(numero, maior);
            menor = pegaMenor(numero, menor);
            soma += numero;
        }

        float media = soma / quantidadeNumeros;
        System.out.println("O maior número foi: " + maior);
        System.out.println("O menor número foi: " + menor);
        System.out.println("A média dos números foi: " + media);

        scan.close();
    }

    public static int pegaMaior(int numero, int maior) {
        if (numero > maior)
            return numero;
        else
            return maior;
    }

    public static int pegaMenor(int numero, int menor) {
        if (numero > menor)
            return menor;
        else
            return numero;
    }

}
