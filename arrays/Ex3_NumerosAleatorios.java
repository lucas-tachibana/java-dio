package arrays;

import java.util.Random;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("Os números gerados são: ");
        for (int i : numerosAleatorios) {
            System.out.print(i + " ");
        }

        System.out.println("\nOs sucessores são: ");
        for (int i : numerosAleatorios) {
            System.out.print((i + 1) + " ");
        }
    }
}
