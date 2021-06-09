package vue;

import javax.swing.*;
import java.awt.*;

public class PanelApplication extends JPanel {
    PanelSelection panelSelection = new PanelSelection();
    PanelAffichage panelAffichage = new PanelAffichage();

    public PanelApplication () {
        setLayout(new BorderLayout(20,20));

        add(panelSelection, BorderLayout.NORTH);
        add(panelAffichage, BorderLayout.CENTER);

    }
}
