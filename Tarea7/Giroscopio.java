public class Giroscopio {
    private double velocidadRotacion;
    private String tamano;
    private double peso;

    public Giroscopio() {
    }

    public Giroscopio(double velocidadRotacion, String tamano, double peso) {
        this.velocidadRotacion = velocidadRotacion;
        this.tamano = tamano;
        this.peso = peso;
    }

    public double getVelocidadRotacion() {
        return velocidadRotacion;
    }

    public void setVelocidadRotacion(double velocidadRotacion) {
        this.velocidadRotacion = velocidadRotacion;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Giroscopio{" +
                "velocidadRotacion=" + velocidadRotacion +
                ", tamano='" + tamano + '\'' +
                ", peso=" + peso +
                '}';
    }

    public void funcionando (int funcionando) {
        if (funcionando >=1){
            System.out.println("El giroscopio esta funcionando perfectamente");
        }
        else {
            System.out.println("No jala");
        }

    }

    public void intensidadGiro (int intensidadGiro){
        System.out.println("El giroscopio esta al: " + intensidadGiro + " % de potencia");
    }
}
