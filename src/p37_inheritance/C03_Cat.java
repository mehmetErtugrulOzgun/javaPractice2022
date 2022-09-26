package p37_inheritance;

public class C03_Cat extends C02_Mamal {

    public void m3(){
        System.out.println("World");
    }

    public int b=2;
    public int c=34535;

    public C03_Cat(){
        System.out.println("Parametresiz cons.");

    }
    public C03_Cat(String spqr){
        this();
        System.out.println(super.b);
        System.out.println("Parametreli cons.");

    }
}
