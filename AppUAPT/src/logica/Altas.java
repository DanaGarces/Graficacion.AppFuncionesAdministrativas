/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author mexen
 */
public class Altas {
    private static Boolean InsertarConvocatoria(Connection conn, Convocatoria convocatoria) throws Exception {
        String rutaRecurso;
        String recurso;

        PreparedStatement stmt = null;
        int resul;

        
        try {
            //1. Recuperando sentencia SQL
            
            recurso = "INSERT INTO Convocatoria (Nombre_Convocatoria, Descripcion_Convocatoria, Link_Convocatoria) VALUES (?,?,?);";

            //2. Defino PreparedStatement
            stmt = conn.prepareStatement(recurso);

            //3. Parametrizando PreparedStatemente
            stmt.setString(1, convocatoria.getNombreConv());
            stmt.setString(2, convocatoria.getDescConv());
            stmt.setString(3, convocatoria.getLinkConv());

            //4. Ejecuto sentencia SQL
            resul = stmt.executeUpdate();

            //5. Regreso verdadero
            return (true);
        } catch (SQLException ex) {
            throw new Exception("Error al insertar convocatorias a la bd: " + ex.getMessage());
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }
    
    public static Boolean insertarAutorPlantilla(String NombreConv, String DescConv, String LinkConv) throws Exception {
        try {

            Conexion mysql = new Conexion();
            Connection conn = mysql.Conectar();
            
            Convocatoria convocatoria = new Convocatoria();

            //autor.setCve_autor(0); //Elegido por el usuario
            convocatoria.setNombreConv(NombreConv);
            convocatoria.setDescConv(DescConv);
            convocatoria.setLinkConv(LinkConv);
            
            InsertarConvocatoria(conn, convocatoria);

            return (true);

        } catch (Exception ex) {
            throw new Exception("Error al insertar convocatorias a la plantilla: " + ex.getMessage());
        }
    }
}
