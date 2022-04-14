package p07_IfElseStatements;

import java.util.Scanner;

public class C05_IfElseHaftaninGunleri {
    public static void main(String[] args) {

        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        //  Ornek:  gun=Pazar output = “Hafta sonu”
        // gun=Sali output = “Hafta ici”
        // *** String icin equals method’unu kullanin

        Scanner gunAlma=new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi yaziniz");
        String gunIsmi=gunAlma.next().toUpperCase();

        if (gunIsmi.equals("PAZAR") || gunIsmi.equals("CUMARTESI"))
            //eger equals icerisine lower case yazsaydık çalışmazdı
        {
            System.out.println("Girdiginiz gun hafta sonu");
        }
        else
        {
            System.out.println("Girdiginiz gun hafta icidir");
        }



    }
}
