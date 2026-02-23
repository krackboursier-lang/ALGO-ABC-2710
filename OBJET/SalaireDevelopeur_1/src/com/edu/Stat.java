package com.edu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author fchatelot
 * @version 1.0
 * @created 16-fevr.-2026 17:03:14
 */
public class Stat {
    // attributs
    private ArrayList<Double> mydata = new ArrayList<Double>();
    private int nbelement;

    // constructeur
    public Stat(ArrayList<Double> montab) {
        this.mydata.addAll(montab);
        // tri des données
        Collections.sort(this.mydata);
        this.nbelement = mydata.size();
    }

    // destructeur
    public void finalize() throws Throwable {

    }

    /**
     * accesseur du tableau de données
     * 
     * @return ArrayList
     */

    public ArrayList<Double> getmydata() {
        return mydata;
    }

    /**
     * accesseur du nombre d'elements
     * 
     * @return int
     */
    public int getnbelement() {
        return nbelement;
    }

    /**
     * modifieur
     * 
     * @param newVal
     */
    public void setmydata(ArrayList<Double> _newVal) {
        this.mydata = _newVal;
    }

    public double calculerMoyenne() {
        double resultat = 0;
        for (Double valeur : mydata) {
            resultat += valeur;

        }
        resultat /= this.nbelement;

        return calcularrondi(resultat, 3);
    }

    public double calculerMediane() {

        // mydata.sort(Comparator.naturalOrder()); >=java 8
        // mydata.sort(Comparator.reverseOrder());>=java 8

        if (this.nbelement % 2 == 0) {
            double mediane = (mydata.get(this.nbelement / 2) + mydata.get((this.nbelement / 2) - 1)) / 2;
            return mediane;

        }

        return mydata.get(this.nbelement / 2);
    }

    public double calculerEcartType() {
        double temp = 0;
        final double MOY = this.calculerMoyenne();
        double res = 0;
        for (Double val : this.mydata) {
            temp += Math.pow((val - MOY), 2);
        }
        temp /= this.nbelement;
        res = Math.sqrt(temp);

        return calcularrondi(res, 3);
    }

    public double[] CalculerQuartile() {
        double[] quartiles = new double[3];

        if (nbelement % 4 == 0) {

            quartiles[0] = mydata.get(nbelement / 4);
        }

        else {
            double moyenneSal = (mydata.get((int) Math.floor(nbelement / 4))
                    + mydata.get((int) Math.ceil(nbelement / 4)) + mydata.get((int) Math.floor(nbelement / 2))
                    + mydata.get((int) Math.ceil(nbelement / 2)) + mydata.get((int) Math.floor(3 * nbelement / 4))
                    + mydata.get((int) Math.ceil(3 * nbelement / 4))) / 2;

            quartiles[0] = moyenneSal;
        }
        quartiles[1] = this.calculerMediane();
        quartiles[2] = this.calculerMediane();

        if (this.nbelement * 3 % 4 == 0) {

            quartiles[2] = mydata.get(nbelement * 3 / 4);
        } else {
            double moyenneSal2 = (mydata.get((int) Math.floor(nbelement * 3 / 4))
                    + mydata.get((int) Math.ceil(3 * nbelement / 4))) / 2;
            quartiles[2] = moyenneSal2;
        }

        return quartiles;

    }

    private double calcularrondi(double _nombre, int decimal) {
        return (double) ((long) (Math.pow(10, decimal) * _nombre + 0.5)) / Math.pow(10, decimal);

    }
}