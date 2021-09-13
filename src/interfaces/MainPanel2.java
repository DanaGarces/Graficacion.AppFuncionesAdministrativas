//  CAVEES 150721
package interfaces;

import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class MainPanel2 extends JPanel
{
    
    
    private JPanel titlePanel = new JPanel();
    private JPanel functionsPanel = new JPanel();
    private JPanel exitPanel = new JPanel();
    
    public MainPanel2()
    { 
        super(true);
        setMainPanelParameters();
        setFunctionsPanel();
        setTitlePanel();
        
        setExitPanel();
    }
    
    private void setMainPanelParameters()
    {
        setLayout (new BorderLayout());
//        setMainPanelSize();
        setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.black,10),
                BorderFactory.createTitledBorder("Main Panel")));
    }
    
    private void setTitlePanel()
    {
        JLabel title1 = new JLabel();
        JLabel title2 = new JLabel();
        titlePanel.setLayout (new GridLayout(2,1));
        titlePanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.blue,1),
                BorderFactory.createTitledBorder("Title Panel")));
        
        title1.setFont(new java.awt.Font("Tahoma", 0, 45)); 
        title1.setText("UAPT-UAEM");
        title1.setHorizontalAlignment(JLabel.CENTER);
        title2.setFont(new java.awt.Font("Tahoma", 0, 25)); 
        title2.setText("Unidad Académica Profesional Tianguistenco");
        title2.setHorizontalAlignment(JLabel.CENTER);
        titlePanel.add(title1);
        titlePanel.add(title2);
        add(titlePanel, BorderLayout.NORTH);
    }
    
    private void setFunctionsPanel()
    {
        functionsPanel.setLayout (new BorderLayout());
        functionsPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.red,1),
                BorderFactory.createTitledBorder("Functions Panel")));
        setMenu();
        add(functionsPanel, BorderLayout.CENTER);
    }
    
    private void setMenu()
    {
        JToolBar menu = new JToolBar();
        String[] buttonNames = {"Coordinación Gral","Sub. Académica","Sub. Administrativa",
            "Coord. Laboratorios", "Posgrado Inv","Ext. Vinculación", "Dif. Cultural"};
        String[] toolTips = {"Coordinación General","Subdirección Académica","Subdirección Administrativa",
            "Coordinación de Laboratorios", "Posgrado e Investigación", "Extensión y Vinculación","Difusión Cultural"};
        JButton[] buttons = new JButton[buttonNames.length];
        
        setButtons (menu, buttons, buttonNames, toolTips);
        functionsPanel.add(menu, BorderLayout.NORTH);
        
    }
    
    public static void setButtons(JToolBar toolbar, JButton[] buttons, String[] buttonNames, 
            String[] toolTips)
    {
        for(int i=0; i<buttonNames.length; i++)
        {
            buttons[i] = new JButton(buttonNames[i]);
            buttons[i].setToolTipText(toolTips[i]);
            buttons[i].setBackground(Color.lightGray);
            buttons[i].setPreferredSize(GVar.getButtonDimension());
            buttons[i].setMaximumSize(GVar.getButtonDimension());
            buttons[i].setMinimumSize(GVar.getButtonDimension());
            toolbar.add(buttons[i]);
            
        }
        toolbar.addSeparator();  
        
    } 
    
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if ("Subdirección Académica".equals(command)) {
          //panel.shapeType = panel.RECTANGLE;
        }
        
        
  }
    
    private void setExitPanel()
    {
        exitPanel.setLayout (new FlowLayout());
        exitPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.blue,1),
                BorderFactory.createTitledBorder("Exit Panel")));
        add(exitPanel, BorderLayout.SOUTH);
    }
    
    public Dimension getSize(){return getPreferredSize();}
    private void setMainPanelSize()
    {
        titlePanel.setPreferredSize(GVar.getMainPanelDimension());
        titlePanel.setMinimumSize(GVar.getMainPanelDimension());
        titlePanel.setMaximumSize(GVar.getMainPanelDimension());
    }
    private void setTitlePanelSize()
    {
        setPreferredSize(GVar.getTitlePanelDimension());
        setMinimumSize(GVar.getTitlePanelDimension());
        setMaximumSize(GVar.getTitlePanelDimension());
    }
    
    
}
