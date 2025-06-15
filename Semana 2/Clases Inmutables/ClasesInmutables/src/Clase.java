import java.util.ArrayList;
import java.util.List;

// Paso 1: Declarar la clase final
public final class Clase {
    // Paso 2: Declarar los atributos como private y final
    private final String nombre;
    private final String maestro;
    private final List<String> alumnos;

    // Paso 3: Inicializar los valores de los atributos
    public Clase(final String nombre,
                 final String maestro,
                 final List<String> alumnos) {
        this.nombre = nombre;
        this.maestro = maestro;

        // Paso 4: Realizar copia defensiva para la inicializacion
        this.alumnos = new ArrayList<String>(alumnos);
    }

    // Paso 5: Definir metodos sin permitir modificaciones
    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerMaestro() {
        return maestro;
    }

    // Paso 4: Devolver copia defensiva de los objetos mutables
    public List<String> obtenerAlumnos() {
        return new ArrayList<String>(alumnos);
    }

    public int obtenerNumeroAlumnos() {
        return alumnos.size();
    }
}