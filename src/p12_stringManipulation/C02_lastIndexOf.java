package p12_stringManipulation;

public class C02_lastIndexOf {
    public static void main(String[] args) {

        //Kullanicidan bir cumle ve bir kelime isteyin,
                // kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
                //        - Girilen kelime cumlede kullanilmamis.
                //        - Girilen kelime cumlede 1 kere kullanilmis.
                //        - Girilen kelime cumlede 1’den fazla kullanilmis.

        String cumle ="Java ogren, yeni bir program ile yeni bir sayfa ac";
        String kelime="yeni";

        int ilkKullanim=cumle.indexOf(kelime);
        int sonKullanim=cumle.lastIndexOf(kelime);

        if (ilkKullanim==(-1))
        {
            System.out.println("girilen kelime cumlede kullanilmis");
        }
        else if (ilkKullanim==sonKullanim)
        {
            System.out.println("girilen kelime cmlede 1 kere kullanilmistir");
        }
        else
        {
            System.out.println("girilen kelime cumlede 1 den fazla kullanilmistir");
        }
    }
}
