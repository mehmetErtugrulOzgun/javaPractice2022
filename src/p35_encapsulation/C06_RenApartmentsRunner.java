package p35_encapsulation;

import java.util.Scanner;

public class C06_RenApartmentsRunner {
    /*
    Burada iki class vardir. Biri main digeri ise rentApartments
    rentApartmensin icinde
    Bu variablelari private olarak olusturun
    String name
    int roomCount
    boolean balconyOrNo

    Butun variablelar icin getter ve setter olusturunuz

    4 farkli apartment vardir. 0,1,2,3 odali
    ---------------------------------------------
    Bir method olusturun;
    eger room sayisi 0 ise
    rent kira 1400
    eger room sayisi 1 ise
    rent 1700
    eger oda sayisi 2 ise
    rent 2200
    eger oda sayisi 3 ise
    rent 2700
    renti returnleyin
    ----------------------------------------------
    Bir method olusturun
    eger balconyOrNo true ise
    rente 200 birim daha ekleyin

    Main classin icinde;
    userName rent is amountOfRent
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Adinizi giriniz : ");
        String name = scan.nextLine();

        System.out.println("Oda sayisini giriniz : ");
        int odaSayisi= scan.nextInt();

        System.out.println("Tuttugunuz oda da balkon olsun mu (true/false) : ");
        boolean balcon=scan.hasNextBoolean();

        C05_RentAparments kiraci1=new C05_RentAparments();
        kiraci1.setName(name);
        kiraci1.setRoomCount(odaSayisi);
        kiraci1.setBalconyOrNo(balcon);

        int odenmesiGerekenKira= kiraci1.balconSor(balcon) + kiraci1.kiraHesapla(odaSayisi);


        System.out.println("Kiracinin ismi : "+kiraci1.getName());
        System.out.println("Tuttugunuz oda sayisi : "+kiraci1.getRoomCount());
        System.out.println("Odenmesi gereken tutar : "+odenmesiGerekenKira);



    }
}
