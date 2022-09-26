package p34_accessModifier;

public class C02_AcMo {
    public static void main(String[] args) {
        C01_AcMo insan1=new C01_AcMo();
        //  c01 classindan insan1 creat ettik

        System.out.println(insan1.deafultAge); //21
        System.out.println(insan1.protectedAge); //20
        System.out.println(insan1.publicAge); //61

        C03_AcMo isim2=new C03_AcMo();

        System.out.println(isim2.deafultName);
        System.out.println(isim2.protectedName);
        System.out.println(isim2.publicName);

    }
}
