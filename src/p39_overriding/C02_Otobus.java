package p39_overriding;

public class C02_Otobus extends C01_Arac {
    int yolcuSayisi;

    public C02_Otobus(String renk, int motor, String model, int yolcuSayisi) {//    const
        super(renk, motor, model);  //parenttan gelecek fields
        this.yolcuSayisi = yolcuSayisi;
    }

    @Override
    public String toString() {
        return "Otobus[yolcuSayisi="+ yolcuSayisi+", model="+model+getRenk()+
                getMotor()+", toString()?" + super.toString()+"]";
    }
}
