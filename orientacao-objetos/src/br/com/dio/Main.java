package br.com.dio;

import br.com.dio.model.Carro;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.setCor("Azul");
        carro1.setMarca("Ford");
        carro1.setCapacidadeTanque(55);

        System.out.println(carro1.toString());
    }
}
