import java.util.Scanner; // Vamos a utilizar importar esta libreria para poder leer cosas del teclado
public class Tarea5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\n\t\t\t   Tarea 5\n\t\tby Sergio Adriel Muñoz Camarena\n\t\t     EL JUEGO DEL 3 EN LINEA");
        String cadena = "";
        while (cadena.length() != 9 || !cadena.matches("[XO_]+")){ // Estamos utilizando "||" para unir otro condicionante, en este caso como fue solicitado solo lea [X, O, _ ]
        System.out.print("\nDame una cadena de 9 caractereres validos \"X,O,_\" (Cuando termines presiona \"ENTER\"): ");
            cadena = scanner.nextLine();
        if (cadena.length() != 9){ // En caso de que la cadena no sea de 9 caractereres printeamos esto y esperamos hasta que la condicion sea cumplida
    
            System.out.println("\n¡Hijole joven no se puede a wiwi ocupo una cadena de 9 caractereres validos \"X,O,_\!\n\n");
        }}
        int inicio = 0;  // Con esto dividimos la cadena en cachitos de 3 e printeamos los lados del tablero
        int fin = 3;
        System.out.println("-----");  // La parte superior del tablero
        while (fin <= cadena.length()) {
            String subcadena = cadena.substring(inicio, fin);
            System.out.println("|" + subcadena + "|");
            inicio = fin;
            fin += 3;
        }
        System.out.println("-----");  // La parte inferior del tablero
    }
}