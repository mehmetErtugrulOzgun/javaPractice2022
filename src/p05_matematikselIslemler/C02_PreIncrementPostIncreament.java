package p05_matematikselIslemler;

public class C02_PreIncrementPostIncreament {
    public static void main(String[] args) {

        int sayi1=10;
        int sayi2=20;
        int sayi3=30;

        sayi2=sayi1++;

        System.out.println(sayi1 + "," + sayi2+ "," + sayi3);

        sayi3=++sayi1;

        System.out.println(sayi1 + "," + sayi2+ "," + sayi3);

        System.out.println(sayi3++); //once yazdiracak sonra arttiracak
                                     //once 12 yazdiracak sonra sayi3=13 olacak ama bunu yazdiramayacak
                                     //is isten gecmis olacak

        System.out.println(--sayi2); //once azalt sonra yazdir
                                     //once sayi2=9 sonra sayi2nin son degeri yani 9 yazdirir

    }
}
