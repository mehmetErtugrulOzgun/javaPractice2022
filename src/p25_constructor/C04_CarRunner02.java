package p25_constructor;

public class C04_CarRunner02 {


    public static void main(String[] args) {
        //  ilk deger atamasi yapmadan bos bir car olusturmak istiyorsak
        //  default constructor yeterli olur
        C01 car1=new C01();
        //  ama bu durumda car1e ait tum degerleri tek tek atamam gerekir

        car1.ilanNo=1003;
        car1.marka="Nissan";
        car1.model="GTR";
        car1.fiyat=45000;
        car1.yil=2015;

        System.out.println(car1.ilanNo +" "+ car1.fiyat +" "+ car1.yil+" "+car1.marka+" "+car1.model);


        //  eger objeyi olustururken degerde atamak istiyorsak
        //  parametreli constructor olusturmamiz gerekir

        C01 car2= new C01(1004,25000,2012,"Honda","Civic");

        System.out.println(car2.ilanNo +" "+ car2.fiyat +" "+ car2.yil+" "+car2.marka+" "+car2.model);

        C01 car3 =new C01(1005,"Tesla",28500);
        System.out.println(car3.ilanNo +" "+ car3.fiyat +" "+ car3.marka+" "+
                car3.model+" "+ car3.yil);

    }
}
