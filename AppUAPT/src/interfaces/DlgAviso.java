package interfaces;

import entidades.Aviso;
import java.awt.Image;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author danagarces
 */
public class DlgAviso extends javax.swing.JDialog {

    private Aviso aviso;

    /**
     * Creates new form DlgAviso
     */
    public DlgAviso(java.awt.Frame parent, boolean modal, Aviso aviso) {
        super(parent, modal);
        initComponents();

        this.aviso = aviso;

        aplicarFormato();
        llenarDatos();
    }

    public void aplicarFormato() {
        setLocationRelativeTo(null);

        ImageIcon img = new ImageIcon("src/img/logoCorto.png");

        img = new ImageIcon(img.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));

        jLabel_TituloLogo.setIcon(img);
    }

    public void llenarDatos() {
        FileOutputStream output;
        File thefile = new File("image.png");

        jLabel_IDAviso.setText(String.valueOf(aviso.getIdAviso()));
        jLabel_Fecha.setText(aviso.getFecha().toString());
        jTextArea_Descr.setText(aviso.getDescripcion());

        try {
            output = new FileOutputStream(thefile);
            byte buffer[] = new byte[1024];
            while (aviso.getImagen().read(buffer) > 0) {
                output.write(buffer);
            }
            String path = thefile.getAbsolutePath();
            ImageIcon myImage = new ImageIcon(path);
            Image img = myImage.getImage();
            Image newImg = img.getScaledInstance(jLabel_ImgAviso.getWidth(), jLabel_ImgAviso.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon image = new ImageIcon(newImg);

            jLabel_ImgAviso.setIcon(image);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al consultar aviso: " + e, "", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_FondoAviso = new javax.swing.JPanel();
        jLabel_Fecha = new javax.swing.JLabel();
        jLabel_TituloDescripcion = new javax.swing.JLabel();
        jScrollPane_DescrAviso = new javax.swing.JScrollPane();
        jTextArea_Descr = new javax.swing.JTextArea();
        jLabel_TituloFecha = new javax.swing.JLabel();
        jLabel_TituloIdAviso = new javax.swing.JLabel();
        jLabel_IDAviso = new javax.swing.JLabel();
        jLabel_ImgAviso = new javax.swing.JLabel();
        jLabel_TituloAviso = new javax.swing.JLabel();
        jLabel_TituloLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel_FondoAviso.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_Fecha.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel_Fecha.setText("[Fecha]");

        jLabel_TituloDescripcion.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel_TituloDescripcion.setText("Descripción");

        jTextArea_Descr.setColumns(20);
        jTextArea_Descr.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jTextArea_Descr.setRows(5);
        jTextArea_Descr.setEnabled(false);
        jScrollPane_DescrAviso.setViewportView(jTextArea_Descr);

        jLabel_TituloFecha.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel_TituloFecha.setText("Fecha de publicación:");

        jLabel_TituloIdAviso.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel_TituloIdAviso.setText("ID aviso:");

        jLabel_IDAviso.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N

        jLabel_ImgAviso.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N

        jLabel_TituloAviso.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel_TituloAviso.setForeground(new java.awt.Color(102, 102, 0));
        jLabel_TituloAviso.setText("Avisos UAEMEX");

        jLabel_TituloLogo.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel_FondoAvisoLayout = new javax.swing.GroupLayout(jPanel_FondoAviso);
        jPanel_FondoAviso.setLayout(jPanel_FondoAvisoLayout);
        jPanel_FondoAvisoLayout.setHorizontalGroup(
            jPanel_FondoAvisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_FondoAvisoLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel_FondoAvisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_FondoAvisoLayout.createSequentialGroup()
                        .addComponent(jLabel_TituloLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel_TituloAviso))
                    .addGroup(jPanel_FondoAvisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel_ImgAviso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_TituloDescripcion)
                        .addGroup(jPanel_FondoAvisoLayout.createSequentialGroup()
                            .addComponent(jLabel_TituloFecha)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel_FondoAvisoLayout.createSequentialGroup()
                            .addComponent(jLabel_TituloIdAviso)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel_IDAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane_DescrAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel_FondoAvisoLayout.setVerticalGroup(
            jPanel_FondoAvisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_FondoAvisoLayout.createSequentialGroup()
                .addGroup(jPanel_FondoAvisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_FondoAvisoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel_TituloLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_FondoAvisoLayout.createSequentialGroup()
                        .addContainerGap(45, Short.MAX_VALUE)
                        .addComponent(jLabel_TituloAviso)
                        .addGap(37, 37, 37)))
                .addComponent(jLabel_ImgAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_FondoAvisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_TituloIdAviso)
                    .addComponent(jLabel_IDAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_FondoAvisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_TituloFecha)
                    .addComponent(jLabel_Fecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_TituloDescripcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane_DescrAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_FondoAviso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_FondoAviso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DlgAviso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgAviso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgAviso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgAviso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgAviso dialog = new DlgAviso(new javax.swing.JFrame(), true, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_Fecha;
    private javax.swing.JLabel jLabel_IDAviso;
    private javax.swing.JLabel jLabel_ImgAviso;
    private javax.swing.JLabel jLabel_TituloAviso;
    private javax.swing.JLabel jLabel_TituloDescripcion;
    private javax.swing.JLabel jLabel_TituloFecha;
    private javax.swing.JLabel jLabel_TituloIdAviso;
    private javax.swing.JLabel jLabel_TituloLogo;
    private javax.swing.JPanel jPanel_FondoAviso;
    private javax.swing.JScrollPane jScrollPane_DescrAviso;
    private javax.swing.JTextArea jTextArea_Descr;
    // End of variables declaration//GEN-END:variables
}
