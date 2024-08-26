import java.util.Scanner; 
public class Tarea2 {
    public static void main(String[] args) {
        System.out.println("\n\n\t          Tarea 2 \n\tby Sergio Adriel Muñoz Camarena");
        // Pedimos al usuario que ingrese una cadena con el formato "NOMBRE PROFESIÓN NACIONALIDAD"
        Scanner sc = new Scanner(System.in);
        System.out.println("\nIngrese una cadena con el formato 'NOMBRE PROFESIÓN NACIONALIDAD':\n");
        String cadena = sc.nextLine();
        // Aqui se separa la cadena con un espacio para que no se vea espantoso
        String[] partes = cadena.split(" ");
        // Obtener el nombre, la profesión y la nacionalidad en mayúsculas no vaya siendo que se nos cuele un chiapaneco (bromis)
        String nombre = partes[0].toUpperCase();
        String profesion = partes[1].toUpperCase();
        String pais = partes[2].toUpperCase();
        // Printea aca bien chido lo que pide
        System.out.println("Nombre: " + nombre);
        System.out.println("Profesión: " + profesion);
        System.out.println("País: " + pais);
    }
}
