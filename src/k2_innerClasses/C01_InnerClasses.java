package k2_innerClasses;
class Universite{
    String universite_ismi;
    int x=1997;

    class Fakulte{
        String fakulte_ismi;
        void universitekurulma_tarihi(){
            System.out.println(Universite.this.x);
        }

        class Bolum{
            String bolum_ismi;
        }
    }
    static class MYO{
        String myo_ismi;
        int x=2004;
        void kurulma_tarihi(int x){
            System.out.println(x);
            System.out.println(this.x);
            //System.out.println(Universite.this.x);
            //yukarıda ki ifadeyi static olmayan bir degerden static olan bir degere tasidigimiz icin
            //hata veriyor bu sebeple fakulte uzerinde ek yazacagım

        }
    }
}

public class C01_InnerClasses {
    public static void main(String[] args) {
        Universite u1= new Universite();
        u1.universite_ismi="Gazi Universitesi";
        System.out.println(u1.universite_ismi+"\n----------------");

        Universite.Fakulte f1= u1.new Fakulte();
        f1.fakulte_ismi="Mühendislik Mimarlik Fak.";
        System.out.println(f1.fakulte_ismi+"\n------------------");

        Universite.Fakulte f2=u1.new Fakulte();
        f2.fakulte_ismi="Sağlık Fakültesi";

        Universite.Fakulte.Bolum b1= f1.new Bolum();
        b1.bolum_ismi="İnşaat Müh.";
        Universite.Fakulte.Bolum b2=f1.new Bolum();
        b2.bolum_ismi="Makine Müh.";
        System.out.println(b1.bolum_ismi+" "+b2.bolum_ismi);

        Universite.Fakulte.Bolum b3=f2.new Bolum();
        b3.bolum_ismi="Tıp";
        Universite.Fakulte.Bolum b4=f2.new Bolum();
        b4.bolum_ismi="Diyetisyenlik";

        System.out.println(b3.bolum_ismi+" "+b4.bolum_ismi);

        Universite.MYO m1= new Universite.MYO();//static classtan
        m1.myo_ismi="Sağlık";
        System.out.println("\n"+m1.myo_ismi);
        m1.kurulma_tarihi(15);
        //javada girilen en son değer neyse onu okur
        //1997->2004->15
        f1.universitekurulma_tarihi();
        System.out.println("QQ");


    }
}
