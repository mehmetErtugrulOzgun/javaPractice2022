package p22_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_List {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();
        //  add() listenin sonuna ekleme yapar
        isimler.add("Ali");
        System.out.println(isimler);
        isimler.add("Ayse");
        isimler.add("Fatma");
        isimler.add("Veli");
        isimler.add("Ali");
        System.out.println(isimler);

        //  ozel bir indexe eklemek isterseniz, o zaman
        //  indexli add methodunu kullanmaliyiz

        isimler.add(1,"Ahmet");
        System.out.println(isimler);
        isimler.add(0,"Mehmet");
        System.out.println(isimler);
        System.out.println(isimler.size());

        List<String> yeniList=new ArrayList<>();
        yeniList.add("Firat");
        yeniList.add("Tugrul");
        System.out.println(yeniList);
        System.out.println(yeniList.size());
        //  yeniListin sonuna isimler listesini eklemek istersek
        yeniList.addAll(isimler);
        System.out.println(yeniList);
        System.out.println(yeniList.size());

        //  birde int elementlerinin oldugu liste olusturalim
        List<Integer> sayilar=new ArrayList<>();
        //  int primitive,Integer wrapper class non-primitive
        sayilar.add(4);
        //  yeni liste sayilar liste ekleyebilir miyim ?
        //  farkli bir data turundan liste veya element ekleyemeyiz

        //  yenilist.addAll(sayilar);
        //  yeniLİst.add(5);


    }
}
