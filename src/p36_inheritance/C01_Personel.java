package p36_inheritance;

public class C01_Personel {

    public int id;
    public static int sayac=1000;
    public String isim;
    public String soyIsim;
    public String adres;
    public String telNo;

    public int idAtama(){
        this.id=sayac++;
        return id;
    }

}
