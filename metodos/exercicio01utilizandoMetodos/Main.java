package metodos.exercicio01utilizandoMetodos;

public class Main {
    public static void main(String[] args) {
        // Calculadora
        System.out.println("Exercício calculadora:");
        Calculadora.soma(3, 4);

        Calculadora.subtracao(7, 3);

        Calculadora.multiplicacao(7, 2);

        Calculadora.divisao(16, 4);

        // Mensagem
        System.out.println("Exercício Mensagem:");
        Mensagem.obterMensagem(7);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(23);

        // Empréstimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }
}
