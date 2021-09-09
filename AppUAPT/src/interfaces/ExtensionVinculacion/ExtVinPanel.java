/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces.ExtensionVinculacion;

import interfaces.SubAcademica.SubAcademicaPanel;
import java.awt.event.MouseListener;
import java.awt.event.WindowListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Consultas;

/**
 *
 * @author mexen
 */
public class ExtVinPanel extends javax.swing.JPanel {

    /**
     * Creates new form ExtVinPanel
     */
    public ExtVinPanel() {
        initComponents();
         try {
            // TODO add your handling code here:
            Consultas.LlenarTabla_ExtVin(TablaExtVin);
        } catch (Exception ex) {
            Logger.getLogger(SubAcademicaPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TabbedPane_ExtVin = new javax.swing.JTabbedPane();
        ScrollPane_ExtVin = new javax.swing.JScrollPane();
        TablaExtVin = new javax.swing.JTable();
        Btn_PubConv = new javax.swing.JButton();
        Btn_ActTabla = new javax.swing.JButton();

        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });

        TablaExtVin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        ScrollPane_ExtVin.setViewportView(TablaExtVin);

        TabbedPane_ExtVin.addTab("Convocatorias", ScrollPane_ExtVin);

        Btn_PubConv.setText("Publicar Convocatoria");
        Btn_PubConv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_PubConvActionPerformed(evt);
            }
        });

        Btn_ActTabla.setText("Actualizar Tabla");
        Btn_ActTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ActTablaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabbedPane_ExtVin, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Btn_ActTabla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_PubConv, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_PubConv)
                    .addComponent(Btn_ActTabla))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TabbedPane_ExtVin, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_PubConvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_PubConvActionPerformed
        // TODO add your handling code here:
        AltaConvocatoria ConvocatoriaFrm = new AltaConvocatoria();
        ConvocatoriaFrm.setVisible(true);
        
    }//GEN-LAST:event_Btn_PubConvActionPerformed

    private void Btn_ActTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ActTablaActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Consultas.LlenarTabla_ExtVin(TablaExtVin);
        } catch (Exception ex) {
            Logger.getLogger(SubAcademicaPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Btn_ActTablaActionPerformed

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        // TODO add your handling code here:
      
    }//GEN-LAST:event_formMouseMoved


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_ActTabla;
    private javax.swing.JButton Btn_PubConv;
    private javax.swing.JScrollPane ScrollPane_ExtVin;
    private javax.swing.JTabbedPane TabbedPane_ExtVin;
    private javax.swing.JTable TablaExtVin;
    // End of variables declaration//GEN-END:variables
}
