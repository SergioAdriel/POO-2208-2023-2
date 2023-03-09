public class Lámpara {
    private String tecnologia;
    private String tipo;
    private  int lumens;

    public Lámpara() {
    }

    public Lámpara(String tecnologia, String tipo, int lumens) {
        this.tecnologia = tecnologia;
        this.tipo = tipo;
        this.lumens = lumens;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getLumens() {
        return lumens;
    }

    public void setLumens(int lumens) {
        this.lumens = lumens;
    }

    @Override
    public String toString() {
        return "Lámpara{" +
                "tecnologia='" + tecnologia + '\'' +
                ", tipo='" + tipo + '\'' +
                ", lumens=" + lumens +
                '}';
    }

    public void prendida (int prendida){
        if (prendida >=1){
            System.out.println("La lampara esta prendida");
        }
        else {
            System.out.println("La lampara esta apagada");
        }
    }

    public void intensidad (int intensidad){
        System.out.println("La lampara esta al: " + intensidad + " % de potencia");
    }
}
