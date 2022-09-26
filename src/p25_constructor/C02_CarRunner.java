package p25_constructor;

public class C02_CarRunner {
    public static void main(String[] args) {
        C01 car1 = new C01();

        /*
        bir esitlikte sol taraf declaration, declaration da data turu variable ismi
        String str= "Mehmet";
        data turu class ismi olabilir
        primitive data turlerini java olusturmustur, biz primitive data turu olusturamayiz
        non-primitive data turlerini java da olusturabilir biz de olusturabiliriz

        C01 car1 yazdigimizda C01 hem class ismi hemde car1 objesinin non-primitive data turudur

        new C01(); esitligin sagi deger olusturma
        new: keyword dur ve yeni bir obje olusturacagimizi beyan eder
        C01 () ise constructor dir
         */

        car1.ilanNo=1000;
        car1.fiyat=20000;
        car1.marka="Opel";
        car1.model="Astra";
        car1.yil=2015;
        //  variablelar sadece deger atamasi yapar
        System.out.println(car1.ilanNo +" "+ car1.fiyat +" "+ car1.yil+" "+car1.marka+" "+car1.model);

        car1.maxHiz(250);
        car1.yakit("benzin");
        //  methodlarin ne yapacagini method belirler

        //  bir araba daha olusturmak istersem eger
        C01 car2 = new C01();
        System.out.println(car2.ilanNo +" "+ car2.fiyat +" "+ car2.yil+" "+car2.marka+" "+car2.model);

        car2.ilanNo=1001;
        car2.fiyat=55000;
        car2.marka="BMW";
        car2.model="i7";
        car2.yil=2022;
        System.out.println(car2.ilanNo +" "+ car2.fiyat +" "+ car2.yil+" "+car2.marka+" "+car2.model);

    }
}