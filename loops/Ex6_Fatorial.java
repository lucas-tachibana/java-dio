package loops;

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número para calcular fatorial");
        int fatorial = scan.nextInt();
        int total = 1;
        for (int i = fatorial; i > 0; i--) {
            int calculo = total;
            total *= i;
            System.out.println("total: " + calculo + " X " + i + " = " + total);

        }

        System.out.println("O resultado de " + fatorial + "! é " + total);

        scan.close();
    }
}
