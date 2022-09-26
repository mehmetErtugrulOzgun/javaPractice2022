package p25_constructor;

public class C03 {
    int sayi=10;
    String isim="Mehmet";
    //  ayni package daki farkli classlardan bu variablelara ulasabiliriz
    //  cunku access modfier yazmazsak deafult access modifier kullanilir
    //  access modifier default ise ayni paketten her yerde kullanilabilir

    public static void main(String[] args) {
        //  sayi=20; sayi degiskeni static olmadigi icin main methoddan kullanamam
        //  deneme(); deneme methodu static olmadigi icin main methoddan cagiramam

        C03 obj1= new C03();
        obj1.deneme();
        //  ayni classda oldugumuz halde static olmadigi icin kullanamadigimiz variable
        //  ve methodulari obje olusturarak kullanabiliriz
    }
    public  void deneme(){
        System.out.println("deneme methodu calisti");
    }
}
