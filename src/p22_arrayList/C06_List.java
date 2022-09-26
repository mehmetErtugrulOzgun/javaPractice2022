package p22_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_List {
    public static void main(String[] args) {
        //  100den buyuk ilk 20 fibonacci sayisini list seklinde yazdirin

        List <Integer> fibonacci = new ArrayList<>();
        List <Integer> fibonacciSinir = new ArrayList<>();

        fibonacci.add(0);
        fibonacci.add(1);

        int sayi=0;
        int sayac=0;
        int index=0;
        do {
            sayi=fibonacci.get(index)+fibonacci.get(index+1);
            fibonacci.add(sayi);
            if (sayi>100){
                fibonacciSinir.add(sayi);
                sayac++;
            }
            index++;
        }
        while (sayac<20);
        System.out.println(fibonacciSinir);
    }
}