package logica;

import conexion.Conexion;
import entidades.Aviso;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * Esta clase va a servir para crear métodos que conecten con la base de datos y
 * obtengan los resultados requeridos para la interfaz gráfica.
 */
public class Consultas {

    //Llenado de tablas
    public static void LlenarTabla_Convenios(JTable tabla) throws Exception {

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

    public static void LlenarTabla_Formatos(JTable tabla) throws Exception {

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

    public static void LlenarTabla_ExtVin(JTable tabla) throws Exception {

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

    /**
     * Consulta la tabla de avisos en la base de datos
     *
     * @param tabla
     * @throws Exception
     */
    public static void LlenarTablaAvisos(JTable tabla) throws Exception {

        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        };
        tabla.setModel(model);

        Statement stm;

        Conexion mysql = new Conexion();
        Connection conn = mysql.Conectar();

        try {
            stm = conn.createStatement();

            ResultSet rs = stm.executeQuery("SELECT idaviso, descripcion, fechapublic FROM avisos");

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
        
        System.out.println("Holaaa");
        
    }

    /**
     * Consulta un juego dado un ID en la base de datos
     *
     * @param idAviso
     * @return juego correspondiente al ID
     * @throws SQLException
     */
    public static Aviso consultarAviso(int idAviso) throws SQLException, Exception {

        // Variables de progreso
        Connection con = null;
        PreparedStatement pstmt = null;
        Aviso aviso = new Aviso();
        InputStream input;

        try {
            // 1. Declaro la sentencia SQL
            String sentenciaSQL = "SELECT "
                    + "descripcion, "
                    + "imagen, "
                    + "fechapublic "
                    + "FROM uapt.avisos WHERE idaviso = ?";

            // 2. Obtengo la conexión
            Conexion mysql = new Conexion();
            con = mysql.Conectar();

            // 3. Preparo la sentencia SQL
            pstmt = con.prepareStatement(sentenciaSQL);

            // 4. Asigno los valores requeridos
            pstmt.setInt(1, idAviso);

            // 5. Recupero la sentencia SQL
            ResultSet resultado = pstmt.executeQuery();

            // 5. Obtengo los datos del ResultSet
            while (resultado.next()) {
                aviso.setIdAviso(idAviso);
                aviso.setDescripcion(resultado.getString(1));

                input = resultado.getBinaryStream(2);
                aviso.setImagen(input);

                aviso.setFecha(resultado.getDate(3));
            }

            // 7. Devuelvo el valor verdadero
            return aviso;

        } catch (SQLException e) {

            throw new Exception("Error al llenar tabla: " + e.getMessage());

        } finally {

            pstmt.close();

        }

    }

    public static int crearAviso(String path, String descripcion) throws SQLException, Exception {

        Connection con = null;
        Date sqlDate = new Date(System.currentTimeMillis());
        FileInputStream fis = null;

        PreparedStatement pstmt = null;

        try {

            fis = new FileInputStream(path);

            // 1. Declaro la sentencia SQL
            String sentenciaSQL = "INSERT INTO avisos (descripcion, imagen, fechapublic) "
                    + "VALUES (?,?,?)";

            // 2. Obtengo la conexión
            Conexion mysql = new Conexion();
            con = mysql.Conectar();

            // 3 . Desactivo el autocommit
            con.setAutoCommit(false);

            // 4. Preparo la sentencia SQL
            pstmt = con.prepareStatement(sentenciaSQL);

            // 5. Asigno los valores del registro a insertar
            pstmt.setString(1, descripcion);
            pstmt.setBinaryStream(2, fis);
            pstmt.setDate(3, sqlDate);

            // 6. Ejecuto la sentencia SQL
            int res = pstmt.executeUpdate();

            // 7. Hago commit
            con.commit();

            return res;

        } catch (SQLException e) {
            con.rollback();
            throw new Exception("Error al llenar tabla: " + e.getMessage());

        } finally {

            pstmt.close();

        }

    }
}
