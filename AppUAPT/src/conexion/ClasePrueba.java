package conexion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * Esta clase solo es para probar las funciones de la clase Conexion.java
 */
public class ClasePrueba {


    /**
     * Método prueba para verificar si se puede consultar una tabla de la base
     * de datos.
     */
    public static void verCliente() {
        Conexion mysql = new Conexion();
        Connection conn = mysql.Conectar();
        String cont = "";
        String sql = "SELECT t_clientes FROM tienda;";

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

}
