package p25_constructor;

public class C01 {
    public int ilanNo;
    public int fiyat=1900;
    public int yil=1985;
    public String marka;
    public String model="Yazilmadi";

    C01(int ilanNo,int fiyat,int yil,String marka,String model){
        this.ilanNo=ilanNo;
        //  Bu classdaki ilanNo instance variablena parametre olarak gelen ilanNodaki degeri atar
        this.fiyat=fiyat;
        this.yil=yil;
        this.marka=marka;
        this.model=model;

    }
    //  eger parametreli bir constructor olusturursak java default olani oldurur
    //  bu durumda projemizde aksama olmamasi icin default constructor yerine
    //  parametresiz bir constructori biz olusturmaliyiz
    C01(){

    }
    C01(int ilanNo, String marka, int fiyat){
        this.ilanNo=ilanNo;
        this.marka=marka;
        this.fiyat=fiyat;
    }

    public void maxHiz(int hiz){
        System.out.println("Arabanin max hizi : "+hiz);
    }
    public void yakit(String yakitTuru){
        System.out.println("Arabanin yakit turu : "+yakitTuru);
    }

}
