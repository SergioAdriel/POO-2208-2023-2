public class Vehiculo {
    private String tipo; //Si es un coche una moto o una bicicleta
    private boolean motorizado;
    private int año;

    public Vehiculo() {
    }

    public Vehiculo(String tipo, boolean motorizado, int año) {
        this.tipo = tipo;
        this.motorizado = motorizado;
        this.año = año;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isMotorizado() {
        return motorizado;
    }

    public void setMotorizado(boolean motorizado) {
        this.motorizado = motorizado;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "tipo='" + tipo + '\'' +
                ", motorizado=" + motorizado +
                ", año=" + año +
                '}';
    }

    public void acelerar() {
        System.out.println("La/El " + tipo + " está acelerando...");
    }

    public void frenar() {
        System.out.println("La/El " + tipo + " está frenando...");
    }
}
