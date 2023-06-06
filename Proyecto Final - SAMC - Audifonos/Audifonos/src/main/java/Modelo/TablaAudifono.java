package Modelo; // Paquete del modelo

import Persistencia.AudifonoDAO; // Importar la clase AudifonoDAO del paquete Persistencia
import javax.swing.event.TableModelListener; // Importar la clase TableModelListener
import javax.swing.table.TableModel; // Importar la interfaz TableModel
import java.sql.SQLException; // Importar la clase SQLException
import java.util.ArrayList; // Importar la clase ArrayList

public class TablaAudifono implements TableModel {
    private ArrayList<Audifono> datos; // Datos de la tabla
    public static final int COLS = 6; // Número de columnas
    private Persistencia.AudifonoDAO audi = new Persistencia.AudifonoDAO(); // Objeto de acceso a datos

    public TablaAudifono() {
        datos = new ArrayList<>(); // Inicializar la lista de datos
    }

    public TablaAudifono(ArrayList<Audifono> datos, AudifonoDAO audi) {
        this.datos = datos; // Establecer los datos recibidos
    }

    @Override
    public int getRowCount() {
        return datos.size(); // Obtener el número de filas
    }

    @Override
    public int getColumnCount() {
        return COLS; // Obtener el número de columnas
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "Id"; // Nombre de la columna 0
            case 1:
                return "Marca"; // Nombre de la columna 1
            case 2:
                return "Tipo"; // Nombre de la columna 2
            case 3:
                return "Color"; // Nombre de la columna 3
            case 4:
                return "Conexion"; // Nombre de la columna 4
            case 5:
                return "URL foto"; // Nombre de la columna 5
        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return Integer.class; // Clase de la columna 0
            case 1:
                return String.class; // Clase de la columna 1
            case 2:
                return String.class; // Clase de la columna 2
            case 3:
                return String.class; // Clase de la columna 3
            case 4:
                return String.class; // Clase de la columna 4
            case 5:
                return String.class; // Clase de la columna 5
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false; // Las celdas no son editables
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Audifono tpm = datos.get(rowIndex); // Obtener el objeto Audifono en la fila rowIndex
        switch (columnIndex) {
            case 0:
                return tpm.getId(); // Valor de la columna 0
            case 1:
                return tpm.getMarca(); // Valor de la columna 1
            case 2:
                return tpm.getTipo(); // Valor de la columna 2
            case 3:
                return tpm.getColor(); // Valor de la columna 3
            case 4:
                return tpm.getConexion(); // Valor de la columna 4
            case 5:
                return tpm.getUrlFoto(); // Valor de la columna 5
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                int nuevoId = Integer.parseInt((String) aValue); // Convertir el nuevo ID a entero
                datos.get(rowIndex).setId(nuevoId); // Establecer el nuevo ID en el objeto Audifono correspondiente
                break;
            case 1:
                datos.get(rowIndex).setMarca((String) aValue); // Establecer la nueva marca en el objeto Audifono correspondiente
                break;
            case 2:
                datos.get(rowIndex).setTipo((String) aValue); // Establecer el nuevo tipo en el objeto Audifono correspondiente
                break;
            case 3:
                datos.get(rowIndex).setColor((String) aValue); // Establecer el nuevo color en el objeto Audifono correspondiente
                break;
            case 4:
                datos.get(rowIndex).setConexion((String) aValue); // Establecer la nueva conexión en el objeto Audifono correspondiente
                break;
            case 5:
                datos.get(rowIndex).setUrlFoto((String) aValue); // Establecer la nueva URL de la foto en el objeto Audifono correspondiente
                break;
            default:
                System.out.println("No ha cambiado nada"); // Mensaje por defecto cuando no se ha cambiado nada
        }
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
    }

    public ArrayList<Audifono> getDatos() {
        return datos; // Obtener los datos de la tabla
    }

    public void setDatos(ArrayList<Audifono> datos) {
        this.datos = datos; // Establecer los datos de la tabla
    }

    public AudifonoDAO getAudi() {
        return audi; // Obtener el objeto AudifonoDAO
    }

    public void setAudi(AudifonoDAO audi) {
        this.audi = audi; // Establecer el objeto AudifonoDAO
    }

    public void cargarTablas() {
        try {
            datos = audi.obtenerTodo(); // Cargar los datos de la base de datos
        } catch (SQLException sqle) {
            System.out.println("Error"); // Mostrar un mensaje de error
        }
    }

    public boolean agregarAudifono(Audifono audifono) {
        boolean resultado = false;
        try {
            // Obtener el último ID de la lista de datos
            int ultimoId = 0;
            if (!datos.isEmpty()) {
                Audifono ultimoAudifono = datos.get(datos.size() - 1);
                ultimoId = ultimoAudifono.getId();
            }

            // Incrementar el último ID en 1 para obtener el nuevo ID
            int nuevoId = ultimoId + 1;

            // Establecer el nuevo ID en el objeto audifono
            audifono.setId(nuevoId);

            // Insertar el audifono en la base de datos
            if (audi.insertar(audifono)) {
                datos.add(audifono);
                resultado = true;
            } else {
                resultado = false;
            }
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }

    public boolean modificarAudifono(Audifono audifono) {
        boolean resultado = true;
        try {
            if (audi.update(audifono)) {
                resultado = true;
            } else {
                resultado = false;
            }
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }

    public boolean eliminarAudifono(String id) {
        boolean resultado = false;
        try {
            if (audi.delete(id)) {
                resultado = true;
            } else {
                resultado = false;
            }
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }

    public Audifono getAudifonoAtIndex(int index) {
        if (index >= 0 && index < datos.size()) {
            return datos.get(index);
        } else {
            return null; // o lanzar una excepción indicando que el índice está fuera de los límites válidos
        }
    }
}