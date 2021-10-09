import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws SQLException {
        Database db = new Database("TEST");
        db.testData();
        db.yazdir();
        db.otomatikSiparisKontrolu();
        String k_adi="pelincndn";
        String sifre="9988776655";
        if (db.Giris(k_adi,sifre)){
            System.out.println(k_adi+" Giriş başarılı.");
        }
        else{
            System.out.println("Giriş başarısız, hatalı kullanıcı adı/şifre.");
        }
    }
}
