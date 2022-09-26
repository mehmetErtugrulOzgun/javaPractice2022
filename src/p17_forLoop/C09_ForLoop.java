package p17_forLoop;

import java.util.Scanner;

public class C09_ForLoop {
    public static void main(String[] args) {
        //   Kullanicidan 100den kucuk bir tamsayi isteyin 1den baslayarak
        //   girilen sayiya kadar 3un veya 5in kati olan sayilari yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("100den kucuk pozitif bir tam sayi giriniz");
        int sayi=scan.nextInt();

        for (int i=1; i<=sayi; i++){
            if (i%3==0 || i%5==0){
                System.out.print(i+" ");
            }
        }
    }
}
