package k2_abstraction;

abstract class Hayvanlar{
    public abstract void HayvanSesi();
    public void uyuma(){
        System.out.println("zZzZzZ");
    }
}
class Keddy extends Hayvanlar{
    public void HayvanSesi(){
        System.out.println("Miyav");
    }
}

public class C01_Abstraction {
    public static void main(String[] args) {
        Keddy k1=new Keddy();
        k1.HayvanSesi();
        k1.uyuma();
    }
}
//Bu yapi istedigimiz bilgileri gostermek yada saklamak icin kullanilir