package p38_overriding;

public class C02_Dog extends C01_Animal {

    @Override //    Annotation : mutlaka childe yazilir
    //  Parent ve child methodlari arasinda iliski kurar
    public void beslenme(){
        System.out.println("Kopekler etcil hayvanlardir");
    }

    @Override
    public void tatli() {
        System.out.println("Fistikli baklava");
    }

    @Override
    protected void icecek() {
        System.out.println("Tursu suyu");
    }

    @Override
    public Integer topla() {
        return 312+1;
    }

    @Override
    public C01_Animal fatih() {
        return new C02_Dog();
    }
}
