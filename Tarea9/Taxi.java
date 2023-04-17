public class Taxi extends Automovil {
    private String numeroLicencia;
    private String combustible;

    private int distancia;

    public Taxi() {
    }

    public Taxi(String tipo, boolean motorizado, int año, int cilindrada, String categoria, String color, String numeroLicencia, String combustible, int distancia) {
        super(tipo, motorizado, año, cilindrada, categoria, color);
        this.numeroLicencia = numeroLicencia;
        this.combustible = combustible;
        this.distancia = distancia;
    }

    public String getNumeroLicencia() {
        return numeroLicencia;
    }

    public void setNumeroLicencia(String numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "numeroLicencia='" + numeroLicencia + '\'' +
                ", combustible='" + combustible + '\'' +
                ", tarifa=" + distancia +
                '}';
    }
    @Override
    public void acelerar() {
        System.out.println("El Taxi esta acelerando...");
    }

    @Override
    public void frenar() {
        System.out.println("El Taxi esta frenando...");  //Para que sea mas especifico utilice el Override
    }

    @Override
    public void encender() {
        System.out.println("El Taxi esta prendido...");
    }

    @Override
    public void apagar() {
        System.out.println("El Taxi se esta apagando...");  //Para que sea mas especifico utilice el Override
    }
    public void recogerPasajero() {
        System.out.println("Recogiendo pasajero...");
    }

    public void dejarPasajero() {
        System.out.println("Dejando pasajero...");
    }
    public void hecharGastalina() {

        System.out.println("Hechando de la de Limon...");
    }

}