package p22_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C09_List {
    public static void main(String[] args) {
        /* Kullanicidan isimler isteyin ve bunlari bir listte depolayin.
        Kullanici "yeter" yazana kadar isim istemeye devam edin.
        Kullanici isim girmeyi bitirdiginde toplamda kac isim girdigini ve
        bunlardan kac tanesinin asagida ki listede olan isimlerden oldugunu
        yazdirin.
        isimList=[Ali, Veli, Ayse, Fatma, Zeki, Kemal]
        Not= yeter icin kucuk buyuk harf onemli degil ancak isimler icin onemli
         */
        int count=0;
        int sayac=0;
        List <String> girilenIsimler=new ArrayList<>();

        List <String> isimList=new ArrayList<>();
        isimList.add("Ali");
        isimList.add("Veli");
        isimList.add("Ayse");
        isimList.add("Fatma");
        isimList.add("Zeki");
        isimList.add("Kemal");
        Scanner scan=new Scanner(System.in);
        String isim="";

        do {
            System.out.println("Isim giriniz "+"\nBitirmek istediginiz zaman \"yeter\" yaziniz ");
            isim=scan.nextLine();
            if (!isim.equalsIgnoreCase("yeter")){
                girilenIsimler.add(isim);
                count++;
            }
        }
        while (!isim.equalsIgnoreCase("yeter"));

        System.out.println("Girmis oldugunuz isimler : "+girilenIsimler);
        System.out.println("Su kadar isim girdiniz "+count);

        for (int i=0; i< girilenIsimler.size();i++){
            if (isimList.contains(girilenIsimler.get(i))){
                sayac++;
            }
        }
        System.out.println("Girmis oldugunuz listede ki isimler ile " +
                "bende ki listede kayitli olan ortak isim sayisi = "+sayac);

    }
}
