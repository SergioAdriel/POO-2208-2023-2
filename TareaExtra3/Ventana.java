import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ventana extends Frame {
    private Label lblEtiaueta1;
    private Label lblEtiaueta2;
    private TextField txtCuadro1;
    private TextField txtCuadro2;
    private Button boton1;
    private FlowLayout layout;
    public Ventana(String title) throws HeadlessException {
            super(title);
            layout = new FlowLayout(FlowLayout.LEFT);
            this.setLayout(layout);
            lblEtiaueta1 = new Label("Etiqueta 1");
            this.add(lblEtiaueta1);
            txtCuadro1 = new TextField(60);
            this.add(txtCuadro1);
            lblEtiaueta2 = new Label("Etiqueta 2");
            this.add(lblEtiaueta2);
            txtCuadro2 = new TextField(60);
            this.add(txtCuadro2);

            this.setSize(800,600);
            this.setVisible(true);


            this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0); //Esto namas lo puse aca para poder cerrar la ventana aunque no pertenece al video como tal
            }
            });}

}
