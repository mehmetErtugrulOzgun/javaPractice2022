package p05_matematikselIslemler;

public class C05_WrapperClass {
    public static void main(String[] args) {

        short sayi1=15;

        Short sayi2=31;

        sayi1=sayi2; //wrapper class ile ayni isimdeki primitive data turu arasinda gecis olabilir

        System.out.println(sayi1); //15

        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.BYTES); // 2byte=16bit





    }
}
