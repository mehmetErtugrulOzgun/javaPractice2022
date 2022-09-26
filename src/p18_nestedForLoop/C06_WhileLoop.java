package p18_nestedForLoop;

import java.util.Scanner;

public class C06_WhileLoop {

    public static void main(String[] args) {
        //  Kullanicidan baslangic ve bitis degerlerini alin. Baslangic degeri ve bitis
        //  degeri dahil aradalarindaki tum cift tamsayilari while loop kullanarak ekrana
        //  yazdiriniz

        Scanner scan = new Scanner(System.in);

        System.out.println("Baslangic degeri");
        int baslangicDegeri = scan.nextInt();

        System.out.println("Bitis degeri");
        int bitisDegeri = scan.nextInt();

        //  For loop ile
        for (int i=baslangicDegeri;i<=bitisDegeri;i++){
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println("");
        //  While loop ile
        while (baslangicDegeri<=bitisDegeri){
            if (baslangicDegeri%2==0){
                System.out.print(baslangicDegeri+" ");
            }
            baslangicDegeri++;
        }
    }
}