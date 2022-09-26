package p35_encapsulation;

import java.util.Scanner;

public class C08_BookRunner {
    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);
        System.out.println("Kitabın ismini giriniz : ");
        String kitapIsmi= scan.nextLine();

        System.out.println("Yazarini giriniz : ");
        String yazarIsmi= scan.nextLine();

        C07_Book kitap1=new C07_Book();

        kitap1.setBookName(kitapIsmi);
        kitap1.setAuthorName(yazarIsmi);

        System.out.println("Girdiginiz kitabın ismi : "+kitap1.getBookName());
        System.out.println("Kitabın yazari :" +kitap1.getAuthorName());







    }
}
