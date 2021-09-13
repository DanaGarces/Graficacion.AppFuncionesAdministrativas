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

        direccion.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        direccion.setText("Dirección:");

        cpostal.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cpostal.setText("Código Postal:");

        Estado.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Estado.setText("Estado:");

        lblCpostal.setBackground(new java.awt.Color(255, 255, 255));
        lblCpostal.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblCpostal.setText(".");
        lblCpostal.setOpaque(true);

        lblEstado.setBackground(new java.awt.Color(255, 255, 255));
        lblEstado.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblEstado.setText(".");
        lblEstado.setOpaque(true);

        telefono.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        telefono.setText("Teléfono:");

        lblTelefono.setBackground(new java.awt.Color(255, 255, 255));
        lblTelefono.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTelefono.setText(".");
        lblTelefono.setOpaque(true);

        email.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        email.setText("Email:");

        lblemail.setBackground(new java.awt.Color(255, 255, 255));
        lblemail.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblemail.setText(".");
        lblemail.setOpaque(true);

        lblDireccion.setBackground(new java.awt.Color(255, 255, 255));
        lblDireccion.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblDireccion.setText(".");
        lblDireccion.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(direccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(telefono)
                                            .addComponent(email)
                                            .addComponent(Estado))
                                        .addGap(35, 35, 35))
                                    .addComponent(cpostal, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblEstado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblCpostal, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                                    .addComponent(lblemail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(28, 28, 28))
                            .addComponent(lblDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lblImg2, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImg2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(direccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cpostal)
                    .addComponent(lblCpostal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Estado))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(telefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(email))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(lblemail, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );

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
