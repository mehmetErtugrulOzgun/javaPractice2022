package p20_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {
        short arr1[]= new short[5];
        //  System.out.println(arr1);
        //  arr1 bir array turu non-primitive
        //  short arrayin degil icine koyacagimiz degerlerin data turu
        //  eger non-primitive bir datayi direkt syso ile yazdirmaya calisirsaniz
        //  java arr1in referans bilgisini gonderir

        //  Soru 1: Elemanlari “Ali” , “Veli”, “Ayse” ve “Fatma” olan bir array olusturun ve bu
        //  array’i yazdirin.

        //  1.yontem once olusturup sonra istedigimiz indexlere deger atama
        String arr2[]=new String[4];
        arr2[0]="Ali";
        arr2[1]="Veli";
        arr2[2]="Ayşe";
        arr2[3]="Fatma";

        arr2[1]="Hasan";

        System.out.println(Arrays.toString(arr2));

        //  2.yontem hem olusturup hemde tum tum indexlere atama
        String arr3[]={"Ali","Veli","Ayşe","Fatma"};

        //  arr arrarylerinde ki veli yerine hasan yazdirirsak
        //  arr3[5]="Hakan"; // java 5.index var mı yok mu bilmiyor syntax acisindan sorun olmadigi icin
                         // CTE hatasi vermez ama run ettigimizde 5.indexi bulamadigi icin RTE verir
        System.out.println(arr3.length);
        System.out.println(arr2[1]);
        System.out.println(arr3[3]);

        //  Tum elemanlari yazdirma
        //  1.yontem loop kullanma
        System.out.println("");
        for (int i=0;i<arr3.length;i++){
            System.out.println(arr3[i]);
        }

        //  2.yontem Arrays classindan yardim alma
        System.out.println(Arrays.toString(arr3));
    }
}