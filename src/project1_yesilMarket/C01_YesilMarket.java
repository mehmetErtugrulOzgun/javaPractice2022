package project1_yesilMarket;

public class C01_YesilMarket {
    /*
    Basarili marker alisveris programi.


    1.Adim urunler ve fiyatlari iceren listeleri olusturunuz.

                No        Ürün          Fiyat
               ====    =========      ===========

               00       DOMATES         2.10
               01       PATATES         3.20
               02       BİBER           1.50
               03       SOĞAN           2.30
               04       HAVUÇ           3.10
               05       ELMA            1.20
               06       MUZ             1.90
               07       ÇİLEK           2.35
               08       KAVUN           4.10
               09       ÜZÜM            5.80
               10       LİMON           3.40


    2.Adim : Kullanicinin urun nosuna gore listeden urun secmesini isteyiniz
    3.Adim : Kac kg satin almak istedigini sorun
    4.Adim : Alinacak bu urunu sepete ekleyiniz ve Sepeti yazdiriniz
    5.Adim : Baska bir urun alip almak istemedigini sorunuz
    6.Adim : Eger devam etmek istiyorsa yeniden urun secme kismina yonlendiriniz
    7.Adim : Eger bitirmek istiyorsa odeme kismina geciniz ve odeme sonrasinda programi
     */

/*
1.  Urunler(String) ve urun fiyatlari(double) icin ayri ayri list olusturmaliyim.
Listler class levelda olmali cunku main method haric diger metodlarda kullanilacak.

2.  Listeledigim urunleri ve fiyatlarini bir method() ile kullaniciya
gostermeli yazdiran bir method olmali. bu method geri cikti vermeyecegi icin ve sadece
println calisacagi icin return type void olmali , parametresiz olmali.
method------> public static name urunListele (){for, println{i+urun+fiyat)}

3.  Scanner classindan obje creat edilmeli. urunLİstele() method call edilerek
kullanici ekranina urun listesi gosterlmeli. kullanicidan urun kodu ve
urun miktari istenilmeli(println).
int urunNo = kullanicinin girdigi urun kodu atanmali
double kilo= kullanicinin girdigi urun miktari kg atanmali

4.  Musteri icin alisveris sepeti olusturalim. sepetUrunler List(String) ,
sepetKg List(double), sepetFiyat List(double)
public static void sepeteEkle(int urunKodu, double kilo) {spetFiyat =urunFiyati*kilo list(dpuble)}

her sepet alisverisinden sonra olusan sepet fiyatini toplayan bir primitive (double) toplamFiyat olusturmali
toplamFiyat+=sepetFiyati;

5.  sepet eklenen urunler miktari toplamFiyati ve sepetin  son durumunu hesaplatip yazdirmali ki kullanici
devam edip etmeyecegini sorabilelim
public static double(toplamFiyat) sepetYazdir(){println(urunler+fiyat+kilo)}

6.  kullaniciya devam edip etmeyecegi sorulmali. kullanici cevabi bloolean(true/false),String(e/h), int(1/0)
cevap verisine gore islem akisi icin if kontrolu olmali------> cevap evet ise tum islemler bastan tekrar edilmeli
do-while(cevap)---- cevap evet ise "do" ------ hayir ise alisveris bitirilmeli odeme talep edilmeli

7.  public static void odeme(println(double toplamFiyat))[println()}





3.
 */


}
