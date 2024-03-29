package p13_stringManipulation;

public class C02_substring {
    public static void main(String[] args) {

        // 1-48 of 104 results for "nutella"
        // bu arama sonucundaki bulunan sonuc sayisi 100den cok ise super
        // az ise "az sonuc bulundu"

        String str="1-48 of 7000 results for \"nutella\"";
        // \ ifadesi "" bunun devam ettigini nutellanin basindaki "" bunlari karakter olarak gosterir

        int ilkSpace= str.indexOf(" "); // 4
        int ikinciSpace= str.indexOf(" ", ilkSpace+1); //7
        int ucuncuSpace= str.indexOf(" ", ikinciSpace+1); //12
        System.out.println(ikinciSpace);
        System.out.println(ucuncuSpace);

        String aramaSonucSayisiStr = str.substring(ikinciSpace+1,ucuncuSpace);
        System.out.println(aramaSonucSayisiStr);

        int aramaSonucSayisiInt=Integer.valueOf(aramaSonucSayisiStr);

        if (aramaSonucSayisiInt>100)
        {
            System.out.println("Super");
        }
        else
        {
            System.out.println("az sonuc bulundu");
        }
    }
}
