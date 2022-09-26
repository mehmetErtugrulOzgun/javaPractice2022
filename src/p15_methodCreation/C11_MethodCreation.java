package p15_methodCreation;

import java.util.Scanner;

public class C11_MethodCreation {
    //  Kullaniciya kac sayi toplamak istedigini sorun. Kullanici 2,3 veya 4
    //  degerini girerse, kullanicidan bu sayilari girmesini isteyin ve sayilarin toplamini
    //  yazdirin. Kullanici toplamak istedigi sayi adedini 4’den buyuk girerse “Cok sayi
    //  girdiniz, ben toplayamam” yazdirin.
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Kac adet sayiyi toplamak istersiniz ?");
        int istenilenToplam=scan.nextInt();
        toplamaMethodu(istenilenToplam);

    }

    private static void toplamaMethodu(int istenilenToplam) {
        if (istenilenToplam==2 || istenilenToplam==3 || istenilenToplam==4){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Toplamak istediginiz sayilari sirayla giriniz");

            if (istenilenToplam==2){
                System.out.println("Girmek istediginiz iki sayidan ilkini yaziniz");
                int birinciSayi=scanner.nextInt();
                System.out.println("Girmek istediginiz iki sayidan ikincisini yazin");
                int ikinciSayi=scanner.nextInt();
                System.out.println("Girdiginiz sayilarin toplami = " +(birinciSayi+ikinciSayi));
            }
            else if (istenilenToplam==3){
                System.out.println("Girmek istediginiz uc sayiyinin ilkini yaziniz");
                int birinciSayi=scanner.nextInt();
                System.out.println("Girmek istediginiz uc sayiyinin ikincisini yaziniz");
                int ikinciSayi=scanner.nextInt();
                System.out.println("Girmek istediginiz uc sayiyinin ucuncusunu yaziniz");
                int ucuncuSayi=scanner.nextInt();
                System.out.println("Girdiginiz sayilarin toplami = "+(birinciSayi+ikinciSayi+ucuncuSayi));
            }
            else {
                System.out.println("Girmek istediginiz dort sayiyinin ilkini yaziniz");
                int birinciSayi=scanner.nextInt();
                System.out.println("Girmek istediginiz dort sayiyinin ikincisini yaziniz");
                int ikinciSayi=scanner.nextInt();
                System.out.println("Girmek istediginiz dort sayiyinin ucuncusunu yaziniz");
                int ucuncuSayi=scanner.nextInt();
                System.out.println("Girmek istediginiz dort sayinin dorduncusunu yaziniz");
                int donduncuSayi=scanner.nextInt();
                System.out.println("Girdiginiz sayilarin toplami = "+(birinciSayi+ikinciSayi+ucuncuSayi+donduncuSayi));
            }
        }
        if (istenilenToplam>=5){
            System.out.println("Cok sayi girdiniz ben toplayamam");
        }
        else if (istenilenToplam<=1){
            System.out.println("Gecersiz bir sayi girdiniz ben toplamam");
        }
    }
}
