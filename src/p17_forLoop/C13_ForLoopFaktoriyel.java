package p17_forLoop;

import java.util.Scanner;

public class C13_ForLoopFaktoriyel {
    public static void main(String[] args) {
        //  Kullanicidan 50’den kucuk bir sayi isteyin ve girilen
        //  sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)
        Scanner scan=new Scanner(System.in);
        System.out.println("50den kucuk bir pozitif tam sayi giriniz");
        int sayi=scan.nextInt();
        int faktoriyel=1;

        for (int i=1;i<=sayi;i++){
            faktoriyel*=i;
        }
        System.out.println("Girdiginiz faktoriyel : "+faktoriyel);
    }
}
