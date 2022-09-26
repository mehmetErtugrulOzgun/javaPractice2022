package p17_forLoop;

import java.util.Scanner;

public class C10_ForLoop {
    public static void main(String[] args) {
        // Kullanicidan bir String isteyin ve Stringi tersten yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir string ifade giriniz");
        String string=scan.nextLine();

        for (int i=0; i<string.length();i++){
            System.out.print(string.substring(string.length()-1-i,string.length()-1+1-i));
        }
    }
}