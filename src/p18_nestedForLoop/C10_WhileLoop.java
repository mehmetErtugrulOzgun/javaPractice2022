package p18_nestedForLoop;

public class C10_WhileLoop {
    public static void main(String[] args) {
        //  While loop kullanarak 3 den 13 e kadar tum tek tamsayilari ekrana
        //  yazdiriniz.
        int sayi=3;
        while (sayi<=13){
            if (sayi%2==1){
                System.out.println(sayi);
            }
            sayi++;
        }
    }
}