package arrays;

import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] letras = new char[6];
        char[] vogais = new char[] { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
        int contagemConsoantes = 0;

        for (int i = 0; i < letras.length; i++) {
            System.out.println("Digite uma letra: ");
            char caractere = scan.next().charAt(0);
            boolean ehVogal = false;
            for (var vogal : vogais) {
                if (caractere == vogal) {
                    ehVogal = true;
                    continue;
                }
            }
            if (ehVogal) {
                System.out.println("Você digitou uma vogal: " + caractere);
                letras[i] = 0;
            } else {
                letras[i] = caractere;
                System.out.println("Você digitou uma consoante: " + caractere);
                contagemConsoantes++;

            }
        }

        System.out.println("Você digitou " + contagemConsoantes + " consoantes. E elas são:");

        for (char consoante : letras) {
            if (consoante != 0)
                System.out.print(consoante + " ");
        }
        scan.close();
    }
}
