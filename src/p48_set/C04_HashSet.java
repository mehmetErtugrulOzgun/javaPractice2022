package p48_set;

import java.util.Arrays;
import java.util.HashSet;

public class C04_HashSet {
    /*
    Main method altinda bir double hashSet olusturunuz ve bu seti
    adi setOlustur ve retrun tipli hashSet double olan ayri bir method altinda
    3.23,3.10,5.12,10.12,23.12 degerlerini kullanarak doldurun.
    adini toplaminiAl koyacagimiz ve parametre olarak bir Double HAshset kabul edecek ayri bir method
    olusturarak hashSetin degelerin toplamini alacaksiniz

    Cikti------> sonuc=44.69
     */
    public static void main(String[] args) {

        HashSet<Double> hs1=new HashSet<>();

        double sonuc=toplaminiAl(setOlustur());
        System.out.println(sonuc);

    }

    public static HashSet<Double> setOlustur(){
        HashSet<Double> hs1=new HashSet<>(Arrays.asList(3.23,3.10,5.12,10.12,23.12));


        return hs1;
    }

    public static double toplaminiAl(HashSet<Double> dhs){
        double toplam=0;
        for (double each : dhs){
            toplam+=each;
        }
        return toplam;
    }
}
