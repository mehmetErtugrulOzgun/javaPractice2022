package k2_encapsulation;

public class C01_Kapsulleme {
    public static void main(String[] args) {
        C02_Kapsulleme kisi1= new C02_Kapsulleme();
        C02_Kapsulleme kisi2= new C02_Kapsulleme();
        kisi1.setKullaniciAdi("ADMIN");
        kisi1.setSifre("tavuKK123..");

        kisi2.setKullaniciAdi("GEBES GABLUMBAGA");
        kisi2.setSifre("31526269");

        System.out.println(kisi1.getKullaniciAdi());
        System.out.println(kisi1.getSifre());
        System.out.println("----------------------------------");
        System.out.println(kisi2.getKullaniciAdi());
        System.out.println(kisi2.getSifre());
    }

}
