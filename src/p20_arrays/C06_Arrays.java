package p20_arrays;

import java.util.Arrays;

public class C06_Arrays {
    public static void main(String[] args) {
        String str="Java, candir.";

        //  Split methodu bize bir array dondurur
        //  donen arrayi ya direkt yazdirmaliyiz
        System.out.println(Arrays.toString(str.split(",")));

        //  veya methoddan donen String barindiran bir array
        //  oldugundan bir array olusturup ona assign edebiliriz

        String bolunmusKelimeArray[]=str.split(",");
        System.out.println(bolunmusKelimeArray[1]); //  ()candir

        String bolunmusKelimeArray1[]=str.split("a");
        System.out.println(Arrays.toString(bolunmusKelimeArray1));
        System.out.println(bolunmusKelimeArray.length);
        System.out.println(bolunmusKelimeArray1.length);

        String bolunmusKelimeArray2[]=str.split("");
        System.out.println(Arrays.toString(bolunmusKelimeArray2));
        //  Stringi karakter karakter ayirir

        String cumle="Java ogren, rahat yasa";
        //  cumle kac kelimeden olusur
        String kelimeArray[]=cumle.split(" ");
        System.out.println("Cumlede ki kelime sayisi : "+kelimeArray.length);

        //  Harf sayisi bulma
        String cumle2=cumle.replaceAll("\\W","");
        System.out.println(cumle2.length());

        String harfArrayi[]=cumle2.split("");
        System.out.println(harfArrayi.length);


    }
}
