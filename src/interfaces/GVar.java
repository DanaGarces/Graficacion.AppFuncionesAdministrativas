package interfaces;

import java.awt.*;

public class GVar {

    private static final int FRAME_WIDTH = 1900;
    private static final int FRAME_HEIGHT = 950;
    private static final Dimension FRAME_DIMENSION = new Dimension(FRAME_WIDTH, FRAME_HEIGHT);

    public static Dimension getFrameDimension() {
        return FRAME_DIMENSION;
    }

    private static final int MAIN_PANEL_WIDTH = 1900;
    private static final int MAIN_PANEL_HEIGHT = 800;
    private static final Dimension MAIN_PANEL_DIMENSION = new Dimension(MAIN_PANEL_WIDTH, MAIN_PANEL_HEIGHT);

    private static final int TITLE_PANEL_WIDTH = 600;
    private static final int TITLE_PANEL_HEIGHT = 100;
    private static final Dimension TITLE_PANEL_DIMENSION = new Dimension(TITLE_PANEL_WIDTH, TITLE_PANEL_HEIGHT);

    private static final int BUTTON_WIDE = 150;
    private static final int BUTTON_HEIGHT = 40;
    private static final Dimension BUTTON_DIMENSION = new Dimension(BUTTON_WIDE, BUTTON_HEIGHT);

    public static Dimension getMainPanelDimension() {
        return MAIN_PANEL_DIMENSION;
    }

    public static Dimension getTitlePanelDimension() {
        return TITLE_PANEL_DIMENSION;
    }

    public static Dimension getButtonDimension() {
        return BUTTON_DIMENSION;
    }
}
