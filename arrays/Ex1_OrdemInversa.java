package arrays;

/*
Crie um vetor de 6 números inteiros e 
mostre-os na ordem inversa.
*/
public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        int[] numeros = { 4, 24, 42, 53, 44, 63 };

        System.out.println("O vetor é: ");
        for (int i : numeros) {
            System.out.print(i + " ");
        }

        System.out.println("\nA ordem inversa do vetor é: ");

        for (int i = (numeros.length - 1); i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\n======== Outra maneira ========");

        System.out.println("O vetor é: ");
        imprimeArray(numeros);

        System.out.println("\nA ordem inversa do vetor é: ");
        int[] arrayInvertido = inverteArray(numeros);
        imprimeArray(arrayInvertido);

    }

    public static int[] inverteArray(int[] numeros) {
        int[] numerosInvertidos = new int[numeros.length];
        int index = 0;

        for (int i = (numeros.length - 1); i >= 0; i--) {
            numerosInvertidos[index] = numeros[i];
            index++;
        }
        return numerosInvertidos;

    };

    public static void imprimeArray(int[] numeros) {
        for (int i : numeros) {
            System.out.print(i + " ");
        }
    }

}
