package modele;

import java.util.TreeSet;
import modele.*;

/**
 * @author Le Boss
 *
 * La classe DonneesMarees caractérise une marée de part le nom du port dans laquelle elle a
 * été enregistrée et sa hauteur à une certaine heure.
 **/
public class DonneesMarees {

    /* ********************************************************************************************* */
    /* CHAMPS                                                                                        */
    /* ********************************************************************************************* */
    String nomPort;
    Heure heure ;
    int hauteur ;

    /* ********************************************************************************************* */
    /* CONSTRUCTEURS                                                                                 */
    /* ********************************************************************************************* */
    public DonneesMarees (String parNomPort, Heure parHeure, int parHauteur ) {
        nomPort = parNomPort;
        heure = parHeure;
        hauteur = parHauteur;
    }
}
