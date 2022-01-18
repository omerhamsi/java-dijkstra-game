
package javaapplication61;

public class oyuncu extends karakter{
    
    private int skor;
    private String dosya_yolu;
    public oyuncu(int id, String ad, String tur,int skor) {
        super(id, ad, tur);
        this.skor=skor;
    }

    //puani goster
    public void puani_goster(){
        System.out.println("skor:"+skor);
    }
    public int getSkor() {
        return skor;
    }

    public void setSkor(int skor) {
        this.skor = skor;
    }

    public String getDosya_yolu() {
        return dosya_yolu;
    }
    
    
    
}
