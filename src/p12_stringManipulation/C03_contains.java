package p12_stringManipulation;

public class C03_contains {
    public static void main(String[] args) {

        //Soru 1) Kullanicidan email adresini girmesini isteyin,
        // mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
        // @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
        // @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
        // mhmtertg99@gmail.com.tr

        String email="huseyinkreyziboy3169@gomail.com";
        String arananMetin="gmail.com";

        if (!email.contains(arananMetin))
        {
            System.out.println("lutfen gmail adresinizi yaziniz");
        }
        else if (email.lastIndexOf(arananMetin)==(email.length()-10))
        {
            System.out.println("email adresiniz kayit edildi");
        }
        else
        {
            System.out.println("lutfen yazimi kontrol edin");
        }
    }
}
