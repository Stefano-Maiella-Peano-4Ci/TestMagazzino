/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmagazzino;

/**
 *
 * @author LABSISE
 */
public class Orata extends Pesce implements Prodotto, Pesabile {
    private String descrizione;
    private double prezzo;
    

    @Override
    public String getDescrizione() {
        return descrizione;
    }

    @Override
    public double getPrezzo() {
        return prezzo;
    }

    @Override
    public Double setPeso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getPeso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getLuogoPesca() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
