package p50_maps;

import java.util.HashMap;
import java.util.Scanner;

public class C06_Ex02 {
    /*
    Count the words in a String one boy one
    Bir Strinde ki kelimeleri tek tek sayin ve konsolda yazdiran method creat ediniz
    String str="ali came to school and ayse came to school";

    ali=1
    came=2
    to=2
    school=2
    and=1
    ayse=1
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir metin giriniz :");
        String str = scan.nextLine();

        kelimeSay(str);


    }

    private static void kelimeSay(String str) {
        HashMap<String, Integer> map = new HashMap<>();
        String kelimeler[] = str.split(" ");

        for (int i = 0; i < kelimeler.length; i++) {
            if (map.containsKey(kelimeler[i])) {
                map.put(kelimeler[i], map.get(kelimeler[i]) + 1);
            } else {
                map.put(kelimeler[i], 1);
            }
        }
        System.out.println(map);
    }
}
