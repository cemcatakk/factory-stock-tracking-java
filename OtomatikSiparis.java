import java.sql.Date;

public class OtomatikSiparis {
    private int id;
    private int miktar;
    private int hammaddeID;
    private int asgariMiktar;
    private int periyot;
    private Date sonSiparisTarihi;

    public OtomatikSiparis(int id, int miktar, int hammaddeID, int asgariMiktar, int periyot, Date sonSiparisTarihi) {
        this.id = id;
        this.miktar = miktar;
        this.hammaddeID = hammaddeID;
        this.asgariMiktar = asgariMiktar;
        this.periyot = periyot;
        this.sonSiparisTarihi = sonSiparisTarihi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public int getHammaddeID() {
        return hammaddeID;
    }

    public void setHammaddeID(int hammaddeID) {
        this.hammaddeID = hammaddeID;
    }

    public int getAsgariMiktar() {
        return asgariMiktar;
    }

    public void setAsgariMiktar(int asgariMiktar) {
        this.asgariMiktar = asgariMiktar;
    }

    public int getPeriyot() {
        return periyot;
    }

    public void setPeriyot(int periyot) {
        this.periyot = periyot;
    }

    public Date getSonSiparisTarihi() {
        return sonSiparisTarihi;
    }

    public void setSonSiparisTarihi(Date sonSiparisTarihi) {
        this.sonSiparisTarihi = sonSiparisTarihi;
    }

    @Override
    public String toString() {
        return "OtomatikSiparis{" +
                "id=" + id +
                ", miktar=" + miktar +
                ", hammaddeID=" + hammaddeID +
                ", asgariMiktar=" + asgariMiktar +
                ", periyot=" + periyot +
                ", sonSiparisTarihi=" + sonSiparisTarihi +
                '}';
    }
}
