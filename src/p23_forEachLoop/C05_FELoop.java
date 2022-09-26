package p23_forEachLoop;

public class C05_FELoop {
    public static void main(String[] args) {
        //  Soru 4:
        //Bir String olusturunuz, bu String’deki character’leri for-each loop kullanarak
        //yazdiriniz.
        String isim="Mehmet Ertugrul, Javayi yavas yavas ogreniyor.";
        String isimArray[]=isim.split("");
        for (String each : isimArray){
            System.out.print(each+", ");
        }
    }
}
