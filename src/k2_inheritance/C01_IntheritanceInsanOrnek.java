package k2_inheritance;

public class C01_IntheritanceInsanOrnek {
    public static void main(String[] args) {
        C04_Ogrenci o1= new C04_Ogrenci();
        o1.not=81;
        System.out.println(o1.not);
        o1.isim="erto";
        o1.soyisim="_strike";
        o1.kangrubu="A+";
        o1.yas=22;
        System.out.println(o1.isim+o1.soyisim+o1.yas+ " "+o1.kangrubu + " " +o1.not);
    }
}
