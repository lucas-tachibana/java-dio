package br.com.dio.model;

public class Carro {
    String marca;
    String cor;
    int capacidadeTanque;

    public Carro(String marca, String cor, int capacidadeTanque) {
        this.marca = marca;
        this.cor = cor;
        this.capacidadeTanque = capacidadeTanque;
    }

    public Carro() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", cor='" + cor + '\'' +
                ", capacidadeTanque=" + capacidadeTanque +
                '}';
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public double totalValorTanque(double valorCombustivel){
        return valorCombustivel * capacidadeTanque;
    }
}
