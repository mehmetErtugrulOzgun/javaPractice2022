package p22_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C08_List {
    public static void main(String[] args) {
        //  1) Elemanlari A, C, E, ve F olan bir String ArrayList olusturup ekrana yazdiriniz.
        List <String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("C");
        arrayList.add("E");
        arrayList.add("F");
        System.out.println(arrayList);

        //  2) indexsiz add() methodunu kullanarak, B’yi ekleyiniz.
        //  index’li add() methodunu kullanarak, L’yi 1 numarali index’e ekleyiniz.
        //  ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, E, F, B.
        arrayList.add("B");
        arrayList.add(1,"L");
        System.out.println(arrayList);

        //  3) set() methodu kullanarak, E’yi D yapiniz. 3.index
        //  ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, D, F, B.
        arrayList.set(3,"D");
        System.out.println(arrayList);

        //  4) remove() methodu kullanarak, F’yi siliniz.
        //  ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, D, B.
        arrayList.remove("F");
        System.out.println(arrayList);

        //  5) sort() methodu kullanarak, elemanlari alfabetik siraya diziniz.
        //  ArrayList’i ekrana yazdiriniz, list goyle olmali; A, B, C, D, L.
        Collections.sort(arrayList);
        System.out.println(arrayList);

        //  6) contains() methodu kullanarak, L’nin list’de var oldugunu ve M’nin list’de var
        //  olmadigini dogrulayiniz.
        System.out.println(arrayList.contains("L"));

        //  7) size() methodu kullanarak, list’in kag eleman oldugunu ekrana yazdiriniz.
        System.out.println(arrayList.size());

        //  8) clear() methodu kullanarak, list’deki tum elemanlari siliniz.
        arrayList.clear();

        //  9) isEmpty() methodu kullanarak, list’deki tum elemanlarin silindigini dogrulayiniz.
        System.out.println(arrayList.isEmpty());
    }
}
