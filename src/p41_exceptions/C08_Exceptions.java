package p41_exceptions;

public class C08_Exceptions {
    public static void main(String[] args) {
        int sayi=12;
        String str="1412";

        //String str1=sayi; //CTE checked exception ClassCast

        int okulNo=Integer.parseInt(str);
        System.out.println("okul no: "+okulNo);
        System.out.println(str+35);//141235 concat olur

        System.out.println(okulNo+34);//1446

        String str1="14a2";
        //int strSayisi=Integer.parseInt(str1);// NumberFormatException unchecked
        //System.out.println(str1.substring(4,42));// StringIndexOutOfBoundsException

        Object sayi3=312;//object data type hz adem javanin tum classlarinin parenti
        //String strSayi2=(String)sayi3;//data type class casting buyuk veri kucuk contaniera atandi
        //ClassCastException data turlerini casting yaparken uygun olmayan islem
    }
}
