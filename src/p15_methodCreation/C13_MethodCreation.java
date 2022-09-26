package p15_methodCreation;

import java.util.Scanner;

public class C13_MethodCreation {
    public static void main(String[] args) {
        //  Kullanicidan ismini,soyismini ve bosluk birakmadan 16 hane olarak kredi karti
        //  numarasini alin. isim ve soyisim ilk harfleri buyuk diger harfler kucuk olacak sekilde
        //  KK numarasinda ise 4 rakamlik 4 blok ve aralarinda bosluk olacak sekilde duzelten 2 method yaziniz
        // ve programda kullanabilmek icin duzenlenmis hallerini geri dondurun

        Scanner scan=new Scanner(System.in);
        System.out.println("Isminizi giriniz");
        String isim=scan.nextLine();
        isim = isimDuzeltmeMethodu(isim);

        System.out.println("Soyisiminizi giriniz");
        String soyIsim=scan.nextLine();
        soyIsim = isimDuzeltmeMethodu(soyIsim);


        System.out.println("Kredi karti numaranizi bosluk birakmadan 16 hane seklinde giriniz");
        String kkNo=scan.nextLine();
        kkNo=kkNumarasiDuzeltmeMethodu(kkNo);

        scan.close();
    }

    public static String isimDuzeltmeMethodu(String isim) {
        isim=isim.trim();
        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();
        return isim;
    }

    public static String kkNumarasiDuzeltmeMethodu(String kkNo) {
        kkNo=kkNo.replaceAll(" ","");
        kkNo=kkNo.substring(0,4)+" "+kkNo.substring(4,8)+" "+kkNo.substring(8,12)+" "+ kkNo.substring(12,16);
        return kkNo;
    }
}
