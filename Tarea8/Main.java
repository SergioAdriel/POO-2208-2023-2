public class Main {
    public static void main(String[] args) {
        MaquinaCafe maquina = new MaquinaCafe(5000, 1000, 1500, 50);

        System.out.println("\n\n\t          Tarea 8: Máquina de café \n\t      by Sergio Adriel Muñoz Camarena\n");

        maquina.mostrarDepositos();   // Mostramos los depositos y cantidad de vasos
        maquina.mostrarVasos();

        maquina.servirAmericano();
        maquina.servirCapuchino();
        maquina.servirExpreso();
        maquina.servirAmericano();
        maquina.servirCapuchino();
        maquina.servirExpreso();
        maquina.servirAmericano();
        maquina.servirCapuchino();
        maquina.servirExpreso();
        maquina.servirAmericano();
        maquina.servirCapuchino();
        maquina.servirExpreso();
        maquina.servirAmericano();
        maquina.servirCapuchino();
        maquina.servirExpreso();
        maquina.servirAmericano();
        maquina.servirCapuchino();
        maquina.servirExpreso();
        maquina.servirAmericano();
        maquina.servirCapuchino();
        maquina.servirExpreso();
        maquina.servirAmericano();
        maquina.servirCapuchino();
        maquina.servirExpreso();
        maquina.servirAmericano();
        maquina.servirCapuchino();
        maquina.servirExpreso();
        maquina.servirAmericano();
        maquina.servirCapuchino();
        maquina.servirExpreso();
        maquina.servirAmericano();
        maquina.servirCapuchino();
        maquina.servirExpreso();
        maquina.servirAmericano();
        maquina.servirCapuchino();
        maquina.servirExpreso();
        maquina.servirAmericano();
        maquina.servirAmericano(); // Este ultimo cafe ya no se puede servir

        if (maquina.getVasos() > 0 && maquina.getAgua() > 100 && maquina.getCafe() > 14 && maquina.getCrema() > 70 ) {
            System.out.println("\n\nLa máquina ya no tiene vasos disponibles, pero aun tiene recursos para seguir operando como se ve a continuacion: ");
            maquina.mostrarVasos();
            maquina.mostrarDepositos();
        } else {                                                                                                                 //Esto es para decirle al usuario si su cosa puede seguir funcionado o require agregar elementos
            System.out.println("\n\nLa máquina aún tiene vasos disponibles, pero ya no tiene recursos para seguir operando como se ve a continuacion:");
            maquina.mostrarVasos();
            maquina.mostrarDepositos();
        }



    }
}