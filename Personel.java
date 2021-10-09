public class Personel {
    private int id;
    private String k_adi;
    private String sifre;
    private String ad;
    private String soyad;
    private String yetki;

    public Personel(int id, String k_adi, String sifre, String ad, String soyad, String yetki) {
        this.id = id;
        this.k_adi = k_adi;
        this.sifre = sifre;
        this.ad = ad;
        this.soyad = soyad;
        this.yetki = yetki;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getK_adi() {
        return k_adi;
    }

    public void setK_adi(String k_adi) {
        this.k_adi = k_adi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getYetki() {
        return yetki;
    }

    public void setYetki(String yetki) {
        this.yetki = yetki;
    }

    @Override
    public String toString() {
        return "Personel{" +
                "id=" + id +
                ", k_adi='" + k_adi + '\'' +
                ", sifre='" + sifre + '\'' +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yetki='" + yetki + '\'' +
                '}';
    }
}
