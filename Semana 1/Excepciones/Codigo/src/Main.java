import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        // Checked Exception
        try {
            File file = new File("archivo.txt");
            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no se encontró.");
        }

        // Multicatch Exception
        try {
            int dividendo = 0;
            int divisor = 0;

            double precio = dividendo/divisor;

            File file = new File("archivo.txt");
            FileReader fileReader = new FileReader(file);
        } catch (ArithmeticException e) {
            // Captura de excepción de división por cero
            System.out.println("Ocurrió una excepción de división por cero: " + e.getMessage());
        } catch (Exception e) {
            // Captura de cualquier otra excepción
            System.out.println("Ocurrió una excepción: " + e.getMessage());
        }

        // Union Catch Exception
        try {
            int[] numeros = {1, 2, 3};

            // Puede lanzar ArithmeticException
            int resultado = 10 / 0;

            // Puede lanzar ArrayIndexOutOfBoundsException
            System.out.println(numeros[5]);

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Ocurrió una excepción: " + e.getClass().getSimpleName());
            System.out.println("Mensaje: " + e.getMessage());
        }

        // Unchecked Example
        int[] enteros = {1, 2, 3};
        System.out.println(enteros[5]);
    }
}