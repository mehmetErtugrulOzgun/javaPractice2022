package p12_stringManipulation;

public class C04_endsWith {
    public static void main(String[] args) {

        // Soru 1) Kullanicidan email adresini girmesini isteyin,
        // mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
        // @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
        // @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
        // mhmtertg99@gmail.com.tr

        String email="huso@gmail.com";
        String arananMetin="@gmail.com";

        if (!email.contains(arananMetin))
        {
            System.out.println("lutfen gmail adresinizi giriniz");
        }

        else if (email.endsWith(arananMetin))
        {
            System.out.println("email adresiniz kaydedildi");
        }
        else
        {
            System.out.println("lutfen yaziminizi kontrol ediniz");
        }
    }
}
