package p03_scanner;

public class C01_Variables {
    public static void main(String[] args) {
        String okulIsmi="Math Aca.";
        System.out.println(okulIsmi);

        char ilkHarf;
        //Char old. müt. "" yerine ''kullanılır.
        ilkHarf='K';
        System.out.println(ilkHarf);

        int sayi1=21, sayi2=33;
        System.out.println(sayi1+sayi2);

        String isim="Mehmet Ertugrul";
        String soyIsim="Ozgun";
        System.out.println("Isminiz  : " + (isim +" " + soyIsim));
        System.out.println("Soy isminiz  : " + soyIsim);

        short sayi3=10;
        double sayi4=20;
        System.out.println("Iki sayinin toplami  : "+ (sayi3 + sayi4));

        char ozelKarakter='#';
        System.out.println(ozelKarakter);

        int sayi5=31;
        char harf='a';
        System.out.println(sayi5 + harf);
        //char data turundeki degiskenler matamatiksel islemlerde
        //kullanilirsa o char degerinin ASCII karsiligi isleme alinir
    }
}
