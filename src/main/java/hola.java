package main.java;

public class hola {
    public static void main(String[] args) {
        int valor = 200;
        int valor2 = 50;

        System.out.println(funcionSuma(valor, valor2));
    }

    public static String funcionSuma(int valorx, int valorY){

        int suma = valorx * valorY;

        return "La multiplicación de estos dos valores es: " + suma;
    }
}
