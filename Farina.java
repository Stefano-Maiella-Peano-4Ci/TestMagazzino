/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmagazzino;

/**
 *
 * @author maiella.stefano
 */
public class Farina implements Pesabile, Prodotto{
    
   private double peso;
   private double prezzoAlKg;

    @Override
    public double getPeso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPeso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getPrezzo() {
        prezzoAlKg=prezzoAlKg*peso;
        return prezzoAlKg;
    }

    @Override
    public String getDescrizione() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
