import java.sql.Date;

public class Kayit {
    private int id;
    private int urunID;
    private int personelID;
    private Date EklenmeTarihi;

    public Kayit(int id, int urunID, int personelID, Date eklenmeTarihi) {
        this.id = id;
        this.urunID = urunID;
        this.personelID = personelID;
        EklenmeTarihi = eklenmeTarihi;
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

    public int getPersonelID() {
        return personelID;
    }

    public void setPersonelID(int personelID) {
        this.personelID = personelID;
    }

    public Date getEklenmeTarihi() {
        return EklenmeTarihi;
    }

    public void setEklenmeTarihi(Date eklenmeTarihi) {
        EklenmeTarihi = eklenmeTarihi;
    }

    @Override
    public String toString() {
        return "Kayit{" +
                "id=" + id +
                ", urunID=" + urunID +
                ", personelID=" + personelID +
                ", EklenmeTarihi=" + EklenmeTarihi +
                '}';
    }
}
