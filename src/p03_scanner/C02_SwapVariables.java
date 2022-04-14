package p03_scanner;

public class C02_SwapVariables {
    public static void main(String[] args) {

        int sayi1=10;
        int sayi2=20;
        System.out.println("Swaptan once sayi1 : " + sayi1 + " , sayi2 : "+ sayi2);

        int temp=sayi1;

        sayi1=sayi2;
        sayi2=temp;
        System.out.println("Sayi 1in yeni degeri : " + sayi1);
        System.out.println("Sayi 2nin yeni degeri : " + sayi2);
    }
}
