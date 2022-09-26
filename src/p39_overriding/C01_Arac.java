package p39_overriding;

public class C01_Arac {
    /*
    1-  Arac isimli bir superclass olusturunuz, fields:renk,motor(private), model(protected) olsun.
    2-  Constructer ekleyiniz. get ve set metodlari ve toString metodunu ekleyiniz.
    3-  Bu siniftan Otobus sinifini creat ediniz otobusun ayrica yolcuSayisi fieldini ekleyin
    4-  Bir aracPark isimli icinde main olan bir sinif olusturunuz ve Otobusten obj olusturarak
    Otobusun ozelliklerinin tumunu ekrana yazdiriniz
     */


    private String renk;
    private int motor;
    protected String model;

    public C01_Arac (){

    }

    public C01_Arac(String renk, int motor, String model) {
        setRenk(renk);
        setModel(model);
        setMotor(motor);
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
