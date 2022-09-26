package p36_inheritance;

public class C03_Memur extends C02_Muhasebe {

    public static void main(String[] args) {
        C03_Memur memur1= new C03_Memur();
        memur1.isim="Mehmet Ertugrul";
        memur1.soyIsim="Ozgun";
        memur1.telNo="5374487099";
        memur1.adres="Yatti balik mah. Yan gider cad. 99/99-99 Turkey";
        memur1.saatUcreti=45;
        memur1.maas=memur1.maasHesaplama();
        memur1.id= memur1.idAtama();

        C03_Memur memur2= new C03_Memur();
        memur2.isim="Ahmet Mehmet";
        memur2.soyIsim="Sureyya";
        memur2.telNo="5374447099";
        memur2.adres="Yatti balik cad. Yan gider mah. 99/99-99 Turkey";
        memur2.saatUcreti=30;
        memur2.maas=memur2.maasHesaplama();
        memur2.id= memur2.idAtama();

        System.out.println(memur1.id+" "+ memur1.maas);
        System.out.println(memur2.id+" "+ memur2.maas);
    }

}
