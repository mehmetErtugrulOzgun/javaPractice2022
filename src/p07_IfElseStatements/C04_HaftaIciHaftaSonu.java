package p07_IfElseStatements;

import java.util.Scanner;

public class C04_HaftaIciHaftaSonu {
    public static void main(String[] args) {

        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        //  Ornek:  gun=Pazar output = “Hafta sonu”
        // gun=Sali output = “Hafta ici”
        // *** String icin equals method’unu kullanin

        Scanner gunIsteme = new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String gunIsmi= gunIsteme.next().toLowerCase();
        //Kullanici nasil yazarsa yazsin biz kucuk harfe ceviriyoruz

        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi"))
        {
            System.out.println("Girdiginiz gun hafta sonu");
        }
        if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") || gunIsmi.equals("carsamba") ||
                gunIsmi.equals("persembe") || gunIsmi.equals("cuma"))
        {
            System.out.println("Girdiginiz gun hafta icidir");
        }
        else
        {
            System.out.println("Gecerli bir gun girmediniz");
        }
    }
}
