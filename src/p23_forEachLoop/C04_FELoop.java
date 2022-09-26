package p23_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C04_FELoop {
    public static void main(String[] args) {
        /*
        Soru 3:
        iki String array olusturunuz ve bu array’lerdeki ortak elemanlari For-each loop
        kullanarak bulunuz. Sonucu ekrana yazdiriniz.
        Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz
         */
        String arr1[]={"Ali","Veli","Ahmet","Mehmet","Sureyya","Zeynep","Elif","Beyrek"};
        String arr2[]={"Zuhre","Arif","Fatma","Ayse","Hasan","Beyrek","Seyrek"};
        List <String> ortakIsimler = new ArrayList<>();

        for (String each1 : arr1){
            for (String each2 : arr2){
                if (each1.equalsIgnoreCase(each2)){
                    ortakIsimler.add(each1);
                }
            }
        }
        if (ortakIsimler.isEmpty()){
            System.out.println("Ortak eleman yok");
        }
        else {
            System.out.println(ortakIsimler);
        }
    }
}
