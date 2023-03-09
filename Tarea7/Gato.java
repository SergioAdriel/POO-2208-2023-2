public class Gato {
    private String raza;
    private String color;
    private char sexo;  //H de hembra y M de macho

    public Gato() {
    }

    public Gato(String raza, String color, char sexo) {
        this.raza = raza;
        this.color = color;
        this.sexo = sexo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "raza='" + raza + '\'' +
                ", color='" + color + '\'' +
                ", sexo=" + sexo +
                '}';
    }

    public void dormido (int dormido){
        if (dormido >=1){
            System.out.println("El gato esta bien jetón");
        }
        else {
            System.out.println("El gato esta despierto");
        }
    }
                                                                  // Un gato o duerme ó come, lo digo por experiencia personal
    public void comiendo (int comiendo){
        if (comiendo >=1){
            System.out.println("El gato esta comiendo");
        }
        else {
            System.out.println("El gato no esta comiendo");
        }
    }

}
