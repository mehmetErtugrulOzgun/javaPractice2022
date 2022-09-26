package k2_encapsulation;

public class C02_Kapsulleme {
    private String kullaniciAdi;
    private String sifre;

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String yenikullaniciadi) {
        kullaniciAdi = yenikullaniciadi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String yenisifre) {
        if (yenisifre.length() > 10) {
            System.out.println("Sifreniz 10 karakterden daha buyuktur " +
                    "lutfen daha kucuk bir sifre ile yeniden deneyiniz");
        } else {
            sifre = yenisifre;
        }
    }
}