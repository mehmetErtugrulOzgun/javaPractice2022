package p41_exceptions;

public class C16_Final {

    static final int AGE=32;
    // final keyword ile veri immutable hale gelir
    public static void main(String[] args) {
        //AGE=34;
        int zam=3000;
        final int MAAS=5000;
        //MAAS+=zam; final keyword ile declare edilen veriablea yeni deger atanamaz
    }
}
