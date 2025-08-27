package main;

public class App {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        System.out.println("Soma: " + soma(a, b));
        System.out.println("Subtração: " + subtrai(a, b));

        try {
            System.out.println("Divisão: " + divide(a, b));
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("Multiplicação: " + multiplica(a, b));
    }

    public static int soma(int x, int y) {
        return x + y;
    }

    public static int subtrai(int x, int y) {
        return x - y;
    }

    public static int multiplica(int x, int y) {
        return x * y;
    }

    public static int divide(int x, int y) {
        return x / y; // Isso vai gerar ArithmeticException se y = 0
    }
}
