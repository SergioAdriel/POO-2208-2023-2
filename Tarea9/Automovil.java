public class Automovil extends  Vehiculo{
    private int cilindrada;
    private String categoria;
    private String color;

    public Automovil() {
    }

    public Automovil(String tipo, boolean motorizado, int año, int cilindrada, String categoria, String color) {
        super(tipo, motorizado, año);
        this.cilindrada = cilindrada;
        this.categoria = categoria;
        this.color = color;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "cilindrada=" + cilindrada +
                ", categoria=" + categoria +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void acelerar() {
        System.out.println("El automóvil esta acelerando...");
    }

    @Override
    public void frenar() {
        System.out.println("El automóvil esta frenando...");  //Para que sea mas especifico utilice el Override
    }

    public void encender() {
        System.out.println("El automóvil está encendido...");
    }

    public void apagar() {
        System.out.println("El automóvil se está apagando...");
    }

}
