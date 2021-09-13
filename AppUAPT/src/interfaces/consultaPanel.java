package interfaces;

import javax.swing.ImageIcon;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author aphd3
 */
public class consultaPanel extends javax.swing.JInternalFrame {

    public consultaPanel() {
        initComponents();
        lblImg2.setIcon(new ImageIcon("Imagenes/img2.jpg"));
        setDatos();
    }

    public void setDatos(){
        ver_direccion();
        ver_cpostal();
        ver_estado();
        ver_telefono();
        ver_email();
    }
    
    public void ver_direccion() {
        Conexion mysql = new Conexion();
        Connection conn = mysql.Conectar();
        String direccion = "";
        String sql = "SELECT direccion FROM contacto;";
        
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                direccion = rs.getString("direccion");
                lblDireccion.setText(""+ direccion);
            }
            System.out.println(" " + direccion);
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void ver_cpostal() {
        Conexion mysql = new Conexion();
        Connection conn = mysql.Conectar();
        String cpostal = "";
        String sql = "SELECT cpostal FROM contacto;";
        
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                cpostal = rs.getString("cpostal");
                lblCpostal.setText(""+ cpostal);
            }
            System.out.println(" " + cpostal);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void ver_estado() {
        Conexion mysql = new Conexion();
        Connection conn = mysql.Conectar();
        String estado = "";
        String sql = "SELECT estado FROM contacto;";
        
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                estado = rs.getString("estado");
                lblEstado.setText(""+ estado);
            }
            System.out.println(" " + estado);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void ver_telefono() {
        Conexion mysql = new Conexion();
        Connection conn = mysql.Conectar();
        String telefono = "";
        String sql = "SELECT telefono FROM contacto;";
        
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                telefono = rs.getString("telefono");
                lblTelefono.setText(""+ telefono);
            }
            System.out.println(" " + telefono);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void ver_email() {
        Conexion mysql = new Conexion();
        Connection conn = mysql.Conectar();
        String email = "";
        String sql = "SELECT email FROM contacto;";
        
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                email = rs.getString("email");
                lblemail.setText(""+ email);
            }
            System.out.println(" " + email);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        direccion = new javax.swing.JLabel();
        cpostal = new javax.swing.JLabel();
        Estado = new javax.swing.JLabel();
        lblCpostal = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        telefono = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        lblemail = new javax.swing.JLabel();
        lblImg2 = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setOpaque(true);
        getContentPane().setLayout(null);

        direccion.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        direccion.setText("Dirección:");
        getContentPane().add(direccion);
        direccion.setBounds(12, 142, 71, 20);

        cpostal.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cpostal.setText("Código Postal:");
        getContentPane().add(cpostal);
        cpostal.setBounds(90, 199, 103, 20);

        Estado.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Estado.setText("Estado:");
        getContentPane().add(Estado);
        Estado.setBounds(90, 243, 53, 20);

        lblCpostal.setBackground(new java.awt.Color(255, 255, 255));
        lblCpostal.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblCpostal.setText(".");
        lblCpostal.setOpaque(true);
        getContentPane().add(lblCpostal);
        lblCpostal.setBounds(208, 188, 339, 31);

        lblEstado.setBackground(new java.awt.Color(255, 255, 255));
        lblEstado.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblEstado.setText(".");
        lblEstado.setOpaque(true);
        getContentPane().add(lblEstado);
        lblEstado.setBounds(208, 237, 339, 33);

        telefono.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        telefono.setText("Teléfono:");
        getContentPane().add(telefono);
        telefono.setBounds(90, 299, 68, 20);

        lblTelefono.setBackground(new java.awt.Color(255, 255, 255));
        lblTelefono.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTelefono.setText(".");
        lblTelefono.setOpaque(true);
        getContentPane().add(lblTelefono);
        lblTelefono.setBounds(208, 288, 339, 33);

        email.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        email.setText("Email:");
        getContentPane().add(email);
        email.setBounds(90, 349, 45, 20);

        lblemail.setBackground(new java.awt.Color(255, 255, 255));
        lblemail.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblemail.setText(".");
        lblemail.setOpaque(true);
        getContentPane().add(lblemail);
        lblemail.setBounds(208, 336, 339, 33);
        getContentPane().add(lblImg2);
        lblImg2.setBounds(12, 13, 555, 97);

        lblDireccion.setBackground(new java.awt.Color(255, 255, 255));
        lblDireccion.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblDireccion.setText(".");
        lblDireccion.setOpaque(true);
        getContentPane().add(lblDireccion);
        lblDireccion.setBounds(90, 123, 485, 58);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Estado;
    private javax.swing.JLabel cpostal;
    private javax.swing.JLabel direccion;
    private javax.swing.JLabel email;
    public javax.swing.JLabel lblCpostal;
    public javax.swing.JLabel lblDireccion;
    public javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblImg2;
    public javax.swing.JLabel lblTelefono;
    public javax.swing.JLabel lblemail;
    private javax.swing.JLabel telefono;
    // End of variables declaration//GEN-END:variables
}
