package p15_methodCreation;

public class C06_MethodCreation {

    public static void main(String[] args) {

        int a=10;

        int b=20;

        // iki variable in degerlerini toplayan bir method olusturalim
        // 1.adim method adini yazalim
        // 2.adim methoda gondermem gereken arguman var mi ?
        ikiSayininToplami(25,50);
        C04.dortHarfiTersineCevir("sema");
    }
    // bir methodu olusturmak calismasi icin yeterli degildir
    // method ancak cagrilirsa calisir
    // ayni class veya farkli classda olmasinin hic bir onemi yoktur
    // Java main method'da yukaridan asagiya dogru calisir
    // ve geldigi satiri calistirir

    private static void ikiSayininToplami(int a, int b) {

        System.out.println("Verilen iki sayinin toplami : " + (a+b));

    }
}