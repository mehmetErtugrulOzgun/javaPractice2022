package p22_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_List {
    public static void main(String[] args) {
        //  100den buyuk ilk 20 fibonacci
        //  sayisini list seklinde yazdirin

        int sayi1=0;
        int sayi2=1;
        int sayi3=sayi1+sayi2;
        //  i-1 =   i-2     + i-3
        //  sayi2   sayi1   sayi1
        //   i  =   (i-1)   +   (i-2)
        //  sayi3   sayi2       sayi1
        //  i+1 =   i   +   (i-1)
        // sayi3=  sayi3     sayi2
        List <Integer> fibonacci = new ArrayList<>();

        int sayac=0;

        while (sayac<10){
            sayi1=sayi2;
            sayi2=sayi3;
            sayi3=sayi2+sayi1;
            if (sayi3>100){
                fibonacci.add(sayi3);
                sayac++;
            }
        }
        System.out.println(fibonacci);
    }
}
