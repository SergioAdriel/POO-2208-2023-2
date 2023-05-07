import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Ventana extends JFrame {
    private JPanel panel1;
    private JButton botonPanel1;
    protected JLabel etiquetaPanel1;
    private JPanel panel2;
    private  JLabel etiquetaPanel2;
    private JPanel panel3;
    private JComboBox<String> comboBoxPanel3;
    private JPanel panel4;
    private GridLayout layout;

    public Ventana(String title) throws HeadlessException{
        super(title);
        this.setSize(950,1000);
        layout = new GridLayout(2,2);
        this.getContentPane().setLayout(layout);
        //Panel 1
        panel1 = new JPanel();
        panel1.setBackground(new Color(195,239,252));
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
        botonPanel1= new JButton("Presióname!!");
        panel1.add(botonPanel1);
        etiquetaPanel1 = new JLabel("....");
        panel1.add(etiquetaPanel1);
        botonPanel1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                etiquetaPanel1.setText("Hola, presionaste el botón del panel 1");
            }
        });
        this.getContentPane().add(panel1,0);
        //Panel 2
        String urlImagen = "https://lh3.googleusercontent.com/BGtbS3wd43OLuQVx5Ne1v9LJTWbUQrtIgJang5AX9tFGbYst95LBClOeM0dvfX60OT1FEU39Swz4nmKpBV_pENFdfWUP1TFDPBzCg17x3Je8bKe7Ou_imU4u3F71Ge91aQ=w400";

        panel2 = new JPanel();
        panel2.setBackground(new Color(164,224,200));
        panel2.setLayout(new FlowLayout());
        etiquetaPanel2 = new JLabel("...");
        // cargar la imagen de internet
        try{
            URL url = new URL(urlImagen);
            Image imagen = ImageIO.read(url);
            ImageIcon imagenIcon = new ImageIcon(imagen);
            etiquetaPanel2 = new JLabel(imagenIcon);
            panel2.add(etiquetaPanel2);
            this.getContentPane().add(panel2,1);
        }catch (MalformedURLException me){
            System.out.printf("Url no válida");
        }catch (Exception e){
            System.out.printf("Error al cargar la Imagen");
        }
        this.getContentPane().add(panel2,1);
        //Panel 3
        panel3 = new JPanel();
        panel3.setBackground(new Color(149,86,223));
        panel3.setLayout(new FlowLayout(FlowLayout.RIGHT));
        String[] elementos = {"Opcion 1","Opcion 2","Opcion 3","Opcion 4"};
        comboBoxPanel3 = new JComboBox<>(elementos);
        comboBoxPanel3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.getSource().toString());
                System.out.println(comboBoxPanel3.getSelectedIndex());
            }
        });
        panel3.add(comboBoxPanel3);
        this.getContentPane().add(panel3,2); //Patron de diseno/vista contolador es el correcto
        //Panel 4
        panel4 = new JPanel();
        panel4.setBackground(new Color(60, 190, 252));
        this.getContentPane().add(panel4,3);
        this.setVisible(true);
        this.addWindowFocusListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                JOptionPane.showMessageDialog(null,"Adios....");
                System.exit(0);
            }
        });
    }
}
