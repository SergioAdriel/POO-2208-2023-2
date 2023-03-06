import java.awt.Color;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n\n\t\t\t     Tarea 6\n\t\tby Sergio Adriel Muñoz Camarena\n\t\t          CLASES");

        System.out.println("\n\tPrueba de la clase Persona:");
        Persona persona1 = new Persona(30, "Chona", 1.65, 60, "F");
        System.out.println(persona1);
        persona1.caminar();
        persona1.comer();
        persona1.hablar();
        System.out.println(persona1.toString());

        System.out.println("\n\tPrueba de la clase Monitor:");
        Monitor monitor1 = new Monitor(24, "Samsung", "S24F350FHL", "LED", 200);
        System.out.println(monitor1);
        monitor1.encender();
        monitor1.ajustarBrillo(50);
        monitor1.apagar();
        System.out.println(monitor1.toString());


        System.out.println("\n\tPrueba de la clase Automovil:");
        Automovil auto1 = new Automovil();
        auto1.setMarca("MITSUBISHI");
        auto1.setSubMarca("Model S");
        auto1.setModelo((byte) 21);
        auto1.setColor(Color.RED);
        System.out.println(auto1);
        Automovil auto2 = new Automovil("Honda", "Civic", (byte) 20, Color.BLUE);
        System.out.println(auto2);
        System.out.println(auto1.toString());
        System.out.println(auto2.toString());



        System.out.println("\n\tPrueba de la clase Pescadito:");
        Pescadito p1 = new Pescadito(10.5, "Salmón", "Plateado", "Tranquilo");
        System.out.println("Especie: " + p1.getEspecie());
        System.out.println("Tamaño: " + p1.getTamaño());
        System.out.println("Color: " + p1.getColor());
        System.out.println("Temperamento: " + p1.getTemperamento());
        p1.nadar();
        p1.comer();
        p1.dormir();
        System.out.println(p1.toString());
    }
}