/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import conexion.Conexion;
import interfaces.SubdireccionAcademicaa.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luigi
 */
public class Alumnos {
    //query traer alumno
    
    public static void llenarTablaICO(JTable tabla) throws Exception{
        Conexion mysql = new Conexion();
        Connection conn = mysql.Conectar();
        String num_cuenta,name,materno,paterno,cve_mat,matName="";
        String sql = "select alumno.num_cuenta,alumno.nombre,alumno.ape_paterno,alumno.ape_materno, materia.cve_mat, materia.nameMateria\n" +
"from alumno inner join materia inner join alumno_materia on (alumno.num_cuenta=alumno_materia.num_cuenta and materia.cve_mat = alumno_materia.cve_mat)\n" +
"where alumno.cve_carr=\"ICO-F3\";";

        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                num_cuenta = rs.getString("num_cuenta");
                name=rs.getString("nombre");
                paterno=rs.getString("ape_paterno");
                materno=rs.getString("ape_materno");
                cve_mat=rs.getString("cve_mat");
                matName=rs.getString("nameMateria");
                System.out.println("Alumnos: " + num_cuenta+" "+name+" "+paterno +" "+materno +" "+cve_mat+" "+" "+matName);
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        DefaultTableModel model = new DefaultTableModel();
        tabla.setModel(model);
        
        Statement stm;
        
        try {
             stm = conn.createStatement();
             
             ResultSet rs = stm.executeQuery("select alumno.num_cuenta,alumno.nombre,alumno.ape_paterno,alumno.ape_materno, materia.cve_mat, materia.nameMateria\n" +
"from alumno inner join materia inner join alumno_materia on (alumno.num_cuenta=alumno_materia.num_cuenta and materia.cve_mat = alumno_materia.cve_mat)\n" +
"where alumno.cve_carr=\"ICO-F3\";");
             
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
    public static void llenarTablaIPLA(JTable tabla) throws Exception{
        Conexion mysql = new Conexion();
        Connection conn = mysql.Conectar();
        String num_cuenta,name,materno,paterno,cve_mat,matName="";
        String sql = "select alumno.num_cuenta,alumno.nombre,alumno.ape_paterno,alumno.ape_materno, materia.cve_mat, materia.nameMateria\n" +
"from alumno inner join materia inner join alumno_materia on (alumno.num_cuenta=alumno_materia.num_cuenta and materia.cve_mat = alumno_materia.cve_mat)\n" +
"where alumno.cve_carr=\"IPLA-F3\";";

        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                num_cuenta = rs.getString("num_cuenta");
                name=rs.getString("nombre");
                paterno=rs.getString("ape_paterno");
                materno=rs.getString("ape_materno");
                cve_mat=rs.getString("cve_mat");
                matName=rs.getString("nameMateria");
                System.out.println("Alumnos: " + num_cuenta+" "+name+" "+paterno +" "+materno +" "+cve_mat+" "+" "+matName);
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        DefaultTableModel model = new DefaultTableModel();
        tabla.setModel(model);
        
        Statement stm;
        
        try {
             stm = conn.createStatement();
             
             ResultSet rs = stm.executeQuery("select alumno.num_cuenta,alumno.nombre,alumno.ape_paterno,alumno.ape_materno, materia.cve_mat, materia.nameMateria\n" +
"from alumno inner join materia inner join alumno_materia on (alumno.num_cuenta=alumno_materia.num_cuenta and materia.cve_mat = alumno_materia.cve_mat)\n" +
"where alumno.cve_carr=\"IPLA-F3\";");
             
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
    
    public static void llenarTablaIME(JTable tabla) throws Exception{
        Conexion mysql = new Conexion();
        Connection conn = mysql.Conectar();
        String num_cuenta,name,materno,paterno,cve_mat,matName="";
        String sql = "select alumno.num_cuenta,alumno.nombre,alumno.ape_paterno,alumno.ape_materno, materia.cve_mat, materia.nameMateria\n" +
"from alumno inner join materia inner join alumno_materia on (alumno.num_cuenta=alumno_materia.num_cuenta and materia.cve_mat = alumno_materia.cve_mat)\n" +
"where alumno.cve_carr=\"IME-F3\";";

        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                num_cuenta = rs.getString("num_cuenta");
                name=rs.getString("nombre");
                paterno=rs.getString("ape_paterno");
                materno=rs.getString("ape_materno");
                cve_mat=rs.getString("cve_mat");
                matName=rs.getString("nameMateria");
                System.out.println("Alumnos: " + num_cuenta+" "+name+" "+paterno +" "+materno +" "+cve_mat+" "+" "+matName);
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        DefaultTableModel model = new DefaultTableModel();
        tabla.setModel(model);
        
        Statement stm;
        
        try {
             stm = conn.createStatement();
             
             ResultSet rs = stm.executeQuery("select alumno.num_cuenta,alumno.nombre,alumno.ape_paterno,alumno.ape_materno, materia.cve_mat, materia.nameMateria\n" +
"from alumno inner join materia inner join alumno_materia on (alumno.num_cuenta=alumno_materia.num_cuenta and materia.cve_mat = alumno_materia.cve_mat)\n" +
"where alumno.cve_carr=\"IME-F3\";");
             
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
    
    public static void llenarTablaIPI(JTable tabla) throws Exception{
        Conexion mysql = new Conexion();
        Connection conn = mysql.Conectar();
        String num_cuenta,name,materno,paterno,cve_mat,matName="";
        String sql = "select alumno.num_cuenta,alumno.nombre,alumno.ape_paterno,alumno.ape_materno, materia.cve_mat, materia.nameMateria\n" +
"from alumno inner join materia inner join alumno_materia on (alumno.num_cuenta=alumno_materia.num_cuenta and materia.cve_mat = alumno_materia.cve_mat)\n" +
"where alumno.cve_carr=\"IPI-F3\";";

        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                num_cuenta = rs.getString("num_cuenta");
                name=rs.getString("nombre");
                paterno=rs.getString("ape_paterno");
                materno=rs.getString("ape_materno");
                cve_mat=rs.getString("cve_mat");
                matName=rs.getString("nameMateria");
                System.out.println("Alumnos: " + num_cuenta+" "+name+" "+paterno +" "+materno +" "+cve_mat+" "+" "+matName);
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        DefaultTableModel model = new DefaultTableModel();
        tabla.setModel(model);
        
        Statement stm;
        
        try {
             stm = conn.createStatement();
             
             ResultSet rs = stm.executeQuery("select alumno.num_cuenta,alumno.nombre,alumno.ape_paterno,alumno.ape_materno, materia.cve_mat, materia.nameMateria\n" +
"from alumno inner join materia inner join alumno_materia on (alumno.num_cuenta=alumno_materia.num_cuenta and materia.cve_mat = alumno_materia.cve_mat)\n" +
"where alumno.cve_carr=\"IPI-F3\";");
             
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
    
    public static void llenarTablaISEG(JTable tabla) throws Exception{
        Conexion mysql = new Conexion();
        Connection conn = mysql.Conectar();
        String num_cuenta,name,materno,paterno,cve_mat,matName="";
        String sql = "select alumno.num_cuenta,alumno.nombre,alumno.ape_paterno,alumno.ape_materno, materia.cve_mat, materia.nameMateria\n" +
"from alumno inner join materia inner join alumno_materia on (alumno.num_cuenta=alumno_materia.num_cuenta and materia.cve_mat = alumno_materia.cve_mat)\n" +
"where alumno.cve_carr=\"ISEGCI-F3\";";

        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                num_cuenta = rs.getString("num_cuenta");
                name=rs.getString("nombre");
                paterno=rs.getString("ape_paterno");
                materno=rs.getString("ape_materno");
                cve_mat=rs.getString("cve_mat");
                matName=rs.getString("nameMateria");
                System.out.println("Alumnos: " + num_cuenta+" "+name+" "+paterno +" "+materno +" "+cve_mat+" "+" "+matName);
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        DefaultTableModel model = new DefaultTableModel();
        tabla.setModel(model);
        
        Statement stm;
        
        try {
             stm = conn.createStatement();
             
             ResultSet rs = stm.executeQuery("select alumno.num_cuenta,alumno.nombre,alumno.ape_paterno,alumno.ape_materno, materia.cve_mat, materia.nameMateria\n" +
"from alumno inner join materia inner join alumno_materia on (alumno.num_cuenta=alumno_materia.num_cuenta and materia.cve_mat = alumno_materia.cve_mat)\n" +
"where alumno.cve_carr=\"ISEGCI-F3\";");
             
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
    
    public static void llenarTablaISOFT(JTable tabla) throws Exception{
        Conexion mysql = new Conexion();
        Connection conn = mysql.Conectar();
        String num_cuenta,name,materno,paterno,cve_mat,matName="";
        String sql = "select alumno.num_cuenta,alumno.nombre,alumno.ape_paterno,alumno.ape_materno, materia.cve_mat, materia.nameMateria\n" +
"from alumno inner join materia inner join alumno_materia on (alumno.num_cuenta=alumno_materia.num_cuenta and materia.cve_mat = alumno_materia.cve_mat)\n" +
"where alumno.cve_carr=\"ISOFT-F3\";";

        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                num_cuenta = rs.getString("num_cuenta");
                name=rs.getString("nombre");
                paterno=rs.getString("ape_paterno");
                materno=rs.getString("ape_materno");
                cve_mat=rs.getString("cve_mat");
                matName=rs.getString("nameMateria");
                System.out.println("Alumnos: " + num_cuenta+" "+name+" "+paterno +" "+materno +" "+cve_mat+" "+" "+matName);
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        DefaultTableModel model = new DefaultTableModel();
        tabla.setModel(model);
        
        Statement stm;
        
        try {
             stm = conn.createStatement();
             
             ResultSet rs = stm.executeQuery("select alumno.num_cuenta,alumno.nombre,alumno.ape_paterno,alumno.ape_materno, materia.cve_mat, materia.nameMateria\n" +
"from alumno inner join materia inner join alumno_materia on (alumno.num_cuenta=alumno_materia.num_cuenta and materia.cve_mat = alumno_materia.cve_mat)\n" +
"where alumno.cve_carr=\"ISOFT-F3\";");
             
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
    
    public static void main(String[] args) throws Exception {
           new PanelICO().setVisible(true);
    }
}

