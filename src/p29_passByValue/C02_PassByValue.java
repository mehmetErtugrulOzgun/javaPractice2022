package p29_passByValue;

public class C02_PassByValue {
    //  Soru2 : Verilen bir fiyat icin %10 , %20, %25 indirim yapan uc method olusturun.
    //- Method’da indirim uygulayip fiyati main method’da
    // yazdirin Method’lari arka arkaya cagirip dogru calistiklarini kontrol edin

    public static void main(String[] args) {
        int fiyat=100;
        System.out.println("1.methodda ki fiyat (%10) :"+methodBir(fiyat));
        System.out.println("2.methodda ki fiyat (%20) :"+methodIki(fiyat));
        System.out.println("3.methodda ki fiyat (%25) :"+methodUc(fiyat));
        System.out.println("Method call harici fiyat  :"+fiyat);
    }

    private static int methodBir(int fiyat) {
        fiyat=fiyat*90/100;
        return fiyat;
    }

    private static int methodIki(int fiyat) {
        fiyat=fiyat*80/100;
        return fiyat;
    }

    private static int methodUc(int fiyat) {
        fiyat=fiyat*75/100;
        return fiyat;
    }
}
