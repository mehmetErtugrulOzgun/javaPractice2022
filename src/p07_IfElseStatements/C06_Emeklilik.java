package p07_IfElseStatements;

import java.util.Scanner;

public class C06_Emeklilik {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Yasinizi giriniz");
        int yas=scan.nextInt();

        if (yas>=65)
        {
            System.out.println("Emekli olabilirsiniz");
        }
        else
        {
            System.out.println("Emekli olamazsiniz");
            System.out.println(65-yas +" " + "sene daha calismaniz lazim");
        }
    }
    //if else statementlarda iki durumdan sadece ve sadece biri calisir
    //ikisinin birden calisma ihtimali YOK
    //İkisinin de calismama ihtimali YOK
}
