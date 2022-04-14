package p08_IfElseIfStatements;
import java.util.Scanner;
public class C04_Emeklilik {
    public static void main(String[] args) {
        /*
        Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
        calisan erkekse 65 yasindan buyukse emekli olabilir
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz" + "\nErkekseniz E'ye, Kadinsaniz K'ye basiniz.");
        char cinsiyet=scan.next().toUpperCase().charAt(0);
        System.out.println("Lutfen yasinizi giriniz");
        double yas=scan.nextDouble();
        if (cinsiyet=='K')
        {
            if (yas<0 || yas>120)
            {
                System.out.println("yasi yanlis girdiniz");
            }
            else if (yas<60)
            {
                System.out.println("emekli olamazsiniz \nDaha" + (60-yas) + " yil calisman gerek");
            }
            else
            {
                System.out.println("emekli olabilirsin");
            }
        }
        else if (cinsiyet=='E')
        {
            if (yas<0 || yas>120)
            {
                System.out.println("yasi yanlis girdiniz");
            }
            else if (yas<60)
            {
                System.out.println("emekli olamazsiniz \nDaha" + (60-yas) + " yil calisman gerek");
            }
            else
            {
                System.out.println("emekli olabilirsin");
            }
        }
        else
        {
            System.out.println("Hatali bir kisayol girdiniz");
        }
    }
}
