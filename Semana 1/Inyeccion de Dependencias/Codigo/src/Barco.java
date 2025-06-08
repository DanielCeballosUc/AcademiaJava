public class Barco {
    Turbinas turbinas;

    void setTurbinas(Turbinas turbinas) {
        this.turbinas = turbinas;
    }

    void navegar() {
        turbinas.activar();
    }
}
