package p36_inheritance;

public class C04_Isci extends C02_Muhasebe{
    public static void main(String[] args) {
        C04_Isci isci1=new C04_Isci();

        isci1.isim="Muharrem";
        isci1.soyIsim="Ay";
        isci1.telNo="123413411234";
        isci1.adres="afsdaf asdfasdfasdfas sdfasdf";
        isci1.saatUcreti=10;
        isci1.maas=isci1.maasHesaplama();
        isci1.id= isci1.idAtama();

        C04_Isci isci2=new C04_Isci();
        isci2.isim="Selcuk";
        isci2.soyIsim="Dal";
        isci2.telNo="2342342342341414";
        isci2.adres="asdf asdfasdfas sadfsafqwer";
        isci2.saatUcreti=15;
        isci2.maas=isci2.maasHesaplama();
        isci2.id= isci2.idAtama();


        System.out.println(isci1.id+" "+ isci1.maas);
        System.out.println(isci2.id+" "+ isci2.maas);
    }
}
