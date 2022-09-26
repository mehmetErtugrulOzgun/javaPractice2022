package p32_varargsstringbuilder;

public class C03_Varargs {
    public static void main(String[] args) {
        // verilen int'lardan ilki haric tum sayilari toplayin ve
        // buldugunuz toplam ile ilk sayiyi carpip sonucu yazdirin

        toplama(2,5);
        toplama(5,10,15);
        toplama(4,5,9,7);
        toplama(5,6,8,10,45,78,-12);

    }

    private static void toplama(int sayi1, int ... var) {
        int toplama=0;
        for (int j : var){
            toplama+=j;
        }
        System.out.println("Verilen degerlerin ilki haric toplami : "+toplama);
        System.out.println("Verilen degerlerin ilki : "+sayi1);
        System.out.println("Bu iki degerin carpimi : "+(toplama*sayi1));
        System.out.println("");
    }
}
