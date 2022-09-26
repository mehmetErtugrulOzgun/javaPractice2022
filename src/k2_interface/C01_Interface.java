package k2_interface;
//interface bolumu
interface Hayvanlar{
    public void hayvanSesi();//interface methodunda body olmaz
    public void uyuma();// interface methodunda body olmaz
}
class Keddy implements Hayvanlar,Canli{
    public void hayvanSesi(){
        //yukarıda olmayan body i burada giriyoruz
        System.out.println("Keddy miyavlar");
    }
    public void uyuma(){
        System.out.println("Keddy uykuda");
    }

    @Override
    public void nefesAlma() {
        System.out.println("Canli nefes aliyor");
    }

    @Override
    public void nefesVerme() {
        System.out.println("Canli nefes veriyor");
    }
}
interface Canli{
    public void nefesAlma();
    public void nefesVerme();
}


public class C01_Interface {
    public static void main(String[] args) {
        Keddy benimKedi= new Keddy();
        benimKedi.hayvanSesi();
        benimKedi.nefesAlma();
        benimKedi.nefesVerme();
        benimKedi.uyuma();

    }
}
