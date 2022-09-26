package p19_doWhileLoop;

public class C05_Scope01 {
    public static void main(String[] args) {

        for (int i=0;i<10;i++){
            System.out.print(i+" ");
        }
        //  System.out.println(i);  // scope disinda i yi kullanamayiz
        //  i=10;   //  scope disinda i yi kullanamayiz

        int sayi;
        //  sayi++;
        //  System.out.println(sayi);
    }
}
