package modele;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;

/**
 * La classe Marees stocke toutes les marées enregistrées dans un fichier.
 * Elle identifie chaque marée enregistrée par sa date et ses données,
 * contenues dans la classe DonneesMarees.
 */
public class Marees
{
    /* ********************************************************************************************* */
    /* CHAMPS                                                                                        */
    /* ********************************************************************************************* */
    TreeMap <Date, DonneesMarees> toutesLesMarees;

    /* ********************************************************************************************* */
    /* CONSTRUCTEUR                                                                                  */
    /* ********************************************************************************************* */
    public Marees(){
        toutesLesMarees = new TreeMap<Date, DonneesMarees>();
    }

    /* ********************************************************************************************* */
    /* GETTERS / SETTERS                                                                             */
    /* ********************************************************************************************* */
    public TreeMap<Date,DonneesMarees> getToutesLesMarees(){
        return toutesLesMarees;
    }

    /* ********************************************************************************************* */
    /* METHODES                                                                                      */
    /* ********************************************************************************************* */
    public String toString(){
        String result = "\n" + toutesLesMarees + "\n\n" ;
        Set keys = getToutesLesMarees().keySet();
        Iterator <Integer> it = keys.iterator();
        while(it.hasNext()){
            Integer key = it.next();
            //ArrayList<DonneesMarees> listeMarees = getToutesLesMarees().get(key);
        }
        return result;
    }
}
