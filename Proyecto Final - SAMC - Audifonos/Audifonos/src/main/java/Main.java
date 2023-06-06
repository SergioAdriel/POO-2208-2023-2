import Vista.Ventana; // Importar la clase Ventana del paquete Vista
import Controlador.ControladorAudifonos; // Importar la clase ControladorAudifonos del paquete Controlador

public class Main {
    public static void main(String[] args) {
        System.out.println("Aquí estuvo el Sercho"); // Imprimir un mensaje misterioso
        Ventana ventana = new Ventana("Tabla de Audífonos"); // Crear una instancia de la clase Ventana
        ControladorAudifonos controller = new ControladorAudifonos(ventana); // Crear una instancia del controlador con la ventana
    }
}