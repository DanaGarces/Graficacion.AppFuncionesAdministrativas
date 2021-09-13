package interfaces;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 * @author aphd3
 */
public class cordGeneral extends javax.swing.JPanel {
      
    public cordGeneral() { 
        initComponents();
        lblHead.setIcon(new ImageIcon("Imagenes/uapt.jpg"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ConsultaBtn = new javax.swing.JButton();
        ModificaBtn = new javax.swing.JButton();
        lblHead = new javax.swing.JLabel();

        ConsultaBtn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        ConsultaBtn.setText("Consultar Datos de Contacto");
        ConsultaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaBtnActionPerformed(evt);
            }
        });

        ModificaBtn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        ModificaBtn.setText("Modificar Datos de Contacto");
        ModificaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificaBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(ConsultaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(ModificaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblHead, javax.swing.GroupLayout.PREFERRED_SIZE, 1271, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHead, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ModificaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConsultaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );
    }// </editor-fold>//GEN-END:initComponents

       
    private void ConsultaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaBtnActionPerformed
        consultaPanel consulta = new consultaPanel();
        consulta.setLocation(1230,100);
        this.add(consulta);
        consulta.show();
        
    }//GEN-LAST:event_ConsultaBtnActionPerformed

    private void ModificaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificaBtnActionPerformed
        modificaPanel modifica = new modificaPanel();
        modifica.setLocation(1230,100);
        this.add(modifica);
        modifica.show();
    }//GEN-LAST:event_ModificaBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConsultaBtn;
    private javax.swing.JButton ModificaBtn;
    private javax.swing.JLabel lblHead;
    // End of variables declaration//GEN-END:variables

}
