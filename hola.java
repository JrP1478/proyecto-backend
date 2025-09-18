public class hola {
    public static void main(String[] args) {
        int valor = 20;
        int valor2 = 30;

        System.out.println(funcionSuma(valor, valor2));
    }

    public static String funcionSuma(int valorx, int valorY){
            
            int suma = valorx + valorY;

            return "La suma de estos dos valores es:" + suma;
    }
}
