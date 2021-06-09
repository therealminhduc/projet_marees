package vue;

import constantes.ConstantesCalendrier;

import javax.swing.*;
import java.awt.*;

public class PanelSelection extends JPanel implements ConstantesCalendrier {
    JLabel titre = new JLabel("Veuillez choisir le port : ");
    JLabel labelDate = new JLabel("Date : ");
    JLabel labelPort = new JLabel("Port : ");

    String [] nomPort = {"St.Malo", "Port2"};

    JComboBox choisirMois = new JComboBox(MOIS);
    JComboBox choisirDate = new JComboBox(JOUR_DU_MOIS);

    JComboBox choisirPort = new JComboBox(nomPort);

    public PanelSelection() {
        setLayout(new GridBagLayout());
        GridBagConstraints contraintes = new GridBagConstraints ();
        contraintes.insets = new Insets (6,6,6,6);
        contraintes.anchor = GridBagConstraints.WEST;

        contraintes.gridx = 0; contraintes.gridy = 1;
        this.add(labelDate, contraintes);

        contraintes.gridx = 1; contraintes.gridy = 1;
        this.add(choisirDate, contraintes);

        contraintes.gridx = 2; contraintes.gridy = 1;
        this.add(choisirMois, contraintes);

        contraintes.gridx = 0; contraintes.gridy = 3;
        this.add(titre, contraintes);

        contraintes.gridx = 1; contraintes.gridy = 3;
        this.add(choisirPort, contraintes);


    }
}
