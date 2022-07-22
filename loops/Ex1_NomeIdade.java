package loops;

import java.util.Scanner;

public class Ex1_NomeIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nomeAluno;
        int idadeAluno;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Digite o nome do aluno:");
            nomeAluno = scan.next();

            if (nomeAluno.equals("0")) {
                continuar = false;
                break;
            }
            System.out.println("Digite a idade do aluno:");
            idadeAluno = scan.nextInt();

            System.out.println("Nome: " + nomeAluno + " | Idade: " + idadeAluno);
            System.out.println("=================================");
        }
        ;

    }
}
