package arrays;

import java.util.Random;

public class Ex4_ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] matrizNumeros = new int[4][4];

        for (int i = 0; i < matrizNumeros.length; i++) {
            for (int j = 0; j < matrizNumeros[i].length; j++) {
                matrizNumeros[i][j] = random.nextInt(9);
            }

        }

        for (int[] linha : matrizNumeros) {
            for (int coluna : linha) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }
    }
}
