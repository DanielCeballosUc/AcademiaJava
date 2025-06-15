import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Variables para inicializar clase
        String nombre = "Java";
        String maestro = "Rugerio";

        List<String> alumnos = new ArrayList<>();
        alumnos.add("Daniel");
        alumnos.add("Abi");
        alumnos.add("Aaron");

        // Creacion de un objeto tipo clase
        Clase clase = new Clase(nombre, maestro, alumnos);

        // Verificacion que se asigna una copia defensiva a la clase
        alumnos.add("Juan");

        System.out.println("Asignacion de copia defensiva");
        System.out.println("Alumnos: " + alumnos);
        System.out.println("Clase Alumnos: " + clase.obtenerAlumnos());

        // Verificar que se retorna una copia defensiva
        List<String> nuevosAlumnos = clase.obtenerAlumnos();
        nuevosAlumnos.add("Emiliano");

        System.out.println("Retorno de copia defensiva");
        System.out.println("Alumnos: " + nuevosAlumnos);
        System.out.println("Clase Alumnos: " + clase.obtenerAlumnos());
    }
}