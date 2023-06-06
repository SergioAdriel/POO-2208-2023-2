package Vista;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    // Labels
    private JLabel lblId;
    private JLabel lblMarca;
    private JLabel lblTipo;
    private JLabel lblColor;
    private JLabel lblConexion;

    // Labels para los audífonos
    private JLabel lblUrlFoto;
    private JLabel lblImagenAudifonos;

    // TextFields
    private JTextField txtId;
    private JTextField txtMarca;
    private JTextField txtTipo;
    private JTextField txtColor;
    private JTextField txtConexion;
    private JTextField txtUrlConexion;

    // Buttons
    private JButton btnAgregar;
    private JButton btnActualizar;
    private JButton btnEliminar;
    private JButton btnCargar;
    private JButton btnCorregirID;

    // Layout
    private GridLayout layout;

    // Table
    private JTable tblAudifono;
    private JScrollPane scrTabla;

    // Panels
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;

    // Labels para el panel 4
    private JLabel lblId1;
    private JLabel lblMarca1;
    private JLabel lblTipo1;
    private JLabel lblColor1;
    private JLabel lblConexion1;
    private JLabel lblUrlFoto1;

    // TextFields para el panel 4
    private JTextField txtMarca1;
    private JTextField txtTipo1;
    private JTextField txtColor1;
    private JTextField txtConexion1;
    private JTextField txtUrlConexion1;

    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1000, 800);

        // Configuración del layout
        layout = new GridLayout(2, 2);
        this.getContentPane().setLayout(layout);

        // Panel 1
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(52, 168, 83, 255));
        this.getContentPane().add(panel1, 0);

        // Labels y TextFields del panel 1
        lblId = new JLabel("Id: ");
        lblMarca = new JLabel("Marca: ");
        lblTipo = new JLabel("Tipo: ");
        lblColor = new JLabel("Color: ");
        lblConexion = new JLabel("Conexion: ");
        lblUrlFoto = new JLabel("URL Foto: ");
        txtId = new JTextField(2);
        txtMarca = new JTextField(10);
        txtTipo = new JTextField(10);
        txtColor = new JTextField(10);
        txtConexion = new JTextField(5);
        txtUrlConexion = new JTextField(15);

        // Agregar los componentes al panel 1
        //panel1.add(lblId);
        //panel1.add(txtId);
        panel1.add(lblMarca);
        panel1.add(txtMarca);
        panel1.add(lblTipo);
        panel1.add(txtTipo);
        panel1.add(lblColor);
        panel1.add(txtColor);
        panel1.add(lblConexion);
        panel1.add(txtConexion);
        panel1.add(lblUrlFoto);
        panel1.add(txtUrlConexion);
        btnAgregar = new JButton("Agregar");
        panel1.add(btnAgregar);

        // Panel 2
        panel2 = new JPanel(new BorderLayout());
        panel2.setBackground(new Color(231, 76, 60));
        this.getContentPane().add(panel2, 1);

        // Tabla y botón del panel 2
        tblAudifono = new JTable();
        btnCargar = new JButton("Cargar");
        btnCorregirID = new JButton("Corregir ID");
        scrTabla = new JScrollPane(tblAudifono);

        // Crear un panel auxiliar para centrar los botones
        JPanel panelBotones2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelBotones2.add(btnCargar);
        //panelBotones2.add(btnCorregirID);

        // Agregar los componentes al panel 2
        panel2.add(panelBotones2, BorderLayout.NORTH);
        panel2.add(scrTabla, BorderLayout.CENTER);
        panel2.add(scrTabla, BorderLayout.CENTER);

        // Panel 3
        panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(new Color(41, 128, 185));
        this.getContentPane().add(panel3, 2);

        // Label para la imagen de los audífonos
        lblImagenAudifonos = new JLabel("....");
        this.panel3.add(lblImagenAudifonos);

        // Panel 4
        panel4 = new JPanel(new FlowLayout());
        panel4.setBackground(new Color(255, 215, 0, 115));
        this.getContentPane().add(panel4, 3);

        // Labels y TextFields del panel 4
        lblMarca1 = new JLabel("Marca:");
        lblTipo1 = new JLabel("Tipo:");
        lblColor1 = new JLabel("Color: ");
        lblConexion1 = new JLabel("Conexion: ");
        lblUrlFoto1 = new JLabel("URL Foto:");
        txtMarca1 = new JTextField(10);
        txtTipo1 = new JTextField(10);
        txtColor1 = new JTextField(10);
        txtConexion1 = new JTextField(5);
        txtUrlConexion1 = new JTextField(15);
        btnActualizar = new JButton("Actualizar");
        btnEliminar = new JButton("Eliminar");

        // Crear un panel auxiliar para centrar los botones
        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelBotones.add(btnActualizar);
        panelBotones.add(btnEliminar);

        // Agregar los componentes al panel 4
        panel4.add(lblMarca1);
        panel4.add(txtMarca1);
        panel4.add(lblTipo1);
        panel4.add(txtTipo1);
        panel4.add(lblColor1);
        panel4.add(txtColor1);
        panel4.add(lblConexion1);
        panel4.add(txtConexion1);
        panel4.add(lblUrlFoto1);
        panel4.add(txtUrlConexion1);
        panel4.add(panelBotones);

        this.setVisible(true);
    }

    //Metodos de acceso

    public JButton getBtnCorregirID() {
        return btnCorregirID;
    }

    public void setBtnCorregirID(JButton btnCorregirID) {
        this.btnCorregirID = btnCorregirID;
    }

    public JLabel getLblId() {
        return lblId;
    }

    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }

    public JLabel getLblMarca() {
        return lblMarca;
    }

    public void setLblMarca(JLabel lblMarca) {
        this.lblMarca = lblMarca;
    }

    public JLabel getLblTipo() {
        return lblTipo;
    }

    public void setLblTipo(JLabel lblTipo) {
        this.lblTipo = lblTipo;
    }

    public JLabel getLblColor() {
        return lblColor;
    }

    public void setLblColor(JLabel lblColor) {
        this.lblColor = lblColor;
    }

    public JLabel getLblConexion() {
        return lblConexion;
    }

    public void setLblConexion(JLabel lblConexion) {
        this.lblConexion = lblConexion;
    }

    public JLabel getLblUrlFoto() {
        return lblUrlFoto;
    }

    public void setLblUrlFoto(JLabel lblUrlFoto) {
        this.lblUrlFoto = lblUrlFoto;
    }

    public JLabel getLblImagenAudifonos() {
        return lblImagenAudifonos;
    }

    public void setLblImagenAudifonos(JLabel lblImagenAudifonos) {
        this.lblImagenAudifonos = lblImagenAudifonos;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtMarca() {
        return txtMarca;
    }

    public void setTxtMarca(JTextField txtMarca) {
        this.txtMarca = txtMarca;
    }

    public JTextField getTxtTipo() {
        return txtTipo;
    }

    public void setTxtTipo(JTextField txtTipo) {
        this.txtTipo = txtTipo;
    }

    public JTextField getTxtColor() {
        return txtColor;
    }

    public void setTxtColor(JTextField txtColor) {
        this.txtColor = txtColor;
    }

    public JTextField getTxtConexion() {
        return txtConexion;
    }

    public void setTxtConexion(JTextField txtConexion) {
        this.txtConexion = txtConexion;
    }

    public JTextField getTxtUrlConexion() {
        return txtUrlConexion;
    }

    public void setTxtUrlConexion(JTextField txtUrlConexion) {
        this.txtUrlConexion = txtUrlConexion;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public void setBtnActualizar(JButton btnActualizar) {
        this.btnActualizar = btnActualizar;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public JButton getBtnCargar() {
        return btnCargar;
    }

    public void setBtnCargar(JButton btnCargar) {
        this.btnCargar = btnCargar;
    }

    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }

    public JTable getTblAudifono() {
        return tblAudifono;
    }

    public void setTblAudifono(JTable tblAudifono) {
        this.tblAudifono = tblAudifono;
    }

    public JScrollPane getScrTabla() {
        return scrTabla;
    }

    public void setScrTabla(JScrollPane scrTabla) {
        this.scrTabla = scrTabla;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JPanel getPanel4() {
        return panel4;
    }

    public void setPanel4(JPanel panel4) {
        this.panel4 = panel4;
    }

    public JLabel getLblId1() {
        return lblId1;
    }

    public void setLblId1(JLabel lblId1) {
        this.lblId1 = lblId1;
    }

    public JLabel getLblMarca1() {
        return lblMarca1;
    }

    public void setLblMarca1(JLabel lblMarca1) {
        this.lblMarca1 = lblMarca1;
    }

    public JLabel getLblTipo1() {
        return lblTipo1;
    }

    public void setLblTipo1(JLabel lblTipo1) {
        this.lblTipo1 = lblTipo1;
    }

    public JLabel getLblColor1() {
        return lblColor1;
    }

    public void setLblColor1(JLabel lblColor1) {
        this.lblColor1 = lblColor1;
    }

    public JLabel getLblConexion1() {
        return lblConexion1;
    }

    public void setLblConexion1(JLabel lblConexion1) {
        this.lblConexion1 = lblConexion1;
    }

    public JLabel getLblUrlFoto1() {
        return lblUrlFoto1;
    }

    public void setLblUrlFoto1(JLabel lblUrlFoto1) {
        this.lblUrlFoto1 = lblUrlFoto1;
    }

    public JTextField getTxtMarca1() {
        return txtMarca1;
    }

    public void setTxtMarca1(JTextField txtMarca1) {
        this.txtMarca1 = txtMarca1;
    }

    public JTextField getTxtTipo1() {
        return txtTipo1;
    }

    public void setTxtTipo1(JTextField txtTipo1) {
        this.txtTipo1 = txtTipo1;
    }

    public JTextField getTxtColor1() {
        return txtColor1;
    }

    public void setTxtColor1(JTextField txtColor1) {
        this.txtColor1 = txtColor1;
    }

    public JTextField getTxtConexion1() {
        return txtConexion1;
    }

    public void setTxtConexion1(JTextField txtConexion1) {
        this.txtConexion1 = txtConexion1;
    }

    public JTextField getTxtUrlConexion1() {
        return txtUrlConexion1;
    }

    public void setTxtUrlConexion1(JTextField txtUrlConexion1) {
        this.txtUrlConexion1 = txtUrlConexion1;
    }

    public void clean() {
        // Limpia los campos de texto del panel 1
        txtMarca.setText("");
        txtTipo.setText("");
        txtColor.setText("");
        txtConexion.setText("");
        txtUrlConexion.setText("");
    }
}
