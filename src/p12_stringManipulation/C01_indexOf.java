package p12_stringManipulation;

public class C01_indexOf {
    public static void main(String[] args) {

        //Kullanicidan bir cumle ve bir kelime isteyin,
        // kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        //        - Girilen kelime cumlede kullanilmamis.
        //        - Girilen kelime cumlede 1 kere kullanilmis.
        //        - Girilen kelime cumlede 1’den fazla kullanilmis.

        String cumle ="Java ogren, yeni bir program ile yeni bir sayfa ac";
        String kelime="yeni";

        int ilkKullanim=cumle.indexOf(kelime); // -1 veya index cikar, eger -1 ise hic kullanilmamis demektir
        int ikinciKullanim=cumle.indexOf(kelime,ilkKullanim+1);
        int ucuncuKullanim=cumle.indexOf(kelime,ikinciKullanim+1);

        if (ilkKullanim==(-1))
        {
            System.out.println("girilen kelime cumlede kullanilmamistir");
        }
        else if (ikinciKullanim==(-1))
        {
            System.out.println("istenen kelime cumlede 1 kere kullanilmistir");
        }
        else if (ucuncuKullanim==(-1))
        {
            System.out.println("girilen kelime 2 kere kullanilmistir");
        }
        else
        {
            System.out.println("girilen kelime 2den fazla kullanilmistir");
        }
    }
}
