package p05_matematikselIslemler;

public class C04_WrapperClass {
    public static void main(String[] args) {

        //primitive data turu ile non primitive data arasindaki farklar

        String str="Java";
        int sayi=10;


        System.out.println(str.toUpperCase()); //JAVA

        System.out.println(str);

        //non primitive data turleri data depolamak yaninda bir cok faydali metoda sahiptir
        //ancak primitive data turlerinin boyle bir ozelligi yoktur primitive
        //data turleri sadece degerleri saklarlar(container)

        //primitive data turleri icinde bazi metodlar gerekli oldugunda java ara bir cozum uretmistir
        //java her bir primitive data turunu , non primitive olarak kullanabilmek icin ozel classlar olusturmustur
        //bunlara wrapper class adini vermistir

        double sayi2=20.5;

        //sayi2 primitive old. sayi2. dedigimizde hic bir metod gelmez

        Double sayi3=15.2;

        //sayi3 wrapper class olan DOuble classini kullandigindan sayi3. dedigimizde bir cok metod gelir

        System.out.println(sayi3);




    }
}
