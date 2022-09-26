package k2_arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class C01_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> arabaMarkalari= new ArrayList<String>();
        arabaMarkalari.add("Ford");
        arabaMarkalari.add("Audi");
        arabaMarkalari.add("Fiat");
        arabaMarkalari.add("Volvo");
        arabaMarkalari.add("BMW");
        arabaMarkalari.add("Mercedes");
        System.out.println("Dizinin set edilmedikten onceki tum elemanlari : "+arabaMarkalari);
        System.out.println("Dizinin 4.indexi : "+arabaMarkalari.get(4));
        System.out.println("Set edilmeden onceki hali: "+arabaMarkalari.get(2));
        arabaMarkalari.set(2,"Toyota");
        System.out.println("Set edildikten sonraki hali: "+arabaMarkalari.get(2));
        System.out.println("Dizinin set edildikten sonraki tum elemanlari : " +arabaMarkalari);
        arabaMarkalari.remove(4);
        System.out.println("Dizinin bir elemani silindikten sonraki hali : "+arabaMarkalari);
        System.out.println("Dizinin eleman sayisi : "+arabaMarkalari.size());

        System.out.println("------------------");


        for (int i=0; i<arabaMarkalari.size();i++){
            System.out.println(arabaMarkalari.get(i));
        }
        System.out.println("------------------");
        // farkli bir sekilde asagidaki yontemle de bastirabiliriz ekrana
        for (String nesne: arabaMarkalari){
            System.out.println(nesne);
        }
        Collections.sort(arabaMarkalari);
        System.out.println("Araba markalarini kucukten buyuge yani" +
                "a->z'ye seklinde siralanmasi : "+arabaMarkalari);


        arabaMarkalari.clear();
        System.out.println("Dizinin tum elemani kaldirilirsa clear komutu ile karsimiza cikan ekran :"+arabaMarkalari);

        ArrayList<Integer> sayilar= new ArrayList<Integer>();
        sayilar.add(31);
        sayilar.add(-2);
        sayilar.add(45);
        System.out.println("Sayilari siralamadan once : "+sayilar);
        Collections.sort(sayilar);
        System.out.println("Sayilari kucukten buyuge siraladiktan sonra : "+sayilar);

    }
}
