package interfaces;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;

/**
 * @author aphd3
 */
public class secreGeneral extends javax.swing.JPanel {
    public JLabel lblIco, lblPlastico, lblSoftware, lblIndustrial, lblSeguridad, lblMecanica;
    
    public secreGeneral() {
        initComponents();
        lblHead2.setIcon(new ImageIcon("Imagenes/uapt.jpg"));
        ImageIcon icono = new ImageIcon("Imagenes/ico.jpg");        btnICO.setIcon(icono);
        ImageIcon icono2 = new ImageIcon("Imagenes/plast.jpg");      btnPlastico.setIcon(icono2);
        ImageIcon icono3 = new ImageIcon("Imagenes/indus.jpg");      btnIndustrial.setIcon(icono3);
        ImageIcon icono4 = new ImageIcon("Imagenes/mecanica.jpg");   btnMecanica.setIcon(icono4);
        ImageIcon icono5 = new ImageIcon("Imagenes/soft.jpg");       btnSoftware.setIcon(icono5);
        ImageIcon icono6 = new ImageIcon("Imagenes/seguridad.jpg");  btnSeguridad.setIcon(icono6);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHead2 = new javax.swing.JLabel();
        btnICO = new javax.swing.JButton();
        btnPlastico = new javax.swing.JButton();
        btnIndustrial = new javax.swing.JButton();
        btnSoftware = new javax.swing.JButton();
        btnMecanica = new javax.swing.JButton();
        btnSeguridad = new javax.swing.JButton();

        setLayout(null);
        add(lblHead2);
        lblHead2.setBounds(12, 13, 1271, 432);

        btnICO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnICOActionPerformed(evt);
            }
        });
        add(btnICO);
        btnICO.setBounds(100, 480, 110, 88);

        btnPlastico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlasticoActionPerformed(evt);
            }
        });
        add(btnPlastico);
        btnPlastico.setBounds(300, 480, 110, 88);

        btnIndustrial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIndustrialActionPerformed(evt);
            }
        });
        add(btnIndustrial);
        btnIndustrial.setBounds(500, 480, 108, 88);

        btnSoftware.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSoftwareActionPerformed(evt);
            }
        });
        add(btnSoftware);
        btnSoftware.setBounds(680, 480, 116, 88);

        btnMecanica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMecanicaActionPerformed(evt);
            }
        });
        add(btnMecanica);
        btnMecanica.setBounds(880, 480, 110, 88);

        btnSeguridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeguridadActionPerformed(evt);
            }
        });
        add(btnSeguridad);
        btnSeguridad.setBounds(1060, 480, 110, 88);
    }// </editor-fold>//GEN-END:initComponents

    private void btnICOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnICOActionPerformed
        JInternalFrame f = new JInternalFrame("Ingeniería en Computación",true, true, true, true);
        f.setLocation(1270,100);
        f.setSize(500,300);
        lblIco = new JLabel("<html> **** INGENIERÍA EN COMPUTACIÓN **** <p> <p> <p> "
                + "La ingeniería en computación estudia el desarrollo"
                + "de sistemas automatizados y el uso de los lenguajes de programación; de igual forma se "
                + "enfoca al análisis, diseño y la utilización del hardware y software para lograr la "
                + "implementación de las más avanzadas aplicaciones industriales, telemáticas y científicas.");
        lblIco.setFont(new Font("Tahoma", Font.PLAIN, 18));
        f.add(lblIco);
        add(f);
        f.setVisible(true);
    }//GEN-LAST:event_btnICOActionPerformed

    private void btnPlasticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlasticoActionPerformed
        JInternalFrame f2 = new JInternalFrame("Ingeniería en Plásticos",true, true, true, true);
        f2.setLocation(1270,100);
        f2.setSize(500,300);
        lblPlastico= new JLabel("<html> **** INGENIERÍA EN PLÁSTICOS **** <p> <p> <p> "
            + "Las actividades de esta carrera involucran el diseño de partes y productos, "
            + "la transformación del plástico, aspectos de investigación, nuevas aplicaciones "
            + "de los polímeros con el fin de incrementar de manera sustentable la productividad.");
        lblPlastico.setFont(new Font("Tahoma", Font.PLAIN, 18));
        f2.add(lblPlastico);
        add(f2);
        f2.setVisible(true);
    }//GEN-LAST:event_btnPlasticoActionPerformed

    private void btnIndustrialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIndustrialActionPerformed
        JInternalFrame f3 = new JInternalFrame("Ingeniería en Producción Industrial",true, true, true, true);
        f3.setLocation(1270,100);
        f3.setSize(500,300);
        lblIndustrial= new JLabel("<html> **** INGENIERÍA EN PRODUCCIÓN INDUSTRIAL **** <p> <p> <p> "
            + "Es el área de la ingeniería que planea, diseña, implementa y optimiza los sistemas de "
            + "manufactura de bienes y servicios, a través de los cuales fluyen productos e información "
            + "mediante la integración de personas, materiales, equipos, tecnología y energía, en procura"
            + " de obtener la máxima productividad.");
        lblIndustrial.setFont(new Font("Tahoma", Font.PLAIN, 18));
        f3.add(lblIndustrial);
        add(f3);
        f3.setVisible(true);
    }//GEN-LAST:event_btnIndustrialActionPerformed

    private void btnSoftwareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSoftwareActionPerformed
        JInternalFrame f4 = new JInternalFrame("Ingeniería en Software",true, true, true, true);
        f4.setLocation(1270,100);
        f4.setSize(500,300);
        lblSoftware= new JLabel("<html> **** INGENIERÍA EN SOFTWARE **** <p> <p> <p> "
            + "Es una de las ramas de las ciencias de la computación que estudia la creación de "
            + "software confiable y de calidad, basándose en métodos y técnicas de ingeniería. "
            + "Brindando soporte operacional y de mantenimiento, el campo de estudio de la ingeniería de software.");
        lblSoftware.setFont(new Font("Tahoma", Font.PLAIN, 18));
        f4.add(lblSoftware);
        add(f4);
        f4.setVisible(true);
    }//GEN-LAST:event_btnSoftwareActionPerformed

    private void btnMecanicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMecanicaActionPerformed
        JInternalFrame f5 = new JInternalFrame("Ingeniería Mecánica",true, true, true, true);
        f5.setLocation(1270,100);
        f5.setSize(500,300);
        lblMecanica= new JLabel("<html> **** INGENIERÍA MECÁNICA **** <p> <p> <p> "
            + "Es un campo muy amplio que implica el uso de los principios de la física para el análisis,"
            + " diseño, fabricación de sistemas electromecánicos. Rrama de la ingeniería que mediante la "
            + "aplicación de los principios físicos, ha permitido la creación de dispositivos útiles.");
        lblMecanica.setFont(new Font("Tahoma", Font.PLAIN, 18));
        f5.add(lblMecanica);
        add(f5);
        f5.setVisible(true);
    }//GEN-LAST:event_btnMecanicaActionPerformed

    private void btnSeguridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeguridadActionPerformed
        JInternalFrame f6 = new JInternalFrame("Licenciatura de Seguridad Ciudadana",true, true, true, true);
        f6.setLocation(1270,100);
        f6.setSize(500,300);
        lblSeguridad= new JLabel("<html> **** LICENCIATURA DE SEGURIDAD CIUDADANA **** <p> <p> <p> "
            + "Se forman profesionistas capaces de proponer alternativas innovadoras para la prevención "
            + "y solución de diversas problemáticas y necesidades de la sociedad actual en materia de seguridad "
            + "y justicia, con el fin de lograr la convivencia cotidiana, segura y pacífica en un contexto global, "
            + "mediante el desarrollo de una inteligencia colectiva.");
        lblSeguridad.setFont(new Font("Tahoma", Font.PLAIN, 18));
        f6.add(lblSeguridad);
        add(f6);
        f6.setVisible(true);
    }//GEN-LAST:event_btnSeguridadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnICO;
    public javax.swing.JButton btnIndustrial;
    public javax.swing.JButton btnMecanica;
    public javax.swing.JButton btnPlastico;
    public javax.swing.JButton btnSeguridad;
    public javax.swing.JButton btnSoftware;
    private javax.swing.JLabel lblHead2;
    // End of variables declaration//GEN-END:variables
}
