package p22_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_List {
    public static void main(String[] args) {

        // 200e kadar olan fibonacci sayilarini bir list olarak
        // yazdirin

        List <Integer> fibonacci = new ArrayList<>();

        fibonacci.add(0);
        fibonacci.add(1);
        fibonacci.add(1);
        System.out.println(fibonacci);

        int sayi=0;
        int index=1;

        //  While ile
        while (sayi<200){
            sayi= fibonacci.get(index)+ fibonacci.get(index+1);
            fibonacci.add(sayi);
            index++;
        }
        System.out.println(fibonacci);

        //  For ile
        for (index=1;sayi<200;index++){
            sayi=fibonacci.get(index)+fibonacci.get(index+1);
            fibonacci.add(sayi);
        }
        System.out.println("For loop ile " +fibonacci);
    }
}
