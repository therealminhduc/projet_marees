package vue;

import javax.swing.*;
import java.awt.*;

public class PanelAffichage extends JPanel {
    JLabel test = new JLabel("test2");

    public PanelAffichage () {
        setLayout(new BorderLayout(20,20));
        add(test);
    }
}
