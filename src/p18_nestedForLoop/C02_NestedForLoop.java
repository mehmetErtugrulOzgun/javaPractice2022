package p18_nestedForLoop;

import java.util.Scanner;

public class C02_NestedForLoop {
    public static void main(String[] args) {

        // kullanicidan bir rakam alip carpim tablosu olusturalim

        Scanner scan=new Scanner(System.in);
        System.out.println("Pozitif tam sayi giriniz");
        int input=scan.nextInt();

        // 1 2 3     1*1 1*2 1*3
        // 2 4 6     2*1 2*2 2*3
        // 3 6 9     3*1 3*2 3*3

        for (int satirNo=1;satirNo<=input;satirNo++){
            for (int sutunNo=1;sutunNo<=input;sutunNo++){
                System.out.print(satirNo*sutunNo+"\t");
            }
            System.out.println("");
        }
    }
}