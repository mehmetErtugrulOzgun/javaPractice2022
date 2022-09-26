package p50_maps;

import java.util.TreeMap;

public class C04_TreeMap {
    public static void main(String[] args) {
        /*
        1-  TreeMap elemanlari natural ordera gore siralar
        2-  TreeMap maplerin en yavasidir
        3-  TreeMaplerde keyler icin "null" kullanilmaz
        4-  TreeMaplerde valuelar icin "null" istendigi kadar kullanilabilir
        5-  TreeMapler synchronized ve thread-safe degildirler
         */

        TreeMap<Integer,String> tm=new TreeMap<>();
        tm.put(101,"mehmet");
        tm.put(102,"asli");
        tm.put(103,"feyza");
        tm.put(104,"ceren");
        tm.put(105,"betul");
        System.out.println(tm);//{101=mehmet, 102=asli, 103=feyza, 104=ceren, 105=betul}

       // tm.put(null,"topla");     //NullPointerException firlatir
        System.out.println(tm);
        tm.put(106,null);
        System.out.println(tm);//   {101=mehmet, 102=asli, 103=feyza, 104=ceren, 105=betul, 106=null}

        System.out.println(tm.ceilingKey(101));//methodu istenilen key degerini varsa degerini
        System.out.println(tm.ceilingKey(11231));// method istenilen key degeri mapde olmadigindan kendisinden buyuk en kucuk key olmadigi icin null return eder
        System.out.println(tm.ceilingEntry(102));// 102=asli

        System.out.println(tm.floorKey(11231));// method istenilen key degerini ve kendisinden buyuk en kucuk key olmadigi icin null return eder

        System.out.println(tm.descendingKeySet());// keyleri azalan siralaama return eder   [106, 105, 104, 103, 102, 101]

        System.out.println(tm.keySet());// [101, 102, 103, 104, 105, 106] keyleri artan siralama ile return eder

        System.out.println(tm.headMap(105));      // {101=mehmet, 102=asli, 103=feyza, 104=ceren}
                                                        // girilen keye kadar once ki entryleri return eder

        System.out.println(tm.headMap(104,true)); //girilen key dahil once ki entryleri return eder
                                                                // {101=mehmet, 102=asli, 103=feyza, 104=ceren}

        System.out.println(tm.tailMap(101));//  {101=mehmet, 102=asli, 103=feyza, 104=ceren, 105=betul, 106=null}
                                                    //  girilen key dahil oncekileri entryleri return eder

        System.out.println(tm.tailMap(101,false)); // {102=asli, 103=feyza, 104=ceren, 105=betul, 106=null}
                                                                  //  girilen key dahil olmadan oncekileri entryleri return eder

    }
}
