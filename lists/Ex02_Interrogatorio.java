package lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex02_Interrogatorio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> perguntas = new ArrayList<>() {
            {
                add("Telefonou para a vítima?");
                add("Esteve no local do crime?");
                add("Mora perto da vítima?");
                add("Devia para a vítima?");
                add("Já trabalhou com a vítima?");
            }
        };
        List<String> respostas = new ArrayList<>();
        int quantidadeRespostasSim = 0;

        for (int i = 0; i < perguntas.size(); i++) {
            System.out.println(perguntas.get(i));
            String resposta = scan.next();

            respostas.add(resposta);
            if (ehAfirmacao(resposta)) {
                quantidadeRespostasSim++;
            }
        }

        System.out.println("Respondeu sim " + quantidadeRespostasSim + " vezes.");
        System.out.println("Classificação: " + classificarInterrogado(quantidadeRespostasSim));

        scan.close();

    }

    public static boolean ehAfirmacao(String resposta) {
        String[] sims = { "Sim", "sim", "s", "S" };
        for (String sim : sims) {
            if (resposta.equals(sim)) {
                return true;
            }
        }
        return false;
    }

    public static String classificarInterrogado(int quantidadeRespostasSim) {
        String classisficacao = null;
        switch (quantidadeRespostasSim) {
            case 0:
            case 1:
                classisficacao = "Inocente";
                break;
            case 2:
                classisficacao = "Suspeita";
                break;
            case 3:
            case 4:
                classisficacao = "Cúmplice!";
                break;
            case 5:
                classisficacao = "Culpada!!!";
                break;

            default:
                classisficacao = "Não foi possível classificar, refaça o interrogatório";
                break;

        }
        return classisficacao;
    }

}
