
package javaapplication61;

public class tembel extends oyuncu{
    
    private String dosya_yolu="/img/tembelsirin.png";
    public tembel(int id, String ad, String tur, int skor) {
        super(id, ad, tur, skor);
    }

    public String getDosya_yolu() {
        return dosya_yolu;
    }

    public void setDosya_yolu(String dosya_yolu) {
        this.dosya_yolu = dosya_yolu;
    }
    
    
}
