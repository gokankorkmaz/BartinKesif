package kodluyoruz.com.bartinkesif;

/**
 * Created by GokhanKorkmaz on 24.09.2017.
 */

//1-Replik sınıfında resim ve yazı icin 2 degisken kurucu metot ve getter setter metotlari var.
//ozel layout tasarımı yapılacak
public class Replik {

    private int foto;
    private String replik;


    //Kurucu Metot
    public Replik(int image, String text) {
        this.foto = image;
        this.replik = text;
    }
    //Getter Setter


    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getReplik() {
        return replik;
    }

    public void setReplik(String replik) {
        this.replik = replik;
    }
}
