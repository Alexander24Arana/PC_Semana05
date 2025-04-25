public class Calculadora {

    // Suma de dos enteros
    public int sumar(int a, int b) {
        return a + b;
    }

    // Suma de tres enteros
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    // Suma de dos números decimales
    public double sumar(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // Pruebas
        System.out.println("Suma de 2 enteros: " + calc.sumar(5, 7));
        System.out.println("Suma de 3 enteros: " + calc.sumar(1, 2, 3));
        System.out.println("Suma de 2 decimales: " + calc.sumar(4.5, 3.2));
    }
}
