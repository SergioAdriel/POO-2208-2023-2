public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Bicicleta", false,69);
        System.out.println(vehiculo);//Estamos probando la clase Vehiculo con una Vagabundo
        vehiculo.acelerar();
        vehiculo.frenar();

        Automovil automovil = new Automovil("Automovil",true,2022,
                4,"Sedan","Gris");
        System.out.println(automovil);
        automovil.encender();
        automovil.acelerar();
        automovil.frenar();
        automovil.apagar();

        Taxi taxi = new Taxi("Automovil",true,1986,
                4,"Sedan","Rojo",
                "HKPOPO0-56406","Sueños",20);
        System.out.println(taxi);
        taxi.encender();
        taxi.acelerar();
        taxi.hecharGastalina();
        taxi.recogerPasajero();
        taxi.frenar();
        taxi.dejarPasajero();
        taxi.apagar();

    }
}