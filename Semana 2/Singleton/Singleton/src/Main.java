//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Se obtiene la instancia de la impresora
        Impresora impresora1 = Impresora.getInstancia();

        // Se imprime un documento
        impresora1.imprimirDocumento("reporte.pdf");

        // Se obtiene nuevamente la impresora
        Impresora impresora2 = Impresora.getInstancia();

        // Se imprime un documento
        impresora2.imprimirDocumento("factura.docx");

        // Verificamos que solo una impresora se ha instanciado
        System.out.println("Numero Impresoras: " + Impresora.numeroImpresoras);
    }
}