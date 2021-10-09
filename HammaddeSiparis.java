public class HammaddeSiparis {
    private int id;
    private int hammaddeID;
    private int siparisID;

    public HammaddeSiparis(int id, int hammaddeID, int siparisID) {
        this.id = id;
        this.hammaddeID = hammaddeID;
        this.siparisID = siparisID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHammaddeID() {
        return hammaddeID;
    }

    public void setHammaddeID(int hammaddeID) {
        this.hammaddeID = hammaddeID;
    }

    public int getSiparisID() {
        return siparisID;
    }

    public void setSiparisID(int siparisID) {
        this.siparisID = siparisID;
    }

    @Override
    public String toString() {
        return "HammaddeSiparis{" +
                "id=" + id +
                ", hammaddeID=" + hammaddeID +
                ", siparisID=" + siparisID +
                '}';
    }
}
