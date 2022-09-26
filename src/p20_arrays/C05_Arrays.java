package p20_arrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {
        //  Verilen bir arrayin buyukten kucuge siralayan
        //  bir method yaziniz

        int arr[]={3,4,13,2,6,67,32,23,1};
        System.out.println(Arrays.toString(arr));

        arr=arrraySiralamaMethodu(arr);
        System.out.println(Arrays.toString(arr));

        arr=arrayiTerstenSiralaMethodu(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] arrayiTerstenSiralaMethodu(int[] arr) {
        int temp[]=new int[arr.length]; //  Eski array ile ayni uzunlukta bir array olusturdum
        for (int i=0;i< temp.length;i++){
            temp[i]=arr[arr.length-1-i];
        }
        //  temp arrayi istedigim gibi arrnin ters siralamasi oldu
        //  bunu main methoda dondurelim
        return temp;
    }

    private static int[] arrraySiralamaMethodu(int[] arr) {
        //  oncelikle arrayi kucukten buyuge siralamam lazim
        Arrays.sort(arr);
        return arr;
    }
}
