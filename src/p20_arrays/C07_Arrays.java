package p20_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C07_Arrays {
    public static void main(String[] args) {
        //  Verilen Stringi array ile tersine ceviriniz

        Scanner scan=new Scanner(System.in);
        System.out.println("Tersini gormek " +
                "istediginiz String ifadeyi giriniz");
        String str=scan.nextLine();

        String strHane[]=str.split("");
        String temp[]=new String[strHane.length];

        for (int i=0;i< strHane.length;i++){
            temp[i]=strHane[strHane.length-1-i];
        }
        System.out.println(Arrays.toString(temp));
    }
}
