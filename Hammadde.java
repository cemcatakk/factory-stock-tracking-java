import java.sql.Date;

public class Hammadde {
    private int id;
    private String Ad;
    private int Miktar;
    private double BirimFiyat;
    private Date SonAlimTarihi;

    public Hammadde(int id, String ad, int miktar, double birimFiyat, Date sonAlimTarihi) {
        this.id = id;
        Ad = ad;
        Miktar = miktar;
        BirimFiyat = birimFiyat;
        SonAlimTarihi = sonAlimTarihi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return Ad;
    }

    public void setAd(String ad) {
        Ad = ad;
    }

    public int getMiktar() {
        return Miktar;
    }

    public void setMiktar(int miktar) {
        Miktar = miktar;
    }

    public double getBirimFiyat() {
        return BirimFiyat;
    }

    public void setBirimFiyat(double birimFiyat) {
        BirimFiyat = birimFiyat;
    }

    public Date getSonAlimTarihi() {
        return SonAlimTarihi;
    }

    public void setSonAlimTarihi(Date sonAlimTarihi) {
        SonAlimTarihi = sonAlimTarihi;
    }

    @Override
    public String toString() {
        return "Hammadde{" +
                "id=" + id +
                ", Ad='" + Ad + '\'' +
                ", Miktar=" + Miktar +
                ", BirimFiyat=" + BirimFiyat +
                ", SonAlimTarihi=" + SonAlimTarihi +
                '}';
    }
}
