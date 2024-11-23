package ejercicioTres;

public class Main {
    public static void main(String[] args) {
        //Valores para pruebas
        double a = 10.0;
        double b = 5.0;

        //Pruebas de las operaciones matemáticas
        System.out.println("Operaciones matemáticas:");

        //Suma
        System.out.println("Suma (" + a + " + " + b + "): " + Utilidades.sumar(a, b));

        //Resta
        System.out.println("Resta (" + a + " - " + b + "): " + Utilidades.restar(a, b));

        //Multiplicacion
        System.out.println("Multiplicación (" + a + " * " + b + "): " + Utilidades.multiplicar(a, b));

        //Division
        System.out.println("División (" + a + " / " + b + "): " + Utilidades.dividir(a, b));

        //Intentar dividir entre cero para validar la excepcion
        try {
            System.out.println("División entre cero: " + Utilidades.dividir(a, 0));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
