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

        direccion2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        direccion2.setText("Dirección:");

        cpostal2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cpostal2.setText("Código Postal:");

        estado2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        estado2.setText("Estado:");

        telefono2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        telefono2.setText("Teléfono:");

        email2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        email2.setText("Email:");

        txtDireccion.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        txtPostal.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        txtEstado.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        txtTelefono.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        btnOk.setText("Guardar cambios");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(telefono2)
                                    .addGap(35, 35, 35))
                                .addComponent(cpostal2, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(estado2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPostal)
                            .addComponent(txtEstado)
                            .addComponent(txtTelefono)
                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImg3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(direccion2)
                                .addGap(18, 18, 18)
                                .addComponent(txtDireccion)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(237, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImg3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(direccion2)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cpostal2)
                    .addComponent(txtPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estado2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefono2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email2))
                .addGap(18, 18, 18)
                .addComponent(btnOk, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

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
