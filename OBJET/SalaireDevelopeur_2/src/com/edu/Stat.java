package com.edu;

import java.util.ArrayList;
import java.util.Collections;

public class Stat {
    private ArrayList<Double> mydata = new ArrayList<>();
    private int nbelement;

    public Stat(ArrayList<Double> montab) {
        this.mydata.addAll(montab);
        Collections.sort(this.mydata);
        this.nbelement = mydata.size();
    }

    public ArrayList<Double> getmydata() {
        return mydata;
    }

    public int getnbelement() {
        return nbelement;
    }

    public void setmydata(ArrayList<Double> _newVal) {
        this.mydata = _newVal;
    }

    public double calculerMoyenne() {
        double resultat = 0;
        for (Double valeur : mydata) {
            resultat += valeur;
        }
        return calcularrondi(resultat / this.nbelement, 3);
    }

    public double calculerMediane() {
        if (this.nbelement % 2 == 0) {
            return (mydata.get(this.nbelement / 2) + mydata.get((this.nbelement / 2) - 1)) / 2;
        }
        return mydata.get(this.nbelement / 2);
    }

    public double calculerEcartType() {
        double temp = 0;
        final double MOY = this.calculerMoyenne();
        for (Double val : this.mydata) {
            temp += Math.pow((val - MOY), 2);
        }
        return calcularrondi(Math.sqrt(temp / this.nbelement), 3);
    }

    public double[] CalculerQuartile() {
        double[] quartiles = new double[3];
        int n = this.nbelement;

        quartiles[0] = mydata.get(n / 4); // Q1
        quartiles[1] = calculerMediane(); // Q2
        quartiles[2] = mydata.get((3 * n) / 4); // Q3

        return quartiles;
    }

    private double calcularrondi(double _nombre, int decimal) {
        return (double) ((long) (Math.pow(10, decimal) * _nombre + 0.5)) / Math.pow(10, decimal);
    }
}
