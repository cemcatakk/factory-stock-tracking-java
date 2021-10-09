import java.sql.Date;

public class Siparis {
    private int id;
    private Date EklenmeTarihi;
    private int miktar;

    public Siparis(int id, Date eklenmeTarihi, int miktar) {
        this.id = id;
        EklenmeTarihi = eklenmeTarihi;
        this.miktar = miktar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getEklenmeTarihi() {
        return EklenmeTarihi;
    }

    public void setEklenmeTarihi(Date eklenmeTarihi) {
        EklenmeTarihi = eklenmeTarihi;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    @Override
    public String toString() {
        return "Siparis{" +
                "id=" + id +
                ", EklenmeTarihi=" + EklenmeTarihi +
                ", miktar=" + miktar +
                '}';
    }
}
