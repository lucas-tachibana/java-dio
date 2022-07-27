package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato1 = new Gato();
        gato1.setNome("Mimi");
        gato1.setIdade(7);
        gato1.setCor("Branco");

        System.out.println(gato1.toString());
    }
}
