package p19_doWhileLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {

        // kullanicidan bir sayi alin ve bu sayiyi ttam bolen sayilari
        // ve toplam kac tane olduklarini ekranda yazdirin

        int input=646969320;

        // for loop ile de yapabiliiz ama while loop ile yapmak istiyoruz

        int bolen=1;
        int sayac=0;

        while (bolen<=input){
            if (input%bolen==0)
            {
                System.out.println(bolen + " ");
                sayac ++;
            }
            bolen++;
        }
        System.out.println("");
        System.out.println(input + " sayisini bolen " + sayac + " adet sayi vardir");
    }
}
