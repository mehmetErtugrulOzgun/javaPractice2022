package p48_set;

import java.time.DateTimeException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class C03_HashSet {
    /*
    Elemanlari alfabetik sira ile dizen ve tekrarsiz bir collection
    elde etmek isterseniz ne kullanirsiniz =====> TreeSet

    Ama TreeSet cok yavastir. Nasil bir cozum bulabilirsin ?
    Cevap=HashSet olustururum elemanlari HashSete eklerim sonra
    HashSeti, TreeSete ceviririm boylece tekrarsiz ve alfabetik sirada bir
    collectiona sahio olmus olurum
     */
    public static void main(String[] args) {

        double baslangicZamani1 = System.nanoTime();
        TreeSet<String> ts2 = new TreeSet<>(Arrays.asList("reha", "hakan", "haluk", "ipek", "ahsen"));
        double bitisZamani1 = System.nanoTime();
        System.out.println("TreeSet ile zaman : " + (bitisZamani1 - baslangicZamani1));

        double baslangicZamani = System.nanoTime();

        HashSet<String> hs1 = new HashSet<>(Arrays.asList("reha", "hakan", "haluk", "ipek", "ahsen"));
        System.out.println(hs1);


        TreeSet<String> ts1 = new TreeSet<>(hs1);

        System.out.println(ts1);
        double bitisZamani = System.nanoTime();
        System.out.println("HashSet ile zaman : " + (bitisZamani - baslangicZamani));



    }
}
