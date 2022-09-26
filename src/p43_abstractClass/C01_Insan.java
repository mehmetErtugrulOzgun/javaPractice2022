package p43_abstractClass;

public abstract class C01_Insan {
    private String isim;
    private String soyIsim;

    public C01_Insan() {//default constructer
    }

    public C01_Insan(String isim, String soyIsim) {//parametreli constructer
        this.isim = isim;
        this.soyIsim = soyIsim;
    }

    public abstract void calis();//abstract method

    public void bilgilendirme(){//concreat method
        System.out.println(this.isim+"  "+this.soyIsim);
    }
    public void isimDegistir(String isim, String soyIsim){//concreat method
        this.isim=isim;
        this.soyIsim=soyIsim;
    }
}
