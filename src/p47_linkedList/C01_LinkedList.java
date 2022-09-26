package p47_linkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class C01_LinkedList {


    public static void main(String[] args) {
        LinkedList<String> ll1 = new LinkedList<>(Arrays.asList("ahmet", "mehmet", "sureyya", "yagmur", "ayse"));
        System.out.print(ll1);
        ll1.add("merve");
        //add yapilan node LİnkedListin en sonuna ekler
        System.out.println("");
        System.out.print(ll1);
        ll1.add(2,"faruk eczanesi");//2.indexe node eklenir
        System.out.println("");
        System.out.println(ll1);

        LinkedList<String> ll2 = new LinkedList<>(Arrays.asList("hayriye", "nuriye", "cevriye"));

        System.out.println("");
        ll1.addAll(ll2);
        //ll1in sonuna ll2nin nodelarini ekler
        System.out.println(ll1);
        System.out.println("");
        ll1.addFirst("gamze"); //ilk indexe node ekler

        System.out.println(ll1);

        System.out.println("");

        ll1.addLast("hassan");//son indexe node ekler
        System.out.println(ll1);

        System.out.println("");
        ll1.addAll(1,ll2);//3.indexe collection obje ll2yi ekler
        System.out.println(ll1);

        System.out.println("");
        ll1.remove();//ilk node siler ve nodu return eder
        System.out.println(ll1);

        System.out.println("");
        ll1.removeFirst();//ilk node daha hizli siler ve nodu return eder
        System.out.println(ll1);

        System.out.println("");
        ll1.remove("faruk eczanesi");//faruk eczanesini nodunu siler ve return true
        System.out.println(ll1);

        System.out.println("");
        ll1.remove(2);//2.indexte ki nodu siler ve silinen nodu return eder
        System.out.println(ll1);

        System.out.println("");
        ll1.removeFirstOccurrence("nuriye");//ilk gorulen nodu silinir
        System.out.println(ll1);

        ll1.add(0,"mehmet");
        System.out.println("");
        ll1.removeLastOccurrence("mehmet"); //son gorulen nodu siler
        System.out.println(ll1);


        LinkedList<Integer> ll3 = new LinkedList<>(Arrays.asList(2,32,4,123,41,867,1));
        ll3.remove(2);//2 nodu degil 2.indexi 3.nodu siler
        System.out.println(ll3);

        //ll3.remove(867);//indexOutOfBounds hatasi verir
        //System.out.println(ll3);

        ll3.remove(ll3.indexOf(867));
        System.out.println(ll3);

        ll2.add("faruk");
        System.out.println("LL1in ilk hali "+ll1);
        ll1.removeAll(ll2);//ll1den ll2 obje siler
        System.out.println("Ll1in son hali"+ll1);

        System.out.println("");
        ll2.add("oguz");
        System.out.println(ll2);

        System.out.println("");
        System.out.println(ll2.get(2));//get(i) indexte ki elamani return eder


        System.out.println(ll1.element());// element methodu listin sadece ilk nodunu verir.


    }
}
