package p15_methodCreation;

public class C07_MethodCreation {
    public static void main(String[] args) {

        // stringi yazdiran bir method olusturalim
        // hosgeldiniz diye bir method olusturun
        // kapanma mesaji yazan bir method olustur

        hosgeldinYazdir();

    }

    public static void hosgeldinYazdir() {
        System.out.println("Hosgeldiniz");
        stringYazdir("Boyle de olur");
    }

    private static void stringYazdir(String str) {
        System.out.println(str);
        kapanmaMethodu();
    }

    private static void kapanmaMethodu() {
        System.out.println("bizi tercih ettiginiz icin tesekkur ederiz");
    }
}
