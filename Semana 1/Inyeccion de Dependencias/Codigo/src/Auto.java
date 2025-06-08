public class Auto {
    Motor motor;

    public Auto(Motor motor) {
        this.motor = motor;
    }

    void encenderAuto() {
        motor.encender();
    }
}
