package p23_forEachLoop;

public class C03_FELoop {
    public static void main(String[] args) {
        /*
        Soru 2:
        Bir integer list olusturunuz ve bu list’deki tum sayilarin karesinin toplamini For-each
        loop kullanarak bulunuz. Sonucu ekrana yazdiriniz
         */
        int arr1[]={3,2,5,4};
        int toplam=0;
        for (int each :arr1){
            toplam+=each*each;
        }
        System.out.println("Listede ki sayilarin karesinin toplami = "+toplam);
    }
}
