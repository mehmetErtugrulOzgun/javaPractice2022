package p16_methodCreation;

public class C05_ForLoop {
    public static void main(String[] args) {
        //  10dan 20ye kadar olan sayilari yazdiran bir loop olusturun

        for (int sayi=10;sayi<=20;sayi++){
            System.out.print(sayi+" ");
        }
        //  100ile 200 dahil arasindaki 10ile tam bolunabilen sayilari yazdirin
        System.out.println("");
        for (int i=100;i<=200;i+=10){
            System.out.print(i+" ");
        }
        System.out.println("");
        //  50den 20ye kadar 3er 3er sinirler dahil olarak geriye sayarak yazdirin
        for (int j=50;j>=20;j-=3){
            System.out.print(j+" ");
        }
        System.out.println("");
        //  50 ile 100 arasinda uc ile bolunabilen sayilari yazdirin
        for (int k=50;k<=100;k++){
            if (k%3==0){
                System.out.print(k+" ");
            }
        }
        System.out.println("");
        for (int i = 10; i<0; i++){
            System.out.println(i+"s ");
        }
    }
}