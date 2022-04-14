package p07_IfElseStatements;

import java.util.Scanner;

public class C07_HaftaninGunleriIfElseIF {
    public static void main(String[] args) {

        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        //  Ornek:  gun=Pazar output = “Hafta sonu”
        // gun=Sali output = “Hafta ici”
        // *** String icin equals method’unu kullanin
        //eger kullanici gun ismini yanlis girerse yanlis giris yazdirin

        Scanner gunAlma=new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi yaziniz");
        String gunIsmi=gunAlma.next().toLowerCase();

        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi"))
        {
            System.out.println("Girdiginiz gun hafta sonudur.");
        }
        else if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") || gunIsmi.equals("carsamba") ||
                gunIsmi.equals("persembe") || gunIsmi.equals("cuma"))
        {
            System.out.println("Girdiginiz gun hafta icidir.");
        }
        else
        {
            System.out.println("Gecersiz bir gun girdiniz");
        }
        /*
        eger if else if ... statement else ile bitiyorsa
        olasiliklardan sadece bir tanesi mutlaka calisir
        Java ilk buldugu tre a ait sonucu yazdirir ve kalan sartşara balöaz

        if else if ... cumleleri else ile bitmese de calisir
        ancak bu durumda sadece bir olasilik calisabilir VEYA hic bir islem yapilmayabilir

        */
    }
}
