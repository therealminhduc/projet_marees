package modele;
import java.util.GregorianCalendar;

import constantes.ConstantesCalendrier;

import java.util.Calendar;

public class Date implements Comparable <Date>,ConstantesCalendrier {
    private int jour;
    private int mois;
    private int annee;
    private int jourSemaine ;


    public Date ()   {
        GregorianCalendar dateAuj = new GregorianCalendar ();
        annee = dateAuj.get (Calendar.YEAR);
        mois = dateAuj.get (Calendar.MONTH) + 1;
        jour = dateAuj.get (Calendar.DAY_OF_MONTH);
        jourSemaine = dateAuj.get (Calendar.DAY_OF_WEEK);
        if (jourSemaine == 1)
            jourSemaine = 7;
        else jourSemaine -= 1;
    }

    public Date (int parJour, int parMois, int parAnnee)   {
        jour = parJour;
        mois = parMois;
        annee = parAnnee;
        GregorianCalendar date = new GregorianCalendar (annee,mois-1,jour);
        jourSemaine = date.get (Calendar.DAY_OF_WEEK);
        if (jourSemaine == 1)
            jourSemaine = 7;
        else jourSemaine -= 1;
    }



    /**
     * retourne 0 si this et parDate sont égales,
     * -1 si this précède parDate,
     *  1 si parDate précède this
     */
    public int compareTo (Date parDate) {
        if (annee < parDate.annee)
            return -1;
        if (annee > parDate.annee)
            return 1;
        // les années sont =
        if (mois < parDate.mois)
            return -1;
        if (mois > parDate.mois)
            return 1;
        // les mois sont =
        if (jour < parDate.jour)
            return -1;
        if (jour > parDate.jour)
            return 1;
        return 0;
    }

    public String toString () {
        return  JOURS_SEMAINE [jourSemaine -1] + " " + jour + " " + MOIS [mois-1];
    }


    public int getAnnee() {
        return annee;
    }

    public int getJour() {
        return jour;
    }

    public int getMois() {
        return mois;
    }

    public int getJourSemaine () {
        return jourSemaine;
    }

    public boolean isToday() {
        return new Date().compareTo(this) == 0;
    }
}  // class Date