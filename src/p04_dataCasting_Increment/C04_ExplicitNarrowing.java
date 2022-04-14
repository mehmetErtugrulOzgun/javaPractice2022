package p04_dataCasting_Increment;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {

        int sayi1=879;
        double sayi2=10;

        double sayi3=sayi1/sayi2; //87,9
        System.out.println(sayi3);

        int sayi4= (int) (sayi1/sayi2);
        //int sayi4= sayi1/(int)sayi2; de ayrı bir versiyonu
                              //deger double variable int
                              //yani variable daha dar bu sebepten mut. java bunu oto yapmaz
                              //sorumlulugu bize salar
                              //sag tarafa yazdigimiz (int) sorumluluk bende demektir
        System.out.println(sayi4); //87

        int sayi5=140;
        byte sayi6= (byte) sayi5;
        System.out.println(sayi6);

        sayi5=129;
        sayi6= (byte) sayi5;
        System.out.println(sayi6); //-127

        sayi5=260;
        sayi6= (byte) sayi5;
        System.out.println(sayi6); //4

        sayi5=520;
        sayi6= (byte) sayi5;
        System.out.println(sayi6); //8

        sayi5=-130;
        sayi6= (byte) sayi5;
        System.out.println(sayi6); //126

        sayi5=44;
        sayi6= (byte) sayi5;
        System.out.println(sayi6); //44

    }
}
