package p38_overriding;

public class C01_Animal {

    public void beslenme(){
        System.out.println("Tum hayvanlar hayatta kalabilmek icin beslenir");
    }

    public void tatli(){
        System.out.println("Sutlac");
    }

    protected  void icecek(){
        System.out.println("Gazoz");

    }
    public Integer topla(){
        return 45+21;
    }
    public C01_Animal fatih(){
        return new C01_Animal();
    }
}
