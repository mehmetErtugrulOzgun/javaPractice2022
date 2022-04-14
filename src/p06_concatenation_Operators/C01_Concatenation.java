package p06_concatenation_Operators;

public class C01_Concatenation {
    public static void main(String[] args) {

        String str1="Java";
        String str2="Guzel";
        int sayi1=5;
        int sayi2=3;

        //variablelarin degelerlerini degistirmeden
        //asagidaki ifadeleri bu variablelari kullanarak yazdirin

        //Java5Guzel

        System.out.println(str1 + sayi1 + str2);

        //2Guzel15

        System.out.println((sayi1-sayi2)+str2+sayi1*sayi2);

        //Java22

        //System.out.println(str1+(sayi1-sayi2)+(sayi1-sayi2));
        System.out.println(str1 + (sayi1*2 + sayi2*4));

        //53Guzel

        System.out.println((sayi1*10+sayi2)+str2);

        //Eger tamamen sayilardan olusan bir string varsa ve biz bunu inta cevirmek istersek
        //Integer.valueof(str)
        //bir sayiyi stringe cevirmek istersek
        //""+sayi
    }
}
