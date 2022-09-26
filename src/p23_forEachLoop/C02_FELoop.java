package p23_forEachLoop;

public class C02_FELoop {
    public static void main(String[] args) {
        /*
            Soru 1:
            Bir integer array olusturunuz ve bu array’deki tum sayilarin carpimini For-each loop
            kullanarak bulunuz. Sonucu ekrana yazdiriniz.
         */
        int arr[]={4,3,2,5,1,1,1};
        int carpim=1;

        for (int each : arr) {

            carpim*=each;

        }
        System.out.println("Arrayin elemanlar carpimi = "+carpim);

        //  Her adimda carpimi gormek istersem eger
        int count=1;
        carpim=1;
        for (int each : arr) {

            carpim*=each;
            System.out.println(count+". adimda Arrayin elemanlar carpimi = "+carpim);
            count++;
        }

    }
}
