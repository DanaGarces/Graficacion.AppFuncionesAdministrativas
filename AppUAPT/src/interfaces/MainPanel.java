//  CAVEES 150721
package interfaces;

import conexion.Conexion;

import interfaces.SubdireccionAcademicaa.*;
import interfaces.ExtensionVinculacion.ExtVinPanel;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class MainPanel extends JPanel {

    // Variables globales
    private JPanel titlePanel = new JPanel();
    private JPanel functionsPanel = new JPanel();
    private JPanel exitPanel = new JPanel();

    /**
     * Método principal
     *
     * @param args
     */
    public static void main(String[] args) throws Exception {
        new SnippetFrame(new MainPanel(), "UAPT -UAEM Functions");
    }

    /**
     * Constructor
     */
    public MainPanel() throws Exception {
        super(true);
        setMainPanelParameters();
        setFunctionsPanel();
        setTitlePanel();
        setExitPanel();
    }

    // <editor-fold defaultstate="collapsed" desc="Creación de paneles"> 
    private void setMainPanelParameters() {
        setLayout(new BorderLayout());
        //setMainPanelSize();
        setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.decode("#72788D"), 10),
                BorderFactory.createTitledBorder("Panel principal")));
    }

    private void setTitlePanel() {
        JLabel title1 = new JLabel();
        JLabel title2 = new JLabel();
        titlePanel.setLayout(new GridLayout(2, 1));
        titlePanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.decode("#7A89C2"), 1),
                BorderFactory.createTitledBorder("Bienvenid@")));

        title1.setFont(new java.awt.Font("Montserrat", 0, 45));
        title1.setText("UAPT-UAEM");
        title1.setHorizontalAlignment(JLabel.CENTER);
        title2.setFont(new java.awt.Font("Montserrat", 0, 25));
        title2.setText("Unidad Académica Profesional Tianguistenco");
        title2.setHorizontalAlignment(JLabel.CENTER);
        titlePanel.add(title1);
        titlePanel.add(title2);
        add(titlePanel, BorderLayout.NORTH);
    }

    private void setFunctionsPanel() throws Exception {
        functionsPanel.setLayout(new GridLayout(1, 1));
        functionsPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.decode("#E3D7FF"), 10),
                BorderFactory.createTitledBorder("Panel de funciones")));
        setMenu();
        add(functionsPanel, BorderLayout.CENTER);
    }

    private void setExitPanel() {
        exitPanel.setLayout(new FlowLayout());
        exitPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.blue, 1),
                BorderFactory.createTitledBorder("Exit Panel")));
        add(exitPanel, BorderLayout.SOUTH);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Menús y submenús"> 
    private void setMenu() throws Exception {
        JTabbedPane menuTabbedPane = new JTabbedPane(JTabbedPane.TOP);
        JPanel coordinacionPanel = new JPanel();
        JPanel subAcadPanel = new JPanel();
        JPanel subAdmPanel = new JPanel();
        JPanel coordLabPanel = new JPanel();
        JPanel posInvPanel = new JPanel();
        JPanel difCultPanel = new JPanel();
        JPanel extVinPanel = new ExtVinPanel();
        setCoordinacionPanel(coordinacionPanel);
        setSubdAcadPanel(subAcadPanel);
        setSubdAdmPanel(subAdmPanel);
        setLaboratoriosPanel(coordLabPanel);
        setDifCultPanel(difCultPanel);
        menuTabbedPane.addTab("Coordinación General", coordinacionPanel);
        menuTabbedPane.addTab("Subdirección Académica", subAcadPanel);
        menuTabbedPane.addTab("Subdirección Administrativa", subAdmPanel);
        menuTabbedPane.addTab("Coordinación de Laboratorios", coordLabPanel);
        menuTabbedPane.addTab("Posgrado e Investigación", posInvPanel);
        menuTabbedPane.addTab("Difusión Cultural", difCultPanel);
        menuTabbedPane.addTab("Extensión y Vinculación", extVinPanel);
        menuTabbedPane.setSelectedIndex(0);
        functionsPanel.add(menuTabbedPane);

    }

    private void setCoordinacionPanel(JPanel coordinacionGeneralPanel) {
        JTabbedPane coordinacionTabbedPane = new JTabbedPane(JTabbedPane.TOP);
        JPanel cordGeneralPanel = new cordGeneral();
        JPanel secreGeneralPanel = new secreGeneral();
        coordinacionTabbedPane.addTab("Coordinación", cordGeneralPanel);
        coordinacionTabbedPane.addTab("Secretaria", secreGeneralPanel);
        coordinacionTabbedPane.setSelectedIndex(0);
        coordinacionGeneralPanel.setLayout(new GridLayout(1, 1));
        coordinacionGeneralPanel.add(coordinacionTabbedPane);
        
    }

    private void setSubdAcadPanel(JPanel subAcadPanel) throws Exception {
        JTabbedPane subAcadTabbedPane = new JTabbedPane(JTabbedPane.TOP);
        JPanel academicaPanel = new SubAcademicaPanel();
        JPanel ingMecPanel = new PanelIME();
        JPanel ingCompPanel = new PanelICO();
        JPanel ingSoftPanel = new PanelISOFT();
        JPanel ingProdIndPanel = new PanelIPI();
        JPanel ingPlastPanel = new PanelIPLA();
        JPanel segCiudPanel = new PanelISEGCI();
        JPanel contEscolarPanel = new JPanel();
        JPanel titulacionPanel = new JPanel();
        JPanel movilidadPanel = new JPanel();
        subAcadTabbedPane.addTab("Subdirección Académica", academicaPanel);
        subAcadTabbedPane.addTab("Ingeniería Mecánica", ingMecPanel);
        subAcadTabbedPane.addTab("Ingeniería en Computación", ingCompPanel);
        subAcadTabbedPane.addTab("Ingeniería en Software", ingSoftPanel);
        subAcadTabbedPane.addTab("Ingeniería en Produc Industrial", ingProdIndPanel);
        subAcadTabbedPane.addTab("Ingeniería en Plásticos", ingPlastPanel);
        subAcadTabbedPane.addTab("Seguridad Ciudadana", segCiudPanel);
        subAcadTabbedPane.addTab("Control Escolar", contEscolarPanel);
        subAcadTabbedPane.addTab("Titulación", titulacionPanel);
        subAcadTabbedPane.addTab("Movilidad Estudiantil", movilidadPanel);
        subAcadTabbedPane.setSelectedIndex(0);
        subAcadPanel.setLayout(new GridLayout(1, 1));
        subAcadPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.decode("#AFA2FF"), 10),
                BorderFactory.createRaisedSoftBevelBorder()));
        subAcadPanel.add(subAcadTabbedPane);
    }

    private void setLaboratoriosPanel(JPanel coordLabPanel) {
        JTabbedPane coordLabTabbedPane = new JTabbedPane(JTabbedPane.TOP);
        JPanel laboratoriosPanel = new JPanel();
        JPanel labManufacturaPanel = new JPanel();
        JPanel labPlásticosPanel = new JPanel();
        JPanel labMetrologíaPanel = new JPanel();
        JPanel labCaracterizaciónPanel = new JPanel();
        JPanel labPrototipadoPanel = new JPanel();
        JPanel labSíntesisMecanismosPanel = new JPanel();
        JPanel labQuímicaPanel = new JPanel();
        JPanel labFísicaPanel = new JPanel();
        JPanel labElectMagnPanel = new JPanel();
        JPanel labCriminalísticaPanel = new JPanel();
        JPanel labDesarrolloSoftwarePanel = new JPanel();
        JPanel labCómputoParaleloPanel = new JPanel();
        JPanel labRedesPanel = new JPanel();
        coordLabTabbedPane.addTab("Coordinación de Laboratorios", laboratoriosPanel);
        coordLabTabbedPane.addTab("Laboratorio Manufactura", labManufacturaPanel);
        coordLabTabbedPane.addTab("Laboratorio Plásticos", labPlásticosPanel);
        coordLabTabbedPane.addTab("Laboratorio Metrología", labMetrologíaPanel);
        coordLabTabbedPane.addTab("Laboratorio Caracterización", labCaracterizaciónPanel);
        coordLabTabbedPane.addTab("Laboratorio Prototipado", labPrototipadoPanel);
        coordLabTabbedPane.addTab("Laboratorio Síntesis de Mecanismos", labSíntesisMecanismosPanel);
        coordLabTabbedPane.addTab("Laboratorio Química", labQuímicaPanel);
        coordLabTabbedPane.addTab("Laboratorio Física", labFísicaPanel);
        coordLabTabbedPane.addTab("Laboratorio Electricidad y Magnetismo", labElectMagnPanel);
        coordLabTabbedPane.addTab("Laboratorio Criminalística", labCriminalísticaPanel);
        coordLabTabbedPane.addTab("Laboratorio Desarrollo de Software", labDesarrolloSoftwarePanel);
        coordLabTabbedPane.addTab("Laboratorio Cómputo Paralelo", labCómputoParaleloPanel);
        coordLabTabbedPane.addTab("Laboratorio Redes", labRedesPanel);
        coordLabTabbedPane.setSelectedIndex(0);
        coordLabPanel.setLayout(new GridLayout(1, 1));
        coordLabPanel.add(coordLabTabbedPane);
    }

    private void setSubdAdmPanel(JPanel subAdmPanel) {
        JTabbedPane subAdmTabbedPane = new JTabbedPane(JTabbedPane.LEFT);
        JPanel administrativaPanel = new JPanel();
        JPanel recHumanosPanel = new JPanel();
        JPanel recMaterialesPanel = new JPanel();
        JPanel recFinancierosPanel = new JPanel();
        JPanel contabilidadPanel = new JPanel();
        JPanel personalMntoPanel = new JPanel();
        JPanel personalSeguridadPanel = new JPanel();
        subAdmTabbedPane.addTab("Subdirección Administrativa", administrativaPanel);
        subAdmTabbedPane.addTab("Recuros Humanos", recHumanosPanel);
        subAdmTabbedPane.addTab("Recursos Materiales", recMaterialesPanel);
        subAdmTabbedPane.addTab("Recursos Financieros", recFinancierosPanel);
        subAdmTabbedPane.addTab("Contabilidad", contabilidadPanel);
        subAdmTabbedPane.addTab("Personal Mantenimiento", personalMntoPanel);
        subAdmTabbedPane.addTab("Personal Seguridad", personalSeguridadPanel);
        subAdmTabbedPane.setSelectedIndex(0);
        subAdmPanel.setLayout(new GridLayout(1, 1));
        subAdmPanel.add(subAdmTabbedPane);
    }

    private void setDifCultPanel(JPanel difCultPanel) {
        JTabbedPane difusionCulturalTabbedPane = new JTabbedPane(JTabbedPane.LEFT);
        JPanel avisosPanel = new DifCultAvisosPanel(); //Aquí va el panel
        JPanel talleresPanel = new JPanel();
        difusionCulturalTabbedPane.addTab("Avisos", avisosPanel);
        difusionCulturalTabbedPane.addTab("Talleres", talleresPanel);
        difusionCulturalTabbedPane.setSelectedIndex(0);
        difCultPanel.setLayout(new GridLayout(1, 1));
        difCultPanel.add(difusionCulturalTabbedPane);
    }
    // </editor-fold>

    public Dimension getSize() {
        return getPreferredSize();
    }

    private void setMainPanelSize() {
        titlePanel.setPreferredSize(GVar.getMainPanelDimension());
        titlePanel.setMinimumSize(GVar.getMainPanelDimension());
        titlePanel.setMaximumSize(GVar.getMainPanelDimension());
    }

    private void setTitlePanelSize() {
        setPreferredSize(GVar.getTitlePanelDimension());
        setMinimumSize(GVar.getTitlePanelDimension());
        setMaximumSize(GVar.getTitlePanelDimension());
    }

}
