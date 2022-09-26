package p37_inheritance;

import p27_staticKeyword.C01;

public class C01_Animal {

    public int a=0;
    public int b;
    public void m1(){
        System.out.println("Animal");
    }
    public void m2(){
        System.out.println("Zoo");
    }

    public C01_Animal(){
        System.out.println("Parametresiz Constructer");
    }
    public C01_Animal(int i){
        System.out.println("Parametreli constructer");
    }
}
