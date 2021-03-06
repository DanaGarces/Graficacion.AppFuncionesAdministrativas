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

        btnICO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnICOActionPerformed(evt);
            }
        });

        btnPlastico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlasticoActionPerformed(evt);
            }
        });

        btnIndustrial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIndustrialActionPerformed(evt);
            }
        });

        btnSoftware.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSoftwareActionPerformed(evt);
            }
        });

        btnMecanica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMecanicaActionPerformed(evt);
            }
        });

        btnSeguridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeguridadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblHead2, javax.swing.GroupLayout.PREFERRED_SIZE, 1271, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(btnICO, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(btnPlastico, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(btnIndustrial, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(btnSoftware, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(btnMecanica, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(btnSeguridad, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(214, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHead2, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnICO, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(btnPlastico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIndustrial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSoftware, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMecanica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSeguridad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnICOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnICOActionPerformed
        JInternalFrame f = new JInternalFrame("Ingenier??a en Computaci??n",true, true, true, true);
        f.setLocation(1270,100);
        f.setSize(500,300);
        lblIco = new JLabel("<html> **** INGENIER??A EN COMPUTACI??N **** <p> <p> <p> "
                + "La ingenier??a en computaci??n estudia el desarrollo"
                + "de sistemas automatizados y el uso de los lenguajes de programaci??n; de igual forma se "
                + "enfoca al an??lisis, dise??o y la utilizaci??n del hardware y software para lograr la "
                + "implementaci??n de las m??s avanzadas aplicaciones industriales, telem??ticas y cient??ficas.");
        lblIco.setFont(new Font("Tahoma", Font.PLAIN, 18));
        f.add(lblIco);
        add(f);
        f.setVisible(true);
    }//GEN-LAST:event_btnICOActionPerformed

    private void btnPlasticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlasticoActionPerformed
        JInternalFrame f2 = new JInternalFrame("Ingenier??a en Pl??sticos",true, true, true, true);
        f2.setLocation(1270,100);
        f2.setSize(500,300);
        lblPlastico= new JLabel("<html> **** INGENIER??A EN PL??STICOS **** <p> <p> <p> "
            + "Las actividades de esta carrera involucran el dise??o de partes y productos, "
            + "la transformaci??n del pl??stico, aspectos de investigaci??n, nuevas aplicaciones "
            + "de los pol??meros con el fin de incrementar de manera sustentable la productividad.");
        lblPlastico.setFont(new Font("Tahoma", Font.PLAIN, 18));
        f2.add(lblPlastico);
        add(f2);
        f2.setVisible(true);
    }//GEN-LAST:event_btnPlasticoActionPerformed

    private void btnIndustrialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIndustrialActionPerformed
        JInternalFrame f3 = new JInternalFrame("Ingenier??a en Producci??n Industrial",true, true, true, true);
        f3.setLocation(1270,100);
        f3.setSize(500,300);
        lblIndustrial= new JLabel("<html> **** INGENIER??A EN PRODUCCI??N INDUSTRIAL **** <p> <p> <p> "
            + "Es el ??rea de la ingenier??a que planea, dise??a, implementa y optimiza los sistemas de "
            + "manufactura de bienes y servicios, a trav??s de los cuales fluyen productos e informaci??n "
            + "mediante la integraci??n de personas, materiales, equipos, tecnolog??a y energ??a, en procura"
            + " de obtener la m??xima productividad.");
        lblIndustrial.setFont(new Font("Tahoma", Font.PLAIN, 18));
        f3.add(lblIndustrial);
        add(f3);
        f3.setVisible(true);
    }//GEN-LAST:event_btnIndustrialActionPerformed

    private void btnSoftwareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSoftwareActionPerformed
        JInternalFrame f4 = new JInternalFrame("Ingenier??a en Software",true, true, true, true);
        f4.setLocation(1270,100);
        f4.setSize(500,300);
        lblSoftware= new JLabel("<html> **** INGENIER??A EN SOFTWARE **** <p> <p> <p> "
            + "Es una de las ramas de las ciencias de la computaci??n que estudia la creaci??n de "
            + "software confiable y de calidad, bas??ndose en m??todos y t??cnicas de ingenier??a. "
            + "Brindando soporte operacional y de mantenimiento, el campo de estudio de la ingenier??a de software.");
        lblSoftware.setFont(new Font("Tahoma", Font.PLAIN, 18));
        f4.add(lblSoftware);
        add(f4);
        f4.setVisible(true);
    }//GEN-LAST:event_btnSoftwareActionPerformed

    private void btnMecanicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMecanicaActionPerformed
        JInternalFrame f5 = new JInternalFrame("Ingenier??a Mec??nica",true, true, true, true);
        f5.setLocation(1270,100);
        f5.setSize(500,300);
        lblMecanica= new JLabel("<html> **** INGENIER??A MEC??NICA **** <p> <p> <p> "
            + "Es un campo muy amplio que implica el uso de los principios de la f??sica para el an??lisis,"
            + " dise??o, fabricaci??n de sistemas electromec??nicos. Rrama de la ingenier??a que mediante la "
            + "aplicaci??n de los principios f??sicos, ha permitido la creaci??n de dispositivos ??tiles.");
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
            + "Se forman profesionistas capaces de proponer alternativas innovadoras para la prevenci??n "
            + "y soluci??n de diversas problem??ticas y necesidades de la sociedad actual en materia de seguridad "
            + "y justicia, con el fin de lograr la convivencia cotidiana, segura y pac??fica en un contexto global, "
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
