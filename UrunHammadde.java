public class UrunHammadde {
    private int id;
    private int urunID;
    private int hammaddeID;

    public UrunHammadde(int id, int urunID, int hammaddeID) {
        this.id = id;
        this.urunID = urunID;
        this.hammaddeID = hammaddeID;
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

    public int getHammaddeID() {
        return hammaddeID;
    }

    public void setHammaddeID(int hammaddeID) {
        this.hammaddeID = hammaddeID;
    }

    @Override
    public String toString() {
        return "UrunHammadde{" +
                "id=" + id +
                ", urunID=" + urunID +
                ", hammaddeID=" + hammaddeID +
                '}';
    }
}
