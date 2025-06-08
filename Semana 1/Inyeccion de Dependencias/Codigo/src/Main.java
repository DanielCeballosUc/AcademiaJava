public class Main {
    public static void main(String[] args) {
        // Inyeccion de dependencia por constructor
        // Se instancia la clase Motor
        Motor motor = new Motor();

        // Se instancia la clase Auto
        Auto auto = new Auto(motor);

        // Se ejecuta la funcionalidad
        auto.encenderAuto();

        // Inyeccion de dependencias por setter
        // Se instancia la clase Turbinas
        Turbinas turbinas = new Turbinas();

        // Se instancia la clase Barco
        Barco barco = new Barco();

        // Se inyectan dependencias
        barco.setTurbinas(turbinas);

        // Se ejecuta la funcionalidad
        barco.navegar();
    }
}