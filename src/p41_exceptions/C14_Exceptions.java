package p41_exceptions;

public class C14_Exceptions {
    public static void main(String[] args) {

        int arr[]={31,123,345,312,432};
        try {
            System.out.println(arr[3959]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println("Hatali index girdiniz");
        }
        finally {
            System.out.println("Onumuzde ki maclara bakalim");
        }
    }
}
