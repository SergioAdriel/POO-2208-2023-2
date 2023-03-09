public class Computadora {
private String tipo;
private String sistemaOperativo;
private double ram;

    public Computadora() {
    }

    public Computadora(String tipo, String sistemaOperativo, double ram) {
        this.tipo = tipo;
        this.sistemaOperativo = sistemaOperativo;
        this.ram = ram;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String sistemaOperativo() {
        return sistemaOperativo;
    }

    public void setGeneracion(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public double getRam() {
        return ram;
    }

    public void setRam(double ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "tipo='" + tipo + '\'' +
                ", generacion=" + sistemaOperativo +
                ", ram=" + ram +
                '}';
    }

    public void encender() {
        System.out.println("El PC se ha encendido.");
    }
    public void apagar() {
        System.out.println("El PC se ha apagado.");
    }
}
