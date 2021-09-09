package logica;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * Esta clase va a servir para crear métodos que conecten con la base de datos
 * y obtengan los resultados requeridos para la interfaz gráfica.
 */
public class Consultas {

    /**
     * Método prueba para verificar si se puede consultar una tabla de la base
     * de datos.
     */
    public static void verCliente() {
        Conexion mysql = new Conexion();
        Connection conn = mysql.Conectar();
        String cont = "";
        String sql = "SELECT nombre FROM Tienda.t_clientes;";

        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                cont = rs.getString("nombre");
            }
            System.out.println("Clientes: " + cont);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

     //Llenado de tablas
    public static void LlenarTabla_Convenios(JTable tabla) throws Exception{
        
    
        DefaultTableModel model = new DefaultTableModel();
        tabla.setModel(model);
        
        Statement stm;
        
        Conexion mysql = new Conexion();
        Connection conn = mysql.Conectar();
        
        try {
             stm = conn.createStatement();
             
             ResultSet rs = stm.executeQuery("SELECT * FROM Convenios");
             
             ResultSetMetaData rsMd = rs.getMetaData();
             
             int cantidadColumnas = rsMd.getColumnCount();
             
            for (int i = 1; i <= cantidadColumnas; i++) {
                model.addColumn(rsMd.getColumnLabel(i));
            }
              
            //8.- Creando las filas para el JTable
            while (rs.next()) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);
            }
            //9.- Cierro el ResultSet
            rs.close();
             
        } catch (Exception e) {
            throw new Exception("Error al llenar tabla: " + e.getMessage());
        }
    }

    
        public static void LlenarTabla_Formatos(JTable tabla) throws Exception{
        
    
        DefaultTableModel model = new DefaultTableModel();
        tabla.setModel(model);
        
        Statement stm;
        
        Conexion mysql = new Conexion();
        Connection conn = mysql.Conectar();
        
        try {
             stm = conn.createStatement();
             
             ResultSet rs = stm.executeQuery("SELECT * FROM Formatos");
             
             ResultSetMetaData rsMd = rs.getMetaData();
             
             int cantidadColumnas = rsMd.getColumnCount();
             
            for (int i = 1; i <= cantidadColumnas; i++) {
                model.addColumn(rsMd.getColumnLabel(i));
            }
              
            //8.- Creando las filas para el JTable
            while (rs.next()) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);
            }
            //9.- Cierro el ResultSet
            rs.close();
             
        } catch (Exception e) {
            throw new Exception("Error al llenar tabla: " + e.getMessage());
        }
    }
        
    public static void LlenarTabla_ExtVin(JTable tabla) throws Exception{
        
    
        DefaultTableModel model = new DefaultTableModel();
        tabla.setModel(model);
        
        Statement stm;
        
        Conexion mysql = new Conexion();
        Connection conn = mysql.Conectar();
        
        try {
             stm = conn.createStatement();
             
             ResultSet rs = stm.executeQuery("SELECT * FROM Convocatoria");
             
             ResultSetMetaData rsMd = rs.getMetaData();
             
             int cantidadColumnas = rsMd.getColumnCount();
             
            for (int i = 1; i <= cantidadColumnas; i++) {
                model.addColumn(rsMd.getColumnLabel(i));
            }
              
            //8.- Creando las filas para el JTable
            while (rs.next()) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);
            }
            //9.- Cierro el ResultSet
            rs.close();
             
        } catch (Exception e) {
            throw new Exception("Error al llenar tabla: " + e.getMessage());
        }
    }
    
}
