public class MaquinaCafe {
    private int agua;
    private int cafe;
    private int crema;
    private int vasos;

    public MaquinaCafe() {
        vasos = 50; // Estamos empezando con 50 vasos de ahuevo
    }
    public MaquinaCafe(int agua, int cafe, int crema, int vasos) {
        this.agua = agua;
        this.cafe = cafe;
        this.crema = crema;
        this.vasos = vasos;
    }
    public int getAgua() {
        return agua;
    }
    public void setAgua(int agua) {
        if (agua <= 5000) {
            this.agua = agua;
        } else {
            System.out.println("Error: valor de agua fuera de rango");
        }
    }
    public int getCafe() {
        return cafe;
    }
    public void setCafe(int cafe) {
        if (cafe <= 1000) {
            this.cafe = cafe;
        } else {
            System.out.println("Error: valor de café fuera de rango");
        }
    }
    public int getCrema() {
        return crema;
    }
    public void setCrema(int crema) {
        if (crema <= 1500) {
            this.crema = crema;
        } else {
            System.out.println("Error: valor de crema fuera de rango");
        }
    }
    public int getVasos() {
        return vasos;
    }

    public void setVasos(int vasos) {
        this.vasos = vasos;     //Aqui de awuiwi vamos a empezar con 50 vasos por lo que encapsular no tiene sentido alguno
    }

    @Override
    public String toString() {
        return "MaquinaCafe2{" +
                "agua=" + agua +
                ", cafe=" + cafe +
                ", crema=" + crema +
                ", vasos=" + vasos +
                '}';
    }
    //Aqui son las funciones tanto para servir cafe como para mostrar los niveles de la maquina, salu3
    public void servirAmericano() {
        if (agua >= 180 && cafe >= 15 && vasos > 0) {
            agua -= 180;
            cafe -= 15;
            vasos--;
            System.out.println("Sirviendo americano...");
        } else {
            System.out.println("\nNo se puede servir un café americano");
        }
    }
    public void servirExpreso() {
        if (agua >= 120 && cafe >= 20 && vasos > 0) {
            agua -= 120;
            cafe -= 20;
            vasos--;
            System.out.println("Sirviendo expreso...");
        } else {
            System.out.println("\nNo se puede servir un expreso");
        }
    }
    public void servirCapuchino() {
        if (agua >= 100 && cafe >= 14 && crema >= 70 && vasos > 0) {
            agua -= 100;
            cafe -= 14;
            crema -= 70;
            vasos--;
            System.out.println("Sirviendo capuchino...");
        } else {
            System.out.println("\nNo se puede servir un capuchino");
        }
    }
    public void mostrarDepositos() {
        System.out.println("-Depósitos actuales:");
        System.out.println("--Agua: " + agua + " ml");
        System.out.println("--Café: " + cafe + " g");
        System.out.println("--Crema: " + crema + " ml");
    }
    public void mostrarVasos() {
        System.out.println("-Vasos disponibles: " + vasos );
    }
}
