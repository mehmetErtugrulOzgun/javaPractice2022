package p48_set;

import java.util.*;

public class C02_HashSet {
    /*
    Icinde degerleri olan bir arrayi arrayliste cevirecek return tipi arraylist olacak bir method yaziniz
    {"reha","hakan","haluk","ipek","ahsen"}
    main method altinda metod ile gelen listeyi kullanarak HashSet, TreeSet ve linkedhashsetleri doldurun
     */

    public static void main(String[] args) {
        String arr1[] = {"reha", "hakan", "haluk", "ipek", "ahsen"};

        ArrayList<String> list = new ArrayList<>();

        list = cevir(arr1);
        System.out.println(list);

        HashSet<String> hs1 = new HashSet<>();
        hs1.addAll(list);

        LinkedList<String> ll1 = new LinkedList<>();
        ll1.addAll(list);

        TreeSet<String> ts1 = new TreeSet<>();
        ts1.addAll(list);

        System.out.println("");
        System.out.println("HashSet " + hs1);
        System.out.println("");
        System.out.println("LinkedHashSet " + ll1);
        System.out.println("");
        System.out.println("TreeSet " + ts1);
    }

    public static ArrayList<String> cevir(String arr1[]) {
        ArrayList<String> arrList = new ArrayList<>();
        for (String each : arr1) {
            arrList.add(each);
        }
        return arrList;
    }
}
