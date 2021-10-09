import java.sql.Date;

public class Urun {
    private int id;
    private String Ad;
    private Date EklenmeTarihi;

    public Urun(int id, String ad, Date eklenmeTarihi) {
        this.id = id;
        Ad = ad;
        EklenmeTarihi = eklenmeTarihi;
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

    public Date getEklenmeTarihi() {
        return EklenmeTarihi;
    }

    public void setEklenmeTarihi(Date eklenmeTarihi) {
        EklenmeTarihi = eklenmeTarihi;
    }

    @Override
    public String toString() {
        return "Urun{" +
                "id=" + id +
                ", Ad='" + Ad + '\'' +
                ", EklenmeTarihi=" + EklenmeTarihi +
                '}';
    }
}
