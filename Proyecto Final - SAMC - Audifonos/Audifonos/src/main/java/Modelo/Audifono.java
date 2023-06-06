package Modelo;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Audifono {
    private int Id;             // Identificador del audífono
    private String Marca;       // Marca del audífono
    public String Tipo;         // Tipo de audífono
    public String Color;        // Color del audífono
    public String Conexion;     // Tipo de conexión del audífono
    private String urlFoto;     // URL de la imagen del audífono

    public Audifono() {
    }

    public Audifono(int Id, String marca, String tipo, String color, String conexion, String urlFoto) {
        this.Id = Id;
        this.Marca = marca;
        this.Tipo = tipo;
        this.Color = color;
        this.Conexion = conexion;
        this.urlFoto = urlFoto;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        this.Marca = marca;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        this.Tipo = tipo;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        this.Color = color;
    }

    public String getConexion() {
        return Conexion;
    }

    public void setConexion(String conexion) {
        this.Conexion = conexion;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    @Override
    public String toString() {
        return "Audifono{" +
                "Marca='" + Marca + '\'' +
                ", Tipo='" + Tipo + '\'' +
                ", Color='" + Color + '\'' +
                ", Conexion='" + Conexion + '\'' +
                ", urlFoto='" + urlFoto + '\'' +
                '}';
    }

    // Método para obtener la imagen del audífono
    public ImageIcon getImagenAudifono() throws MalformedURLException {
        URL urlImagen = new URL(urlFoto);
        return new ImageIcon(urlImagen);
    }
}