package p37_inheritance;

public class C02_Mamal extends C01_Animal{
    public void m1(){
        System.out.println("Mamal");
    }
    public void m3(){
        System.out.println("Earth");
    }

    public int b=2;
    public int d=22;

    public C02_Mamal(){
        this('Q');
        System.out.println("Parametresiz cons.");

    }
    public C02_Mamal(char c){
        super(31);
        System.out.println("Parametreli cons.");

    }
}
