package p10_switch_StringManipulation;
import java.util.Scanner;
public class C02_SwitchMevsimler {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kaçıncı ay olduğunu giriniz");
        int ayNo = scan.nextInt();

        switch (ayNo) {
            case 12:
            case 1:
            case 2:
                System.out.println("kis");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("bahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("güz");
                break;
            default:
                System.out.println("Lutfen gecerli bir sayi giriniz");
        }
    }
}
