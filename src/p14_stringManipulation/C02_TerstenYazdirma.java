package p14_stringManipulation;

import java.util.Scanner;

public class C02_TerstenYazdirma {
    public static void main(String[] args) {

    //    Soru 5) Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin.

        Scanner input= new Scanner(System.in);
        System.out.println("4 harfli bir kelime yaziniz");
        String istenenKelime=input.nextLine();


        if (istenenKelime.length()==4)
        {
            String tersStr=istenenKelime.substring(3) + istenenKelime.substring(2,3) + istenenKelime.substring(1,2)
                    + istenenKelime.substring(0,1);
            System.out.println(tersStr);
        }
        else
        {
            System.out.println("4 harfli bir kelime girmediniz");
        }



    }
}
