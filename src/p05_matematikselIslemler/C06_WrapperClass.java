package p05_matematikselIslemler;

public class C06_WrapperClass {
    public static void main(String[] args) {

        String str1="12345";
        String str2="23456";

        //verilen iki stringdeki sayilari toplayiniz

        System.out.println(str1+str2); //12345623456

        System.out.println(Integer.valueOf(str1) + Integer.valueOf(str2));

        //Integir.valueof(str1) methodu sadece sayisal deger iceren Stringlerde kullanilanilabilir
        //bir tane bile sayi disinda karakter olursa java hata verir
    }
}
