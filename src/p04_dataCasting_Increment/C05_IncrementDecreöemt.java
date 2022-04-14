package p04_dataCasting_Increment;

public class C05_IncrementDecreöemt {
    public static void main(String[] args) {
        int sayi=20;
        System.out.println(sayi+10); //30
        System.out.println(sayi); //20
        System.out.println(sayi=sayi+=10); //30
        System.out.println(sayi+=10); //40
        System.out.println(sayi); //40

        System.out.println("12.satir : " + sayi++); //40
        System.out.println("13.satir : " + sayi); //41

        System.out.println("15.satir : " + ++sayi); //42
        System.out.println("16.satir : " + sayi); //42
    }
}
