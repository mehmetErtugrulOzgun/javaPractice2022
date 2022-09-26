package p50_maps;

import java.util.Hashtable;

public class C03_HashTable {
    public static void main(String[] args) {
        /*
        1-
        HashMap ve TreeMap synchronized ve thread-safe degildir.
        Mapler arasindan synchronized ve thread-safe olan bir mape ihtiyac vardir .
        Bu yüzden HashTable olusturulmustur

        2-
        Hashtable ne key icin ne de value icin null kullanmaz

        3-
        HashTable elemanlari rastgele siralar
         */

        Hashtable <Integer,String> ht=new Hashtable<>();

        ht.put(101,"feridun");
        ht.put(102,"ahmet");
        ht.put(103,"ayse");
        ht.put(104,"zeynep");
        ht.put(105,"fatma");
        ht.put(106,"ayca");
        System.out.println(ht);

        //ht.put(null,"null");  //NullPointerException hatasi firlatir
        //ht.put(101,null);   //NullPointerExceptio hatasini firlatir
        System.out.println(ht);
        System.out.println(ht.size());// 6


    }
}
