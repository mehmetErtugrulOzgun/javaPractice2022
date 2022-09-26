package k2_polymorphism;
class Hayvan{
    public void HayvanSesi(){
        System.out.println("HAYVAN SES VERİR");
    }
}
class Kopke extends Hayvan{
    public void HayvanSesi(){
        System.out.println("HAV HAV");
    }
}
class Keddy extends Hayvan{
    public void HayvanSesi(){
        System.out.println("LAAA KEDİĞĞĞĞ");
    }
}
public class C01_Polymorhism {
    // polymorhism ornegi
    public static void main(String[] args) {
        Hayvan hayvan1= new Hayvan();
        hayvan1.HayvanSesi();
        System.out.println("--------------");
        Kopke kopek1= new Kopke();
        kopek1.HayvanSesi();
        System.out.println("--------------");
        Keddy kedi1= new Keddy();
        kedi1.HayvanSesi();
    }
}