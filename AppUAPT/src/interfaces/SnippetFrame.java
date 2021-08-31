package interfaces;

import java.awt.*;
import javax.swing.*;

public class SnippetFrame extends JFrame {

    public static void main(String[] args) {
        new SnippetFrame();
    }

    public SnippetFrame(Component component, String title, Dimension dimension) {
        super(title);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        if (component != null) {
            getContentPane().add(component, BorderLayout.CENTER);
        }
        pack();
        setSize(new Dimension(dimension.width + 40, dimension.height + 60));
        center();
        setVisible(true);
    }

    public SnippetFrame(Component component, String title) {
        this(component, title, GVar.getFrameDimension());
    }

    public SnippetFrame() {
        this(null, "UAPT-UAEM, Funciones");
    }

    private void center() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = getSize();
        int x = (screenSize.width - frameSize.width) / 2;
        int y = (screenSize.height - frameSize.height) / 2;
        setLocation(x, y);
    }
}
