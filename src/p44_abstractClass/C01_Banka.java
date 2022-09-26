package p44_abstractClass;

public abstract class C01_Banka {
    double bakiye;

    public C01_Banka(double bakiye) {
        this.bakiye = bakiye;
    }

    public C01_Banka(){
        System.out.println("Hesap haraketleri ...");
    }

    public abstract double paraYatir(double miktar);

    public abstract double paraCek(double miktar);
}
