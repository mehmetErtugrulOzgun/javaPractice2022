package p14_stringManipulation;

import java.util.Locale;
import java.util.Scanner;

public class C05_SifreKontrol {
    public static void main(String[] args) {

       /* //Soru 6) Kullanicidan bir sifre girmesini isteyin.
        // Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        // sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin

        // - Ilk harf buyuk harf olmali
        // - Son harf kucuk harf olmali
        // - Sifre bosluk icermemeli
        // - Sifre uzunlugu en az 8 karakter olmali
*/
        Scanner scanner=new Scanner(System.in);
        System.out.println("Gireceginiz sifreniz su sartlari saglamasi gerekmektedir;\n1-Ilk harf buyuk olmali" +
        "\n2-Son harf kucuk olmali \n3-Sifre bosluk icermemeli \n4-Sifre uzunlugu en az 8 karakter olmali");
        System.out.println("Sifrenizi belirleyiniz");
        String sifre=scanner.nextLine();


        if (sifre.length()>=8){
            System.out.println("Sifreniz 8 karakterden fazladir sonraki adim");

            if (sifre.contains(" ")){
                System.out.println("Sifrenizde bosluk vardir kabul edilmemistir");
            }

            else {
                System.out.println("Sifrenizde bosluk yoktur sonraki adim");

                if (sifre.charAt(0)>='A' && sifre.charAt(0)<='Z'){
                    System.out.println("Sifrenizin ilk harfi buyuktur sonraki adim");

                    int sonHarfKontrol=sifre.length()-1;

                    if (sifre.charAt(sonHarfKontrol)>='a'&& sifre.charAt(sonHarfKontrol)<='z'){
                        System.out.println("Sifreniz kabul edilmistir");
                        System.out.println("Girdiginiz sifre : " +sifre);
                    }

                    else {
                        System.out.println("Sifrenizin son harfi kucuk degildir");
                    }

                }
                else {
                    System.out.println("Sifreniz buyuk harf ile baslamiyor reddedildi");
                }
            }
        }
        else {
            System.out.println("Girdiniz sifre 8 karakterden azdir");
        }
    }
}
