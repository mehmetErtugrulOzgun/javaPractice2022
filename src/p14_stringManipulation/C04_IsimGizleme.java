package p14_stringManipulation;

public class C04_IsimGizleme {
    public static void main(String[] args) {

        // Soru 7) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
        //        isim-soyisim : M***** B*******
        //        kart no : **** **** **** 1234

        String isim="mehmet";
        String soyIsim="OZGUN";
        String kkNo="1234123412341235";

        String yeniIsim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\S","*");

        String yeniSoyisim=soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1).
                replaceAll("\\S}","*");

        String yeniKkNo="**** **** **** " + kkNo.substring(12);
        System.out.println("isim-soyisim : "+yeniIsim + " "+ yeniSoyisim +"\n kart no : " + yeniKkNo);
    }
}