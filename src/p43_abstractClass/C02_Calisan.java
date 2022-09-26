package p43_abstractClass;

public class C02_Calisan extends C01_Insan {
    private int calisanId;
    public C02_Calisan(String isim, String soyIsim,int calisanId){//parametreli constructer
        super(isim, soyIsim);
        this.calisanId=calisanId;
    }
    @Override
    public void calis() {//abstract ile geldi
        try {//try-catch yapisi ile yapay bir hata olusturduk
            if (calisanId<=0){
                throw new RuntimeException();
            }
            else {
                System.out.println("Bu sahis sirket calisanidir");
            }
        }
        catch (RuntimeException e){
            System.out.println("Calisan degil");
            System.out.println("Girdiginiz id : "+this.calisanId);
        }
    }

    public static void main(String[] args) {
        C02_Calisan sekreter=new C02_Calisan("Merve","Aslan",312);
        C02_Calisan muhendis=new C02_Calisan("Omer","Faruk",23);
        C02_Calisan isci=new C02_Calisan("Ahmet","Karabacak",0);

        sekreter.bilgilendirme();
        sekreter.calis();
        muhendis.bilgilendirme();
        muhendis.calis();
        isci.bilgilendirme();
        isci.calis();
    }
}
