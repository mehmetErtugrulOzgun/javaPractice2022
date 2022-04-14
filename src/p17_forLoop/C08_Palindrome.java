package p17_forLoop;

public class C08_Palindrome {
    public static void main(String[] args) {
        // Kullanicidan bir String isteyin.
        // Kullanicinin girdigi String’in palindrome
        // olup olmadigini kontrol eden bir method yazin.

        String input="mAdaM";
        palindromeKontrolEt(input);

    }

    private static void palindromeKontrolEt(String input) {

        String terstenInput="";
        for (int i = input.length()-1; i >=0 ; i--) {
            terstenInput+=input.charAt(i);
        }
        System.out.println("girdiginiz kelimenin tersten yazilisi = " + terstenInput);

        if (input.equalsIgnoreCase(terstenInput))
        {
            System.out.println("giridiginiz kelime palindrome'dur");
        }
        else
        {
            System.out.println("girdiginiz kelime palindrom degildir");
        }

    }
}
