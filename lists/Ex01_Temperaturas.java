package lists;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ex01_Temperaturas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<>();
        List<String> meses = new ArrayList<>() {
            {
                add("Janeiro");
                add("Fevereiro");
                add("Março");
                add("Abril");
                add("Maio");
                add("Junho");
                add("Julho");
            }
        };

        for (int i = 0; i < meses.size(); i++) {
            System.out.println("Digite a temperatura média do mês de " + meses.get(i));
            temperaturas.add(scan.nextDouble());
        }

        double soma = 0;
        Iterator<Double> iterator = temperaturas.iterator();
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        double media = soma / temperaturas.size();
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("A média das temperaturas é: " + df.format(media));

        System.out.println("================");

        System.out.println("Temperaturas acima da média");
        for (int i = 0; i < temperaturas.size(); i++) {
            if (temperaturas.get(i) > media) {
                System.out.println((i + 1) + " - " + meses.get(i) + " - " + temperaturas.get(i) + " °C");
            }
        }
        scan.close();
    }
}
