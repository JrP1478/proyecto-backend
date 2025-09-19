package main.java;

public class hola {
    public static void main(String[] args) {
        int valor = 200;
        int valor2 = 50;
        int valor3 =60;

        System.out.println(funcionSuma(valor, valor2, valor3));
    }

    public static String funcionSuma(int valorx, int valorY, int valorZ){

        int suma = valorx * valorY * valorZ;

        return "La multiplicación de estos dos valores es: " + suma;
    }
}
