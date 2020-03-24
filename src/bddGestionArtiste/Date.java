package bddGestionArtiste;

import java.text.DecimalFormat;

public class Date {

    DecimalFormat jourMois = new DecimalFormat("00");

    private int jour;
    private int mois;
    private int an;
    private boolean valide;

    // Constructeur à 3 paramètres
    public Date(int jour, int mois, int an) {

        int n = ((an%4 == 0 && an%100 !=0) || an%400 == 0) ? 29 : 28 ;  // Traitement des années bissextiles

        int[] tabMois = { 31, n, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // nombre de jours par mois, de janvier à
        // décembre


        if (mois <= 0 || mois > 12) {
            this.valide = false;
        } else {
            if (jour > tabMois[mois - 1]) {
                this.valide = false;
            } else {
                this.jour = jour;
                this.mois = mois;
                this.an = an;
                this.valide = true;
            }
        }
    }

    public boolean isValide() {
        return valide;
    }

    public String toString() {
        return String.format(jourMois.format(jour) + "-" + jourMois.format(mois) + "-" + an);
    }
}
