import java.time.LocalTime;
public class Main {
    public static void main(String[] args) {
        System.out.println("Prueba de la clase Reloj");
        LocalTime local = LocalTime.now();
        Reloj wacho = new Reloj(local.getHour(), local.getMinute(), local.getSecond());
        wacho.programarAlarma(12,42,0);
        for (int i = 0; i < 5; i++) {
            wacho.avanzar();
            wacho.mostrar();
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e);
            }
        }

        System.out.println("\n\nPrueba de la clase PaginaWeb");
        PaginaWeb pagina1 = new PaginaWeb("Noticias", "El País", "www.elpais.com", "Últimas noticias del día: Karely Ruiz visita FES Aragon", "08/03/2023");
        pagina1.visitar();
        pagina1.cerrar();

        System.out.println("\n\nPrueba de la clase País");
        País narizon = new País("Argentina", 44938712, 2780400);
        narizon.informarPoblacion();
        System.out.println("La densidad poblacional de " + narizon.getNombre() + " es de " + narizon.calcularDensidadPoblacional() + " habitantes por km².");
        narizon.saludar();

        System.out.println("\n\nPrueba de la clase Giroscopio");
        Giroscopio gs = new Giroscopio(500, "Grande", 657);
        System.out.println("El giroscopio va a: " + gs.getVelocidadRotacion() + " RPM, este es de tamaño: " + gs.getTamano() + " y tiene un peso de: " + gs.getPeso() + "gr");
        gs.funcionando(1);
        gs.intensidadGiro(73);

        System.out.println("\n\nPrueba de la clase Computadora");
        Computadora PC = new Computadora("Laptop", "Windows 11", 16);
        PC.encender();
        System.out.println("Mi PC es de tipo: " + PC.getTipo() + ", Version de SO: " + PC.sistemaOperativo() + ", Cantidad de RAM: " + PC.getRam() +" GB");
        PC.apagar();

        System.out.println("\n\nPrueba de la clase Cubo de Rubik");
        CuboRubik cubito = new CuboRubik("Clasicos", 3, "Magnetico");
        System.out.println("El cubo tiene stickers: " + cubito.getColor() +", El cubo es de tamaño: " + cubito.getTamano()+ "x"+ cubito.getTamano()+ " y es de mecanismo: " + cubito.getMecanismo());
        cubito.estado(0);
        cubito.tiempo(50);

        System.out.println("\n\nPrueba de la clase Libro");
        Libro Kamasutre = new Libro("Calculo I", "Chucho Temalatzi", "Libros del mas acá");
        System.out.println("El libro se llama: " + Kamasutre.getTitulo() + ", su Autor es: " + Kamasutre.getAutor() + " y su editorial es: " + Kamasutre.getEditorial());
        Kamasutre.estadoLibro(2);
        Kamasutre.disponible(0);

        System.out.println("\n\nPrueba de la clase Balón");
        Balón Americano = new Balón("Americano", "Amarillo", "G");
        System.out.println("El balon es para jugar: " + Americano.getDeporte() + ", su color es: " + Americano.getColor() + " y su tamaño en tallas es: " + Americano.getTamanoBalon());
        Americano.desinflado(6);
        Americano.disponibleBalon(1);

        System.out.println("\n\nPrueba de la clase Lámpara");
        Lámpara lamp = new Lámpara("LED", "Piso", 500);
        System.out.println("La lampara es: " + lamp.getTecnologia() + ", es de tipo: " + lamp.getTipo() + "y tiene: " + lamp.getLumens() + " lumens");
        lamp.prendida(1);
        lamp.intensidad(34);

        System.out.println("\n\nPrueba de la clase Gato");
        Gato michi = new Gato("Ruso Azul","Azul",'M');  // No es que sea extraterrestre sino que asi se le denomina a los michis grises, motivo nunca lo sabremos
        System.out.println("El gato es de raza: " + michi.getRaza() + ", es de color: " + michi.getColor() + " y es: " + michi.getSexo());
        michi.dormido(1);
        michi.comiendo(0);
    }
}