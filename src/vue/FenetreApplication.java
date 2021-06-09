package vue;

import javax.swing.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class FenetreApplication extends JFrame {

    public FenetreApplication (String parTitre) {
        super (parTitre);
        PanelApplication contentPane = new PanelApplication();
        setContentPane (contentPane);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        //setLocation(400,300);
        setSize(700,700);
    }

    public static void main (String  [] args) {
        new FenetreApplication ("Horaire des marrees");
    }
}
