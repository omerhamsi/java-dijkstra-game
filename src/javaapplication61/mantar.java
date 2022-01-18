/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication61;

/**
 *
 * @author TOSHIBA
 */
public class mantar extends obje{
    private String dosya_yolu="/img/mantarkafa.png";
    public mantar(int deger, int adet) {
        super(deger, adet);
    }

    @Override
    public void setAdet(int adet) {
        super.setAdet(adet); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getAdet() {
        return super.getAdet(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setDeger(int deger) {
        super.setDeger(deger); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getDeger() {
        return super.getDeger(); //To change body of generated methods, choose Tools | Templates.
    }

    public String getDosya_yolu() {
        return dosya_yolu;
    }
    
}
