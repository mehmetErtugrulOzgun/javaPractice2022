package p44_abstractClass;

public class C03_HesapHareketlerim {
    public static void main(String[] args) {
        C02_BenimHesabim benimHesap=new C02_BenimHesabim(14000);
        System.out.println(benimHesap.paraYatir(3500));
        System.out.println(benimHesap.paraCek(5750));
    }
}
