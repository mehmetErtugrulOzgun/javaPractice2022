package p41_exceptions;

public class C18_Exceptions {
    /*
    'ortalama' isminde bir method olusuturun ve int v int f isminde 2 adet parametresi olsun.
    int v = vize;
    int f=final;
    Eger vize 100den buyuk veya final 100den buyuk veya vize 0dan kucuk veya final 0 dan kucuk olursa
    Sistem ArithmeticException hatasi versin ve "Notlar 0-100 arasinda olmali" mesajini dondursun
    Diger durumlarda ise
    vizenin yuzde 40ini ve finalin yuzde 60i alinsin ve toplansin (ortalama=)

    vizeye 120, finale 80 girin
    programin calismasini saglayin

     */
    public static void main(String[] args) {

        try {
            ortalama(12123321,80);
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
    public static void ortalama(int v, int f){
        if (v>100||v<0 || f>100 || f<0){
            throw new ArithmeticException("\nNotlar 0 ile 100 arasinda olmali");
        }
        else {
            System.out.println("ortalama : "+(((v*4)/10)+(f*6)/10));
        }
    }
}
