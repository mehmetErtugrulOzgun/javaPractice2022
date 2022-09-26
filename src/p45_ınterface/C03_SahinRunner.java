package p45_ınterface;

public class C03_SahinRunner {
    public static void main(String[] args) {
        C02_Sahin s1=new C02_Sahin();

        s1.ayna();
        s1.ebat();
        s1.jant();
        s1.kapi();
        s1.kaporta();
        s1.koltuk();
        s1.motor();
        s1.yakit();
        s1.sunroof();
        System.out.println("Calan cistak cistak sarki : "+IcDonanim.MUSIC);
        //s1.kumas="deri";//final variable assignment yapilamaz
        System.out.println(IcDonanim.RENK);//ahsap
        System.out.println(DısDonanim.RENK);//metalik
        System.out.println(Lastik.RENK);//beyaz yanakli siyah lastik

        System.out.println(s1.sisLambasi());//obje ile parent interfaceden concrete method call edildi
        System.out.println(DısDonanim.boya());//interface name ile parent interfaceden concrete method call edildi

    }
}
