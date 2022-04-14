package p06_concatenation_Operators;

public class C02_MantikOperatorleri {
    public static void main(String[] args) {

        System.out.println(5+2==8);//false

        boolean sonuc1= 5>4 && 7<9 && 6+3==9 && 5+2!=8; //true
        System.out.println(sonuc1);

        boolean sonuc2= 5>4 && 7>9 && 6+3==9 && 5+2!=8;
        System.out.println(sonuc2);//false

                         //T     F   //Burada Java durur

        boolean sonuc3= 5>4 & 7>9 & 6+3==9 & 5+2!=8;
        System.out.println(sonuc3);//false
                         //T   F     T         T //Boyle kontrole devam eder
        //&& ile & arasindaki fark

        int sayi3=15;

        //sayi3un 10ile 20 araliginda oldugunu ture diyerek dondurelim
        //java uclu karsilastirma kabul etmez
        //ikili karsilastirmalar yapip mantiksal operatorlerle birlestirmeliyiz

        System.out.println(10<sayi3 && sayi3<20); //true

        int sayi4=5;

        //sayi4un 10 ile 15 arasinda olmadigini true diyerek dondurelim

        System.out.println(sayi4<10 || sayi4>20); //true

    }
}
