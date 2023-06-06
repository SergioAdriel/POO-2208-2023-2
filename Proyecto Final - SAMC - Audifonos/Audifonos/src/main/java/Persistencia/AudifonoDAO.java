package Persistencia; // Paquete de la clase

import Modelo.Audifono; // Importar la clase Audifono del paquete Modelo
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AudifonoDAO implements InterfazDAO {
    private static int ultimoId = 0; // Variable estática para almacenar el último ID utilizado

    public AudifonoDAO() {
    }

    public static int getUltimoId() { // Método estático para obtener el último ID utilizado
        return ultimoId;
    }

    public static void setUltimoId(int nuevoUltimoId) { // Método estático para establecer el último ID utilizado
        ultimoId = nuevoUltimoId;
    }

    @Override
    public boolean insertar(Object obj) throws SQLException {
        String sqlInsert = "INSERT INTO Audifonos(Marca, Tipo, Color, Conexion, UrlFoto) VALUES (?, ?, ?, ?, ?)";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("baseDatos.db").getConnection().prepareStatement(sqlInsert);
        pstm.setString(1, ((Audifono)obj).getMarca()); // Establecer el valor de Marca en el PreparedStatement
        pstm.setString(2, ((Audifono)obj).getTipo()); // Establecer el valor de Tipo en el PreparedStatement
        pstm.setString(3, ((Audifono)obj).getColor()); // Establecer el valor de Color en el PreparedStatement
        pstm.setString(4, ((Audifono)obj).getConexion()); // Establecer el valor de Conexion en el PreparedStatement
        pstm.setString(5, ((Audifono)obj).getUrlFoto()); // Establecer el valor de UrlFoto en el PreparedStatement
        rowCount = pstm.executeUpdate(); // Ejecutar la consulta de inserción
        return rowCount > 0; // Devolver true si se insertó al menos una fila
    }

    @Override
    public boolean update(Object obj) throws SQLException {
        String sqlUpdate = "UPDATE Audifonos SET Marca = ?, Tipo = ?, Color = ?, Conexion = ?, UrlFoto = ? WHERE Id = ? ;";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("baseDatos.db").getConnection().prepareStatement(sqlUpdate);
        pstm.setString(1, ((Audifono)obj).getMarca()); // Establecer el valor de Marca en el PreparedStatement
        pstm.setString(2, ((Audifono)obj).getTipo()); // Establecer el valor de Tipo en el PreparedStatement
        pstm.setString(3, ((Audifono)obj).getColor()); // Establecer el valor de Color en el PreparedStatement
        pstm.setString(4, ((Audifono)obj).getConexion()); // Establecer el valor de Conexion en el PreparedStatement
        pstm.setString(5, ((Audifono)obj).getUrlFoto()); // Establecer el valor de UrlFoto en el PreparedStatement
        pstm.setInt(6, ((Audifono)obj).getId()); // Establecer el valor de Id en el PreparedStatement
        rowCount = pstm.executeUpdate(); // Ejecutar la consulta de actualización
        return rowCount > 0; // Devolver true si se actualizó al menos una fila
    }

    @Override
    public boolean delete(String id) throws SQLException {
        String sqlDelete = "DELETE FROM Audifonos WHERE Id = ?";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("baseDatos.db").getConnection().prepareStatement(sqlDelete);
        pstm.setInt(1, Integer.parseInt(id)); // Establecer el valor de Id en el PreparedStatement
        rowCount = pstm.executeUpdate(); // Ejecutar la consulta de eliminación
        return rowCount > 0; // Devolver true si se eliminó al menos una fila
    }

    @Override
    public ArrayList obtenerTodo() throws SQLException {
        String sql = "SELECT * FROM Audifonos";
        ArrayList<Audifono> resultado = new ArrayList<>();

        Statement stm = ConexionSingleton.getInstance("baseDatos.db").getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql); // Ejecutar la consulta de selección
        while (rst.next()){
            // Crear un objeto Audifono a partir de los datos obtenidos de la base de datos
            resultado.add(new Audifono(rst.getInt("Id"), rst.getString("Marca"), rst.getString("Tipo"), rst.getString("Color"), rst.getString("Conexion"), rst.getString("UrlFoto")));
        }
        return resultado; // Devolver la lista de objetos Audifono
    }

    @Override
    public Audifono buscarPorId(String id) throws SQLException {
        String sql = "SELECT * FROM Audifonos WHERE Id = ?";
        Audifono audifono = null;

        PreparedStatement pstm = ConexionSingleton.getInstance("baseDatos.db").getConnection().prepareStatement(sql);
        pstm.setInt(1, Integer.parseInt(id)); // Establecer el valor de Id en el PreparedStatement
        ResultSet rst = pstm.executeQuery(); // Ejecutar la consulta de selección
        if (rst.next()){
            // Crear un objeto Audifono a partir de los datos obtenidos de la base de datos
            audifono = new Audifono(rst.getInt("Id"), rst.getString("Marca"), rst.getString("Tipo"), rst.getString("Color"), rst.getString("Conexion"), rst.getString("UrlFoto"));
        }
        return audifono; // Devolver el objeto Audifono encontrado (o null si no se encontró)
    }
}