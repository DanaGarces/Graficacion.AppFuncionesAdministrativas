package interfaces;

import javax.swing.ImageIcon;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 * @author aphd3
 */
public class modificaPanel extends javax.swing.JInternalFrame {
    
    public modificaPanel() {
        initComponents();
        lblImg3.setIcon(new ImageIcon("Imagenes/img3.jpg"));
    }
    
    public void updateData(){
        String nDireccion = txtDireccion.getText();
        String nPostal = txtPostal.getText();
        String nEstado = txtEstado.getText();
        String nTelefono = txtTelefono.getText();
        String nEmail = txtEmail.getText();
        int id = 1;
        
        Conexion mysql = new Conexion();
        Connection conn = mysql.Conectar();
        String direccion = "";
                
        String SQL = "UPDATE contacto SET direccion= '" + nDireccion + 
                "',cpostal='" + nPostal + "',estado='" + nEstado + "',telefono='"
                + nTelefono + "',email='" + nEmail + "' WHERE Idcontacto=" + id;
        try {
            PreparedStatement stmt = conn.prepareStatement(SQL);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Datos Actualizados");
            clean();
        } catch (SQLException ex) {
            Logger.getLogger(modificaPanel.class.getName()).log(Level.SEVERE, null,ex);
        }
    }
    
    public void clean(){
        txtDireccion.setText(" ");
        txtPostal.setText(" ");
        txtEstado.setText(" ");
        txtTelefono.setText(" ");
        txtEmail.setText(" ");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        direccion2 = new javax.swing.JLabel();
        cpostal2 = new javax.swing.JLabel();
        estado2 = new javax.swing.JLabel();
        telefono2 = new javax.swing.JLabel();
        email2 = new javax.swing.JLabel();
        lblImg3 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtPostal = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnOk = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(null);

        direccion2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        direccion2.setText("Dirección:");
        getContentPane().add(direccion2);
        direccion2.setBounds(12, 123, 71, 20);

        cpostal2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cpostal2.setText("Código Postal:");
        getContentPane().add(cpostal2);
        cpostal2.setBounds(30, 169, 103, 20);

        estado2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        estado2.setText("Estado:");
        getContentPane().add(estado2);
        estado2.setBounds(30, 221, 53, 20);

        telefono2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        telefono2.setText("Teléfono:");
        getContentPane().add(telefono2);
        telefono2.setBounds(30, 265, 68, 20);

        email2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        email2.setText("Email:");
        getContentPane().add(email2);
        email2.setBounds(30, 308, 45, 20);
        getContentPane().add(lblImg3);
        lblImg3.setBounds(12, 13, 563, 97);

        txtDireccion.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(txtDireccion);
        txtDireccion.setBounds(101, 123, 474, 39);

        txtPostal.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(txtPostal);
        txtPostal.setBounds(151, 169, 342, 34);

        txtEstado.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(txtEstado);
        txtEstado.setBounds(151, 216, 342, 31);

        txtTelefono.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(txtTelefono);
        txtTelefono.setBounds(151, 260, 342, 30);

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(txtEmail);
        txtEmail.setBounds(151, 303, 342, 31);

        btnOk.setText("Guardar cambios");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });
        getContentPane().add(btnOk);
        btnOk.setBounds(198, 352, 152, 33);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        updateData();
    }//GEN-LAST:event_btnOkActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel cpostal2;
    private javax.swing.JLabel direccion2;
    private javax.swing.JLabel email2;
    private javax.swing.JLabel estado2;
    private javax.swing.JLabel lblImg3;
    private javax.swing.JLabel telefono2;
    public javax.swing.JTextField txtDireccion;
    public javax.swing.JTextField txtEmail;
    public javax.swing.JTextField txtEstado;
    public javax.swing.JTextField txtPostal;
    public javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
