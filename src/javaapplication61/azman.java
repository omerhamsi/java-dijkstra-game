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
public class azman extends dusman{
    
    private int x;
    private int y;
    private String dosya_yolu="/img/kedi.png";
    public azman(int dusmanid, String dusmanadi, String dusman_tur) {
        super(dusmanid, dusmanadi, dusman_tur);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getDosya_yolu() {
        return dosya_yolu;
    }

    public void setDosya_yolu(String dosya_yolu) {
        this.dosya_yolu = dosya_yolu;
    }
    
}
