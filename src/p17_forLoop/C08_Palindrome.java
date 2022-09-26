package p17_forLoop;

import java.util.Scanner;

public class C08_Palindrome {
    public static void main(String[] args) {
        // Kullanicidan bir String isteyin.
        // Kullanicinin girdigi String’in palindrome
        // olup olmadigini kontrol eden bir method yazin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Polindrom mu degil mi");
        String input= scan.nextLine();
        palindromeKontrolEt(input);

    }

    private static void palindromeKontrolEt(String input) {
        String terstenInput="";
        for (int i=0;i<input.length();i++){
            terstenInput+=input.substring(input.length()-1-i,input.length()-1+1-i);
        }
        System.out.println("Girdiginiz kelimenin tersi : "+terstenInput);

        if (input.equalsIgnoreCase(terstenInput)){
            System.out.println("Girdiginiz kelime polindromdur");
        }
        else {
            System.out.println("Girdiginiz kelime polindrom degildir");
        }
    }
}