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

        lblHead = new javax.swing.JLabel();
        ConsultaBtn = new javax.swing.JButton();
        ModificaBtn = new javax.swing.JButton();

        setLayout(null);
        add(lblHead);
        lblHead.setBounds(12, 13, 1271, 410);

        ConsultaBtn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        ConsultaBtn.setText("Consultar Datos de Contacto");
        ConsultaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaBtnActionPerformed(evt);
            }
        });
        add(ConsultaBtn);
        ConsultaBtn.setBounds(220, 440, 315, 90);

        ModificaBtn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        ModificaBtn.setText("Modificar Datos de Contacto");
        ModificaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificaBtnActionPerformed(evt);
            }
        });
        add(ModificaBtn);
        ModificaBtn.setBounds(640, 440, 315, 90);
    }// </editor-fold>//GEN-END:initComponents

       
    private void ConsultaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaBtnActionPerformed
        consultaPanel consulta = new consultaPanel();
        consulta.setLocation(1230,100);
        consulta.setSize(603,432);
        this.add(consulta);
        consulta.show();
    }//GEN-LAST:event_ConsultaBtnActionPerformed

    private void ModificaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificaBtnActionPerformed
        modificaPanel modifica = new modificaPanel();
        modifica.setLocation(1230,100);
        modifica.setSize(603,432);
        this.add(modifica);
        modifica.show();
    }//GEN-LAST:event_ModificaBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConsultaBtn;
    private javax.swing.JButton ModificaBtn;
    private javax.swing.JLabel lblHead;
    // End of variables declaration//GEN-END:variables

}
