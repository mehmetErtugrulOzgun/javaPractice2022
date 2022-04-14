package p13_stringManipulation;

public class C01_substring {
    public static void main(String[] args) {

        String str="Java ile IT cok guzel";

        System.out.println(str.substring(5)); // ile IT cok guzel
        // yukardaki Stringi Mehmet hoca ile IT cok guzel

        System.out.println(str.replace("Java","Mehmet Hoca"));
        System.out.println("Mehmet Hoca" + str.substring(4));

        System.out.println(str.substring(9));  // yazilan index inclusive

        // eger bir indexden sona kadar olan parcayi degil
        // belirli bir parcayi almak istersek
        // 2 parametere yazmak gerekir str.substring(baslangicIndexi, bitisIndexi)
        // baslangic indexi ==> inclusive/dahil
        // bitis indexi ==> eclusive/haric

        System.out.println(str.substring(0,5)); // Java
        System.out.println(str.substring(0,1)); // J
        String harf=str.substring(5,6); // bana 6. harfi String olarak bulun
        System.out.println(harf);

        str="Java gun gectikce guzellesiyor";

        System.out.println(str.substring(8,8)); // 7.index dahil , 7.index haric gosterir
        // en son hangisi dediyse ona devam eder hiclik dondurur

        //System.out.println(str.substring(5,2)); bitis indexi baslangic indexinden kucuk olamaz
        System.out.println(str.substring(str.length()-1)); // son harfi verir
        System.out.println(str.substring(str.length()-5)); // son 5 harfi yazdiralim
        System.out.println(str.substring(str.length())); // son harfen sonra ki kismi yani hicligi verir
    }
}
