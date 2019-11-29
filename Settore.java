/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmagazzino;

import java.util.ArrayList;

/**
 *
 * @author maiella.stefano
 */
public class Settore {
    private String posizione;
    private double mq;
    private double temp;
    private ArrayList<Lotto> lotti;

    public Settore(String posizione, double mq, double temp, ArrayList<Lotto> lotti) {
        this.posizione = posizione;
        this.mq = mq;
        this.temp = temp;
        lotti = new ArrayList();
    }

    public String getPosizione() {
        return posizione;
    }

    public double getMq() {
        return mq;
    }

    public double getTemp() {
        return temp;
    }

    public ArrayList<Lotto> getLotti() {
        return lotti;
    }
    
    public double getMqDisponibili(){
        double mqDisponibili= mq;
        return mq;
    }
}
