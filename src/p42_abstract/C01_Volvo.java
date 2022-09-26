package p42_abstract;

public abstract class C01_Volvo {//abs class
    public abstract void kapi(); //abs method
    public abstract void motor(); //abs method


    public static void main(String[] args) {
        C01_Volvo volvo1=new C01_Volvo() {
            @Override
            public void kapi() {

            }

            @Override
            public void motor() {

            }
        };
    }
    public void sunroof(){//concrete method
        System.out.println("Sunroof acarsaniz benzin kullanimi %10 artar.");
    }
}
