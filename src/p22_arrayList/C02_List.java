package p22_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_List {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(4);
        sayilar.add(634);
        System.out.println(sayilar.size()); //  2
        System.out.println(sayilar.isEmpty());  //  false
        System.out.println(sayilar);    //  [4, 634]

        sayilar.add(30);
        sayilar.add(32);
        System.out.println(sayilar);   //  [4, 634, 30, 32]

        //  System.out.println(sayilar.remove(2));
        //  remove methodu iki turlu kullanilabilir
        //  1-silmek istedigimiz elementin indexini yazarsak
        //  o elementi siler ve delil olarak sildigi elementi
        //  bize dondurur

        int silinenEleman=sayilar.remove(2);
        System.out.println(sayilar);

        sayilar.add(silinenEleman);
        System.out.println(sayilar);

        //  Ikinci remove yontemi olarak direkt silmek
        //  istedigimiz degeri yazabiliriz

        //  sayilar.remove(20);
        //  System.out.println(sayilar);
        //  eger listemizde sayilardan olusuyorsa biz
        //  silinmesini istedigimiz elementi yazdigimizda
        //  java index olarak algilar ama String liste icin
        //  boyle bir problem olmaz


        List <String> isimler = new ArrayList<>();

        isimler.add("Ayse");
        isimler.add("Ali");
        isimler.add("Zeki");

        System.out.println(isimler.remove("Zeki"));
        System.out.println(isimler);

        isimler.remove("Ayse");
        System.out.println(isimler);

        boolean sonuc=isimler.remove("Mehmet");
        if (sonuc){
            System.out.println("Mehmeti buldum ve sildim");
        }
        else {
            System.out.println("Mehmeti bulamadim ve dolayisiyla silemedim");
        }
    }
}