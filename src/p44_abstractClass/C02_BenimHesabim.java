package p44_abstractClass;

public class C02_BenimHesabim extends C01_Banka{

    @Override
    public double paraYatir(double miktar) {
        super.bakiye+=miktar;
        return bakiye;
    }

    @Override
    public double paraCek(double miktar) {
        super.bakiye-=miktar;
        return bakiye;
    }

    public C02_BenimHesabim(double bakiye){
        super.bakiye=bakiye;
        System.out.println("Bakiyeniz : "+bakiye);
    }

}
