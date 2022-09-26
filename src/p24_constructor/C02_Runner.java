package p24_constructor;

public class C02_Runner {
    public static void main(String[] args) {
        //  Run edici yani C01de olusturdugumuz kalibi kullanmak
        //  uzere calistiracagimiz classtir
        C01 object1 = new C01();
        //  Scanner scan = new Scanner (System.in);
        //  Scanner classindan scan isminde bir obje uretiyoruz
        //  scan objesinin ozelliklerini System.in parametresi ile belirliyorum
        object1.sirketIsimi="Mehmet AS";
        object1.tel="3122255142";
        System.out.println(object1.sirketIsimi +" "+object1.tel);
        //  object1 in istedigim ozellerine (variable) deger atayabilirim
        //  eger deger atamazsam ilk atanan degeri getirir
        System.out.println(object1.personelSayisi);

        //  bir isimle object olusturma sadece 1 defa olabilir
        //  ama o objenin ozellikleri istendigi kadar degistirilebilir

        C01 object2 = new C01();

        object2.personelSayisi=31;
        System.out.println(object2.personelSayisi); //  31

        object2.personelSayisi+=15;
        System.out.println(object2.personelSayisi); //  46

        object2.personelSayisi-=2;
        System.out.println(object2.personelSayisi); //  44

        System.out.println(object1.personelSayisi); // 135


    }



    }
