package ejercicioTres;

public class Utilidades {
    //Metodo para sumar dos numeros
    public static double sumar(double a, double b) {
        return a + b;
    }

    //Metodo para restar dos numeros
    public static double restar(double a, double b) {
        return a - b;
    }

    //Metodo para multiplicar dos numeros
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    //Metodo para dividir dos numeros
    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir entre cero.");
        }
        return a / b;
    }
}
