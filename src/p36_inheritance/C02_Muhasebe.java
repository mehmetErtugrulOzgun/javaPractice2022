package p36_inheritance;

public class C02_Muhasebe extends C01_Personel{
    public int saatUcreti;
    public String statu;
    public int maas;

    public int maasHesaplama(){
        int maas=saatUcreti*20*12;
        return maas;
    }
}
