// Clase implementada con le patron Singleton
public class Impresora {
    // Característica: instancia única de la clase (privada y estática)
    private static Impresora instancia;
    public static int numeroImpresoras;

    // Característica: constructor privado para evitar instanciación externa
    private Impresora() {
        System.out.println("Impresora inicializada.");
        numeroImpresoras++;
    }

    // Característica: método para el acceso global de la instancia
    public static Impresora getInstancia() {
        // Si la instancia es null la crea
        if (instancia == null) {
            instancia = new Impresora();
        }

        // Si la instancia existe la retorna
        return instancia;
    }

    // Metodo para simular imprimir un documento
    public void imprimirDocumento(String nombreDocumento) {
        System.out.println("Imprimiendo: " + nombreDocumento);
    }
}