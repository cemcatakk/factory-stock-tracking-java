import java.beans.PersistenceDelegate;
import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;

public class Database {
    private String conStr;
    private Connection connection;
    private ArrayList<Hammadde> hammaddeler;
    private ArrayList<HammaddeSiparis> hammaddeSiparisleri;
    private ArrayList<Kayit> kayitlar;
    private ArrayList<OtomatikSiparis> otomatikSiparisler;
    private ArrayList<Personel> personeller;
    private ArrayList<Siparis> siparisler;
    private ArrayList<Stok> stoklar;
    private ArrayList<Urun> urunler;
    private ArrayList<UrunHammadde> urunHammaddeleri;
    public Database(String conStr) throws SQLException {
        this.conStr = conStr;
        //connection = DriverManager.getConnection(conStr);
        setHammaddeler(new ArrayList<Hammadde>());
        setHammaddeSiparisleri(new ArrayList<HammaddeSiparis>());
        setKayitlar(new ArrayList<Kayit>());
        setOtomatikSiparisler(new ArrayList<OtomatikSiparis>());
        setPersoneller(new ArrayList<Personel>());
        setSiparisler(new ArrayList<Siparis>());
        setStoklar(new ArrayList<Stok>());
        setUrunler(new ArrayList<Urun>());
        setUrunHammaddeleri(new ArrayList<UrunHammadde>());
    }

    public String getConStr() {
        return conStr;
    }

    public void setConStr(String conStr) {
        this.conStr = conStr;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
    public void testData(){
        personeller.add(new Personel(1,"ahmet_duran","12345678","Ahmet","Duran","Personel"));
        personeller.add(new Personel(2,"pelincndn","9988776655","Pelin","Candan","Personel"));
        urunler.add(new Urun(1,"Ahşap Masa",new Date(121,3,19)));
        urunler.add(new Urun(2,"Çelik Ayak",new Date(121,3,18)));
        hammaddeler.add(new Hammadde(1,"Ahşap",50,30.50,new Date(121,3,12)));
        hammaddeler.add(new Hammadde(2,"Çelik",200,99.50,new Date(121,3,11)));
        urunHammaddeleri.add(new UrunHammadde(1,1,1));
        urunHammaddeleri.add(new UrunHammadde(2,1,2));
        urunHammaddeleri.add(new UrunHammadde(3,2,2));
        kayitlar.add(new Kayit(1,1,1,new Date(121,3,12)));
        kayitlar.add(new Kayit(2,2,2,new Date(121,3,11)));
        otomatikSiparisler.add(new OtomatikSiparis(1,50,2,40,1,new Date(121,3,11)));
        otomatikSiparisler.add(new OtomatikSiparis(2,50,1,40,1,new Date(121,3,11)));
    }
    public void yazdir(){
        System.out.println("Personeller:");
        for (Personel personel:personeller){
            System.out.println(personel.toString());
        }
        System.out.println("Hammaddeler:");
        for (Hammadde hammadde:hammaddeler){
            System.out.println(hammadde.toString());
        }
        System.out.println("Ürünler:");
        for (Urun urun:urunler){
            System.out.println(urun.toString());
        }
        System.out.println("Ürün Hammaddeleri:");
        for (UrunHammadde urunHammadde:urunHammaddeleri){
            System.out.println(urunHammadde.toString());
        }
    }
    public void otomatikSiparisKontrolu(){
        Calendar cal = Calendar.getInstance();
        long mevcutZaman=System.currentTimeMillis();
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        for(OtomatikSiparis siparis:otomatikSiparisler){
            if (siparis.getSonSiparisTarihi().getDay()+siparis.getPeriyot()<=dayOfMonth){
                Hammadde h = hammaddeBul(siparis.getHammaddeID());
                h.setMiktar(h.getMiktar()+siparis.getMiktar());
                h.setSonAlimTarihi(new Date(mevcutZaman));
                System.out.println(h.getId()+" ID'li hammaddeye otomatik sipariş sistemi ile "+siparis.getMiktar()+" ekleme yapıldı");
            }
        }
    }
    public Hammadde hammaddeBul(int id){
        for (Hammadde hammadde:hammaddeler){
            if (hammadde.getId()==id){
                return hammadde;
            }
        }
        return null;
    }
    public boolean Giris(String k_adi,String sifre){
        for (Personel personel : personeller){
            if (personel.getK_adi().equals(k_adi)&&personel.getSifre().equals(sifre)){
                return true;
            }
        }
        return false;
    }
    public ArrayList<Hammadde> getHammaddeler() {
        return hammaddeler;
    }

    public void setHammaddeler(ArrayList<Hammadde> hammaddeler) {
        this.hammaddeler = hammaddeler;
    }

    public ArrayList<HammaddeSiparis> getHammaddeSiparisleri() {
        return hammaddeSiparisleri;
    }

    public void setHammaddeSiparisleri(ArrayList<HammaddeSiparis> hammaddeSiparisleri) {
        this.hammaddeSiparisleri = hammaddeSiparisleri;
    }

    public ArrayList<Kayit> getKayitlar() {
        return kayitlar;
    }

    public void setKayitlar(ArrayList<Kayit> kayitlar) {
        this.kayitlar = kayitlar;
    }

    public ArrayList<OtomatikSiparis> getOtomatikSiparisler() {
        return otomatikSiparisler;
    }

    public void setOtomatikSiparisler(ArrayList<OtomatikSiparis> otomatikSiparisler) {
        this.otomatikSiparisler = otomatikSiparisler;
    }

    public ArrayList<Personel> getPersoneller() {
        return personeller;
    }

    public void setPersoneller(ArrayList<Personel> personeller) {
        this.personeller = personeller;
    }

    public ArrayList<Siparis> getSiparisler() {
        return siparisler;
    }

    public void setSiparisler(ArrayList<Siparis> siparisler) {
        this.siparisler = siparisler;
    }

    public ArrayList<Stok> getStoklar() {
        return stoklar;
    }

    public void setStoklar(ArrayList<Stok> stoklar) {
        this.stoklar = stoklar;
    }

    public ArrayList<Urun> getUrunler() {
        return urunler;
    }

    public void setUrunler(ArrayList<Urun> urunler) {
        this.urunler = urunler;
    }

    public ArrayList<UrunHammadde> getUrunHammaddeleri() {
        return urunHammaddeleri;
    }

    public void setUrunHammaddeleri(ArrayList<UrunHammadde> urunHammaddeleri) {
        this.urunHammaddeleri = urunHammaddeleri;
    }
}
