
package javaapplication61;
public abstract class karakter {
    //ID, Ad, Türünü (oyuncu/düşman)
    private int id;
    private String ad;
    private String tur;
   private String dosya_yolu;
   private int skor;
    public karakter(int id, String ad, String tur) {
        this.id = id;
        this.ad = ad;
        this.tur = tur;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public String getDosya_yolu() {
        return dosya_yolu;
    }

    public int getSkor() {
        return skor;
    }
    abstract void puani_goster();
    
}
