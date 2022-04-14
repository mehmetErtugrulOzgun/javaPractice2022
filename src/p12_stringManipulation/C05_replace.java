package p12_stringManipulation;

public class C05_replace {
    public static void main(String[] args) {

        String str="Bugun ne cok sey ogrendik";

        // bu cumledeki bosluk disindaki karakter sayisini bulunuz

        System.out.println(str.replace(" ","a"));

        System.out.println("space haric karakter sayisi : " + str.replace(" " , "xD"));

        // atama yapilmadigi surece orjinal String kalici olarak degismez
        // sadece o satir icin degisiklik ypilip sonuc yazdirilmis olur

        System.out.println("orjinal str karakter sayisi : " + str.length());

        // str da kalici degisiklik yapalim
        // bugun erine yarin
        // ogrendik yerine ogrenecegiz
        str=str.replace("bugun" , "yarin");
        str=str.replace("ogrendik" , "ogrenecegiz");
        System.out.println("kalici degistikten sonra : " + str);

    }
}
