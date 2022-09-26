package p35_encapsulation;

public class C03_ArabaMain {
    /* 1-fieldlari model(String), renk(String), motor(int),
yil(int) olan Araba isimli bir class tanimlayiniz.
2-butun fieldlari parametre alan bir constructor tanimlayiniz
3-butun fieldlari icin getter ve setter metodlari olusturunuz
4-ArabaMain isminde main method icin bir class olusuturunuz
5-iki adet parametreli const 1 adet parametresiz cons ile 3
adet araba creat ediniz
6-araclarin motor ve yilini hatali veri girisine karsi
     */
    public static void main(String[] args) {

        C04_Araba honda=new C04_Araba("civic","beyaz",-2000,-2010);
        C04_Araba audi=new C04_Araba("rs3","gri",-5000,-2002);
        C04_Araba opel=new C04_Araba();

        opel.model="astra";
        opel.renk="siyah";
        opel.setYil(2012);
        opel.setMotor(1600);

        System.out.println("Opel yil : "+opel.getYil());
        System.out.println("Opel motor : "+opel.getMotor());

        System.out.println("Hondanin yili : "+honda.getYil()); //2010
        System.out.println("Audinin motoru : "+audi.getMotor());//5000

    }
}
