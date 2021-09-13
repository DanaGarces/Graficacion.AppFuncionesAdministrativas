package conexion;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 * Realiza la conexión a la base de datos usando MySQL
 */
public class Conexion {

    private static final String USERNAME = "root";
    private static final String PASSWORD = "luIg*i123+4";
    private static final String CONN_STRING = "jdbc:mysql://localhost:3306/uapt_uaemex?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

    /**
     * Crea una conexión con la base de datos
     * @return conexión a la base de datos
     */
    public Connection Conectar() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            System.out.println("Conectado.");
        } catch (SQLException e) {
            System.err.println(e);
            JOptionPane.showMessageDialog(null, e);
        }
        return conn;
    }

}
