public class Tarea1 {
    
    public static void main(String[] args) {
        System.out.println("\n\n\t          Tarea 1 \n\tby Sergio Adriel Muñoz Camarena");
        // Declaración de variables
        String cadena1 = "Arriba, el Shine!";
        String cadena2 = "";
        String cadena3 = "Arriba el Shine!";
        String cadena4 = "Pitufo";
        
        //Pagina 22 a 27
        System.out.println("\n\n Ejemplo de las paginas 22 a 27");
        // length()
        int longitudCadena1 = cadena1.length();
        System.out.println("La longitud de cadena1 es: " + longitudCadena1);
        // isEmpty()
        boolean esCadena2Vacia = cadena2.isEmpty();
        System.out.println("¿Esta la cadena2 vacía? " + esCadena2Vacia);
        // equals()
        boolean sonCadena1yCadena3Iguales = cadena1.equals(cadena3);
        System.out.println("¿Son la cadena1 y la cadena3 iguales? " + sonCadena1yCadena3Iguales);
        // indexOf()
        int indiceShine = cadena1.indexOf("Shine");
        System.out.println("El índice de la palabra 'Shine' en cadena1 es: " + indiceShine);
        // lastIndexOf()
        int ultimoIndiceO = cadena3.lastIndexOf('e');
        System.out.println("El último índice de la letra 'e' en cadena3 es: " + ultimoIndiceO);
        // upperCase()
        String cadena4EnMayusculas = cadena4.toUpperCase();
        System.out.println("cadena4 en mayúsculas: " + cadena4EnMayusculas);
        // toLowerCase()
        String cadena3EnMinusculas = cadena3.toLowerCase();
        System.out.println("cadena3 en minúsculas: " + cadena3EnMinusculas);
        // subString()
        String subcadenaMundo = cadena1.substring(11, 16);
        System.out.println("La subcadena de cadena1 que contiene 'Shine' es: " + subcadenaMundo);
        
        //clase Integer
        System.out.println("\n\n Ejemplo de Integer");
        // Ejemplo de uso del método parseInt() de la clase Integer
        String str = "123";
        int num = Integer.parseInt(str); // convierte una cadena a un entero
        System.out.println("El número entero es: " + num);
        // Ejemplo de uso del método toString() de la clase Integer
        int num2 = 456;
        String str2 = Integer.toString(num2); // convierte un entero a una cadena
        System.out.println("La cadena es: " + str2);
        
        //clase StringBuilder
        System.out.println("\n\n Ejemplo de la clase StringBuilder");
        StringBuilder sb = new StringBuilder ();
        // Agregar texto al StringBuilder
        sb.append("Hola, ");
        sb.append("¿cómo estás?");
        // Imprimir el contenido del StringBuilder
        System.out.println(sb.toString());
        // Insertar texto en una posición específica del StringBuilder
        sb.insert(5, " amigo ");
        // Imprimir el contenido del StringBuilder actualizado
        System.out.println(sb.toString());
        // Reemplazar un segmento del texto del StringBuilder
        sb.replace(0, 5, "Adios");
        // Imprimir el contenido del StringBuilder actualizado
        System.out.println(sb.toString());
        // Eliminar un segmento del texto del StringBuilder
        sb.delete(6, 12);
        // Imprimir el contenido del StringBuilder actualizado
        System.out.println(sb.toString());
    }
}