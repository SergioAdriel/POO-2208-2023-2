package Controlador;

import Modelo.Audifono;
import Modelo.TablaAudifono;
import Vista.Ventana;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.sql.SQLException;

public class ControladorAudifonos extends MouseAdapter {
    private Ventana view;
    private TablaAudifono modelo;

    public ControladorAudifonos(Ventana view) {
        this.view = view;
        modelo = new TablaAudifono();
        this.view.getTblAudifono().setModel(modelo);
        this.view.getBtnCargar().addMouseListener(this);
        this.view.getBtnAgregar().addMouseListener(this);
        this.view.getBtnActualizar().addMouseListener(this);
        this.view.getBtnEliminar().addMouseListener(this);
        this.view.getBtnCorregirID().addMouseListener(this);
        this.view.getTblAudifono().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.view.getBtnCargar()) {
            modelo.cargarTablas();
            this.view.getTblAudifono().setModel(modelo);
            this.view.getTblAudifono().updateUI();
        }

        if (e.getSource() == this.view.getBtnAgregar()) {
            System.out.println("Se presionó el botón Agregar");
            try {
                String marca = validarMarca(this.view.getTxtMarca().getText());
                String tipo = validarTipo(this.view.getTxtTipo().getText());
                String color = validarColor(this.view.getTxtColor().getText());
                String conexion = validarConexion(this.view.getTxtConexion().getText());
                String urlFoto = validarUrlImagen(this.view.getTxtUrlConexion().getText());

                Audifono audifono = new Audifono();
                audifono.setId(0);
                audifono.setMarca(marca);
                audifono.setTipo(tipo);
                audifono.setColor(color);
                audifono.setConexion(conexion);
                audifono.setUrlFoto(urlFoto);

                if (modelo.agregarAudifono(audifono)) {
                    JOptionPane.showMessageDialog(view, "Se agrego correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    this.view.getTblAudifono().updateUI();
                } else {
                    JOptionPane.showMessageDialog(view, "No se pudo agregar", "Error al Insertar", JOptionPane.ERROR_MESSAGE);
                }
                this.view.clean();
            } catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(view, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        if (e.getSource() == this.view.getTblAudifono()) {
            System.out.println("Evento sobre tabla");
            int index = this.view.getTblAudifono().getSelectedRow();
            Audifono tmp = modelo.getAudifonoAtIndex(index);
            try {
                ImageIcon imagenAudifono = tmp.getImagenAudifono();
                if (imagenAudifono != null) {
                    this.view.getLblImagenAudifonos().setIcon(imagenAudifono);
                } else {
                    this.view.getLblImagenAudifonos().setIcon(null);
                    System.out.println("No se pudo obtener la imagen del audífono.");
                }
            } catch (MalformedURLException mfue) {
                System.out.println("Error al obtener la imagen del audífono: " + mfue.toString());
                this.view.getLblImagenAudifonos().setIcon(null);
            }
            this.view.getTxtMarca1().setText(tmp.getMarca());
            this.view.getTxtTipo1().setText(tmp.getTipo());
            this.view.getTxtColor1().setText(tmp.getColor());
            this.view.getTxtConexion1().setText(tmp.getConexion());
            this.view.getTxtUrlConexion1().setText(tmp.getUrlFoto());
        }

        if (e.getSource() == this.view.getBtnActualizar()) {
            System.out.println("Evento sobre boton Actualizar");
            int rowIndex = this.view.getTblAudifono().getSelectedRow();
            Audifono tmp = modelo.getAudifonoAtIndex(rowIndex);
            Audifono audifono = new Audifono();
            audifono.setMarca(this.view.getTxtMarca1().getText());
            audifono.setTipo(this.view.getTxtTipo1().getText());
            audifono.setColor(this.view.getTxtColor1().getText());
            audifono.setConexion(this.view.getTxtConexion1().getText());
            audifono.setUrlFoto(this.view.getTxtUrlConexion1().getText());
            audifono.setId(tmp.getId());
            if (modelo.modificarAudifono(audifono)) {
                JOptionPane.showMessageDialog(view, "Se modificó correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                modelo.cargarTablas();
                this.view.getTblAudifono().setModel(modelo);
                this.view.getTblAudifono().updateUI();
            } else {
                JOptionPane.showMessageDialog(view, "No se pudo modificar", "Error al Insertar", JOptionPane.ERROR_MESSAGE);
            }
            this.view.getTblAudifono().updateUI();
        }

        if (e.getSource() == this.view.getBtnEliminar()) {
            TablaAudifono temp = new TablaAudifono();
            int index = this.view.getTblAudifono().getSelectedRow();
            Audifono tmp = modelo.getAudifonoAtIndex(index);
            if (temp.eliminarAudifono(Integer.toString(tmp.getId()))) {
                JOptionPane.showMessageDialog(view, "Se eliminó correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                modelo.cargarTablas();
                this.view.getTblAudifono().updateUI();
                this.view.clean();
            } else {
                JOptionPane.showMessageDialog(view, "No se pudo eliminar la base", "Error al insertar", JOptionPane.ERROR_MESSAGE);
            }
        }

        if (e.getSource() == this.view.getBtnCorregirID()) {
            corregirID();
        }

        this.view.clean();
    }

    private void corregirID() {
        int rowCount = modelo.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            Audifono audifono = modelo.getAudifonoAtIndex(i);   //Esto al final no se implemento
            audifono.setId(i + 1);
            modelo.modificarAudifono(audifono);
        }
        modelo.cargarTablas();
        this.view.getTblAudifono().updateUI();
        JOptionPane.showMessageDialog(view, "Se corrigieron los IDs correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
    }

    private String validarMarca(String marca) {
        if (marca.trim().isEmpty()) {
            throw new IllegalArgumentException("El campo Marca no puede estar vacío.");
        }
        if (!Character.isLetter(marca.charAt(0))) {
            throw new IllegalArgumentException("El campo Marca debe comenzar con una letra.");
        }
        if (marca.length() < 3) {
            throw new IllegalArgumentException("El campo Marca debe tener al menos 3 caracteres.");
        }
        return marca;
    }

    //Aqui valida cada uno de los datos
    private String validarTipo(String tipo) {
        if (tipo.trim().isEmpty()) {
            throw new IllegalArgumentException("El campo Tipo no puede estar vacío.");
        }
        if (!Character.isLetter(tipo.charAt(0))) {
            throw new IllegalArgumentException("El campo Tipo debe comenzar con una letra.");
        }
        if (tipo.length() < 3) {
            throw new IllegalArgumentException("El campo Tipo debe tener al menos 3 caracteres.");
        }
        return tipo;
    }

    private String validarColor(String color) {
        if (color.trim().isEmpty()) {
            throw new IllegalArgumentException("El campo Color no puede estar vacío.");
        }
        if (!Character.isLetter(color.charAt(0))) {
            throw new IllegalArgumentException("El campo Color debe comenzar con una letra.");
        }
        if (color.length() < 3) {
            throw new IllegalArgumentException("El campo Color debe tener al menos 3 caracteres.");
        }
        return color;
    }

    private String validarConexion(String conexion) {
        if (conexion.trim().isEmpty()) {
            throw new IllegalArgumentException("El campo Conexión no puede estar vacío.");
        }
        if (!Character.isLetter(conexion.charAt(0))) {
            throw new IllegalArgumentException("El campo Conexión debe comenzar con una letra.");
        }
        if (conexion.length() < 3) {
            throw new IllegalArgumentException("El campo Conexión debe tener al menos 3 caracteres.");
        }
        return conexion;
    }

    private String validarUrlImagen(String urlFoto) {
        if (urlFoto.trim().isEmpty()) {
            throw new IllegalArgumentException("El campo URL de la imagen no puede estar vacío.");
        }
        if (!urlFoto.startsWith("https://")) {
            throw new IllegalArgumentException("La URL de la imagen no tiene el formato correcto.");
        }
        return urlFoto;
    }
}