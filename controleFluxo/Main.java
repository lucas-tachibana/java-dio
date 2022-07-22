package controleFluxo;

public class Main {
    public static void main(String[] args) {
        numeroMes(2);
        numeroMes(4);
        numeroMes(6);
        numeroMes(12);
        numeroMes(15);
        numeroMes(0);
    }

    public static void numeroMes(int numeroMes) {
        String nomesMeses[] = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto",
                "Setembro", "Outubro", "Novembro", "Dezembro" };
        int indexMes = --numeroMes;

        if (numeroMes < 1 || numeroMes > 12) {
            System.out.println("Número  do mês inválido");
            return;
        }

        System.out.println(nomesMeses[indexMes]);
    }
}
