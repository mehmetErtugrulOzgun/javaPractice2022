package p09_ternary_Switch;

public class C03_Ternary {
    public static void main(String[] args) {

        int sayi=40;

        //verilen sayinin 3 veya daha cok basmakli olup olmadigini kontrol edin
        //ve sonucu yazdiran bir ternary olusturun

        String sonuc = sayi>=100 ? "Sayi 3 basamakli veya daha buyuk" : "Sayi negatif vea 3 basamaktan daha kucuk";

        //ternary bize sonuc dondurdugu icin
        // ya bu sonucu direk yazidmraliyiz yada sonucun
        // data turune uygun bir variable atama yabiliriz

        System.out.println("giridiginiz sayinin analizi : " + sonuc);

    }
}
