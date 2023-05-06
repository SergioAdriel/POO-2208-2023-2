package tareasextra.dos;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Koña Koña!");
                LeerArchivo lectura = new LeerArchivo();
                try {
                    lectura.metodoUno("datos.txt"); //Pila de llamadas
                } catch (IOException e){
                    e.printStackTrace();
                }
    }
}


