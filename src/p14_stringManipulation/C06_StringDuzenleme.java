package p14_stringManipulation;

public class C06_StringDuzenleme {
    public static void main(String[] args) {

        // String methodlarini kullanarak “ Java ogrenmek123 Cok guzel@ ” i “Java
        //ogrenmek cok guzel.” sekline getirin.

        String birsey=" Java ogrenmek123 Cok guzel@ ";

        birsey=birsey.trim();
        System.out.println(birsey);
        // Stringin basinda ki ve sonunda ki bosluklari sildik

        birsey=birsey.replaceAll("\\d","");
        System.out.println(birsey);
        // Stringte ki rakamlari sildik

        birsey=birsey.replace("@","");
        System.out.println(birsey);
        // Stringte ki @ işaretini sildik

        birsey=birsey.toLowerCase();
        System.out.println(birsey);
        //Stringte ki tum harfleri kucuk yaptik

        System.out.println(birsey.substring(0,1).toUpperCase()+birsey.substring(1));
        //Stringte ki ilk harfi buyuk digerilerini kucuk yaptik
    }
}
