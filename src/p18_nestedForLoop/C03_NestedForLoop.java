package p18_nestedForLoop;

import java.util.Scanner;

public class C03_NestedForLoop {

    public static void main(String[] args) {
        // Soru 12 ) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin
        //      *
        //      * *
        //      * * *
        //      * * * *
        Scanner scan=new Scanner(System.in);
        System.out.println("Pozitif tam sayi giriniz");
        int sayi=scan.nextInt();

        for (int satirNo=1;satirNo<=sayi;satirNo++){
            for (int sutunNo=1;sutunNo<=satirNo;sutunNo++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}