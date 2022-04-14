package p14_stringManipulation;

public class C01_trim {
    public static void main(String[] args) {

        String str="        Siz ne derseniz deyin, Java bildigini okur.        ";

        str.trim();
        System.out.println(str.length()); // bosluklu 59 karakter

        str=str.trim();
        System.out.println(str.length()); // bosluksuz 43 karakter

    }
}
