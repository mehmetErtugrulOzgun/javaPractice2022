package p05_matematikselIslemler;

public class C01_PreIncrementPostIncrement {
    public static void main(String[] args) {

        int sayi=10;
        //sayiyi 1 arttirmak istersek

        sayi++;
        System.out.println(sayi); //11

        sayi++;
        System.out.println("pre-incrementten once " + sayi); //12
        //Eger 12. ve13. satirda yaptigim islemi 2 islemi tek satirda yaparsam
        //java iki islemden once hangisini yapacagini bilmek ister


        System.out.println("pre- increment satirinda " + ++sayi); //13 olur once arttirir sonra yazdirir

        System.out.println("pre-incrementden sonra " + sayi); //13

        System.out.println("post-increment satirinda " + sayi++); //13 olur once yazdirir sonra arttirir

        System.out.println("post-increment satirindan sonra " + sayi); //14





    }
}
