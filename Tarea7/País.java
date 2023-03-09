public class País {
    private String nombre;
    private double poblacion;
    private double extensionTerritorial;

    public País() {
    }

    public País(String nombre, double poblacion, double extensionTerritorial) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.extensionTerritorial = extensionTerritorial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(double poblacion) {
        this.poblacion = poblacion;
    }

    public double getExtensionTerritorial() {
        return extensionTerritorial;
    }

    public void setExtensionTerritorial(double extensionTerritorial) {
        this.extensionTerritorial = extensionTerritorial;
    }

    @Override
    public String toString() {
        return "País{" +
                "nombre='" + nombre + '\'' +
                ", poblacion=" + poblacion +
                ", extensionTerritorial=" + extensionTerritorial +
                '}';
    }

    public void informarPoblacion() {
        System.out.println("La población de " + nombre + " es de " + poblacion + " habitantes.");
    }
    public double calcularDensidadPoblacional() {
        double densidad = poblacion / extensionTerritorial;
        return densidad;
    }
    public void saludar() {
        System.out.println("¡Hola desde " + nombre + "!");
    }
}