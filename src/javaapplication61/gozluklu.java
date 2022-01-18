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
public class gozluklu extends oyuncu{
    
    private String dosya_yolu="/img/zekisirin.png";
    public gozluklu(int id, String ad, String tur, int skor) {
        super(id, ad, tur, skor);
    }

    @Override
    public int getSkor() {
        return super.getSkor(); //To change body of generated methods, choose Tools | Templates.
    }

    public String getDosya_yolu() {
        return dosya_yolu;
    }

    public void setDosya_yolu(String dosya_yolu) {
        this.dosya_yolu = dosya_yolu;
    }
    
    
    
}
