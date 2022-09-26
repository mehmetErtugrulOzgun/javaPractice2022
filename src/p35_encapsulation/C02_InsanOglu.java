package p35_encapsulation;

public class C02_InsanOglu {
    public static void main(String[] args) {
        C01_AdemOglu insan1=new C01_AdemOglu();
        //  ademoglundan insan1 objesi creat ettik
        //insan1.age=-42;
        insan1.name="Onur";
        insan1.surName="Konur";
        insan1.setAge(-32);
        System.out.println(insan1.name);
        System.out.println(insan1.surName);
        System.out.println(insan1.getAge());
    }
}
