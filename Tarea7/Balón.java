public class Balón {
    private String deporte;
    private String color;
    private String tamanoBalon;

    public Balón() {
    }

    public Balón(String deporte, String color, String tamanoBalon) {
        this.deporte = deporte;
        this.color = color;
        this.tamanoBalon = tamanoBalon;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamanoBalon() {
        return tamanoBalon;
    }

    public void setTamanoBalon(String tamanoBalon) {
        this.tamanoBalon = tamanoBalon;
    }

    @Override
    public String toString() {
        return "Balón{" +
                "deporte='" + deporte + '\'' +
                ", color='" + color + '\'' +
                ", tamanoBalon=" + tamanoBalon +
                '}';
    }

    public void desinflado(int desinflado){
        if (desinflado >=7){
            System.out.println("El balón no esta desinflado");
        }
        if (desinflado >=5){
            System.out.println("El balón esta un poco desinflado");  //De 1 a 5 esta super-desinflado y de 5 a 7 regular y mas esta completo
        }
        else {
            System.out.println("El balón esta muy desinflado");
        }
    }

    public void disponibleBalon (int disponibleBalon){
        if (disponibleBalon >=1){
            System.out.println("El balón no esta disponible");
        }
        else {
            System.out.println("El balón esta disponible");
        }
    }
}
