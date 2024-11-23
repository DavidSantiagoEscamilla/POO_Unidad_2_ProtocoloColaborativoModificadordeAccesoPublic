package ejercicioUno;

//Clase de prueba
public class Main {
    public static void main(String[] args) {
        //Crear objetos de la clase Empleado
        Empleado empleado1 = new Empleado("Juan Perez", 50000);
        Empleado empleado2 = new Empleado("Ana Gomez", 60000);

        //Acceder y mostrar la propiedad publica nombre
        System.out.println("Empleado 1: " + empleado1.nombre);
        System.out.println("Empleado 2: " + empleado2.nombre);

        //Acceder al salario a traves del metodo getter
        System.out.println("Salario de " + empleado1.nombre + ": " + empleado1.getSalario());
        System.out.println("Salario de " + empleado2.nombre + ": " + empleado2.getSalario());

        //Modificar el salario utilizando el metodo setter
        empleado1.setSalario(55000);
        System.out.println("Nuevo salario de " + empleado1.nombre + ": " + empleado1.getSalario());

        //Intentar asignar un salario negativo para ver la validacion
        try {
            empleado2.setSalario(-10000);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
