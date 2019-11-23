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
public class Farina implements Prodotto, Pesabile{
    private double prezzoAlKg;
    private double peso;
    

    @Override
    public String getDescrizione() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getPrezzo() {
        double prezzo;
        prezzo = prezzoAlKg * peso;
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

    
    
}
