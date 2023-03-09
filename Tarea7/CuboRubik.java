public class CuboRubik {
    private String color;
    private int tamano;
    private String mecanismo;


    public CuboRubik() {
    }

    public CuboRubik(String color, int tamano, String mecanismo) {
        this.color = color;
        this.tamano = tamano;
        this.mecanismo = mecanismo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public String getMecanismo() {
        return mecanismo;
    }

    public void setMecanismo(String mecanismo) {
        this.mecanismo = mecanismo;
    }

    @Override
    public String toString() {
        return "CuboRubik{" +
                "color='" + color + '\'' +
                ", tamano=" + tamano +
                ", mecanismo='" + mecanismo + '\'' +
                '}';
    }

    public void estado(int estado){
        if (estado >=1){
            System.out.println("El cubo esta desordenado");
        }
        else {
            System.out.println("El cubo esta resuelto");
        }
    }

    public void tiempo (int tiempo){
        System.out.println("El cubo a sido resuelto en: " + tiempo + "segundos");
    }
}
