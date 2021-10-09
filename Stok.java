import java.sql.Date;

public class Stok {
    private int id;
    private int urunID;
    private int miktar;
    private Date sonEklemeTarihi;

    public Stok(int id, int urunID, int miktar, Date sonEklemeTarihi) {
        this.setId(id);
        this.setUrunID(urunID);
        this.setMiktar(miktar);
        this.setSonEklemeTarihi(sonEklemeTarihi);
    }

    @Override
    public String toString() {
        return "Stok{" +
                "id=" + getId() +
                ", urunID=" + getUrunID() +
                ", miktar=" + getMiktar() +
                ", sonEklemeTarihi=" + getSonEklemeTarihi() +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUrunID() {
        return urunID;
    }

    public void setUrunID(int urunID) {
        this.urunID = urunID;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public Date getSonEklemeTarihi() {
        return sonEklemeTarihi;
    }

    public void setSonEklemeTarihi(Date sonEklemeTarihi) {
        this.sonEklemeTarihi = sonEklemeTarihi;
    }
}
