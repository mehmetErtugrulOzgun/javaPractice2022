package p37_inheritance;

public class C04_Runner {

    public static void main(String[] args) {

        C03_Cat c1=new C03_Cat(); //psiz cons

        System.out.println(c1.a);
        System.out.println(c1.d);
        System.out.println(c1.c);
        System.out.println(c1.b);


        c1.m1(); // Animal Class call
        c1.m2(); // Mamal class call
        c1.m3(); // Cat class call

        C02_Mamal c2=new C03_Cat("Selam");
        System.out.println(c2.a);
        System.out.println(c2.d);
        System.out.println(c2.b);
        //System.out.println(c2.c);
        //  variablelar call edilirken data type a bakilir

        c2.m1();
        c2.m2();
        c2.m3();


        //  Method call edilirken ayni isimli methodlarin hangisinin alinacagina const karar verir
        //  classtan parent a dogru hiyararsi yapilir. Babadan dedeye once kimde bulursa onu alir.

    }
}
