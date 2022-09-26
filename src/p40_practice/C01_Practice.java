package p40_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C01_Practice {

    /*
    Bir program yaziniz String ile kullanicidan aliniz. aldiginiz Stringde en cok kullanilan harfi yazdiriniz
    equalsIgnoreCase
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("String bir deger giriniz");
        String str= scan.nextLine().toLowerCase(); //case sensi engellemek icin lowercase

        System.out.println("Girdiginiz String ifade : \n"+str); //kullaniciya ne girdigini gosterdim

        String arr1[]=str.split("");
        //  girilen Stringi hiclige parlayip arraye attik
        //System.out.println(Arrays.toString(arr1)); arraye yazdirip yazdirmadigina baktim

        String enCokTekrarEden=""; //boyle bir degisken olusturup sorunun asil cevabini bunun uzerinden alacagiz

        int sayac=0;// string icerisinde ki karakter dongusun
        int maxSayac=0;

        for (int i=0;i<arr1.length;i++){
            for (int j=i+1;j< arr1.length;j++){ // string icinde ki karakter dongusunu yazdik
                if (arr1[i].equals(arr1[j])){   // onceki karakter ile o an ki karakter ayni oldugu
                    sayac++;                   // takdirde sayaci arttirdik
                }
            }
            //
            if(sayac>maxSayac){   //yukaridaki donguden aldigimiz sayaci 0 dan buyuk olup olmadigini kontrol ettik
                maxSayac=sayac;   //0i bir variable a assign etmemizin sebebi her index dongusunde sayac 0lanacagindan
                enCokTekrarEden=arr1[i];
                // kaynakli o karakterin kac kez tekrar ettigini assign etmek lazim
                // eger once ki karaker ile ayni sayida string icinde donduyse onu else if de ekleyip gosterecegiz
            }
            else if (sayac==maxSayac){
                enCokTekrarEden+=", "+arr1[i];//    ayni sayida tekrar ettiyse onu ekliyoruz stringimize
            }
            sayac=0; // sayaci her indexte 0lamamiz lazim cunku stringin sonuna kadar ilerlemesi gerek
        }
        if (enCokTekrarEden.length()>1){
            System.out.println(enCokTekrarEden+(maxSayac+1));
        }
        //  max sayac+1 dememiz index 0dan basladigi icin 1 eksigini gosteriyor bu sebeple +1 ekliyoruz
        else {
            System.out.println(enCokTekrarEden+(maxSayac+1));
        }

    }

}