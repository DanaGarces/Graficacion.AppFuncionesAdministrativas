package logica;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
        
        System.out.println("Holaaa");
        
    }

}
