package p41_exceptions;

public class C06_Exceptions {
    public static void main(String[] args) {
        String str1=" ";//space
        String str2="";//hiclik
        String str3=null;//str3 variablenin hic bir degere esit olmadigini belirten pointer
        //null bir deger degildir ama konsola yazdirilabilir.

        System.out.println(str1.length());//1
        System.out.println(str2.length());//0
        //System.out.println(str3.length());//NullPointerException unchecked
        System.out.println(str3+" bulent ersoy");// null bulent ersoy
        //System.out.println(str3.concat(" bulent ersoy"));---->null olarak atanmis
        // bir obj uygun olmayan bir islem yapilirsa java bize su hatayi verir
        //NullPointerException unchecked verir


    }
}
