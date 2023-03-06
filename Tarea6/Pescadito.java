public class Pescadito {
    private double tamaño;
    private String especie;
    private String color;
    private String temperamento;

    public Pescadito() {
        // Constructor por defecto
    }

    public Pescadito(double tamaño, String especie, String color, String temperamento) {
        // Constructor sobrecargado
        this.tamaño = tamaño;
        this.especie = especie;
        this.color = color;
        this.temperamento = temperamento;
    }

    // Métodos de acceso
    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTemperamento() {
        return temperamento;
    }

    public void setTemperamento(String temperamento) {
        this.temperamento = temperamento;
    }

    // Método toString
    @Override
    public String toString() {
        return "Pescadito{" +
                "tamaño=" + tamaño +
                ", especie='" + especie + '\'' +
                ", color='" + color + '\'' +
                ", temperamento='" + temperamento + '\'' +
                '}';
    }

    // Métodos de uso general
    public void nadar() {
        System.out.println("El pescado está nadando.");
    }

    public void comer() {
        System.out.println("El pescado está comiendo.");
    }

    public void dormir() {
        System.out.println("El pescado está durmiendo.");
    }
}