package loops;

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeroTabuada;
        System.out.println("Digite o número para calcular a tabuada");
        numeroTabuada = scan.nextInt();

        System.out.println("Tabuada de " + numeroTabuada);

        for (int i = 0; i < 10; i++) {
            int index = (i + 1);
            int calculo = numeroTabuada * index;
            System.out.println(numeroTabuada + " X " + index + " = " + calculo);

        }

        scan.close();
    }
}
