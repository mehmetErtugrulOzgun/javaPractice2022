package p20_arrays;

public class C04_Arrays {
    public static void main(String[] args) {
        //  Verilen bir array’in tum elemanlarini toplayan
        //  bir program yazalim

        int arr[]={1,2,3,4,5,6,7};
        int toplam=0;

        for (int i=0;i<arr.length;i++){
            toplam+=arr[i];
        }
        System.out.println("Arraysde ki degerlerin toplami = "+toplam);
    }
}