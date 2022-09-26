package p23_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_FELoop {
    public static void main(String[] args) {

        List<String> list2 = new ArrayList<>();
        list2.add("Ali");
        list2.add("Kemal");
        list2.add("Hatice");
        list2.add("Fatma");
        list2.add("Omer");
        list2.add("Yusuf");
        //  Bu listede ki isimlerden uzunlugu 4 harften fazla olan isimleri yazdiralim
        //  for-each loop index veya size a baKmadan tek tek tum elementleri bize getirir
        for (String each : list2) {
            if (each.length() > 4) {
                System.out.print(each +" ");
            }
        }
    }
}
