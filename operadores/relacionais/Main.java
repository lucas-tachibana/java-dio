package operadores.relacionais;

public class Main {
    public static void main(String[] args) {
        int i1 = 3;
        int i2 = 9;

        System.out.println("i1 = " + i1 + " | i2 = " + i2);
        compararMenor(i1, i2);
        compararMaior(i1, i2);
        compararIgual(i1, i2);
    }

    public static void compararMenor(int i1, int i2) {
        System.out.println("i1 < i2 = " + (i1 < i2));
    }

    public static void compararMaior(int i1, int i2) {
        System.out.println("i1 > i2 = " + (i1 > i2));
    }

    public static void compararIgual(int i1, int i2) {
        System.out.println("i1 == i2 = " + (i1 == i2));
    }
}
