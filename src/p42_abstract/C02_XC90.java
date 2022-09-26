package p42_abstract;

public class C02_XC90 extends C01_Volvo{//concrete class

    @Override
    public void kapi() {
        System.out.println("Bu araba 4 kapilidir");
    }

    @Override
    public void motor() {
        System.out.println("Bu arabada 4000cc motor vardir");
    }
    //public void abs();
}
