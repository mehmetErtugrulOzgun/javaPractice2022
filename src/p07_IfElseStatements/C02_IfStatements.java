package p07_IfElseStatements;

public class C02_IfStatements {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        if(a>b && b<100)
        {
            System.out.println("Isteginiz gerceklesecek $$");
            System.out.println("body icindeki tum kodlar calisir");
        }
        if (a<0) System.out.println("suslu parantez olmazsa sadece ve sadece bir satir calisir");

        System.out.println("2.satir da calisti");//If'e baglı degildir

        //Bir if cumlesinin daha anlasilir olmasini istiyorsaniz if bodysini suslu parantez icine yazmaliyiz
        //Bodyi suslu parantez icine yazmazsak da if cumlesi calisir
        // ancak ilk ; gordugunda if cumlesi bitmis olur
        //16.satirda ki kod 14. satirdaki if dogru olsa da calisir olmasa da calisir fark etmez.


    }
}
