package p20_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        int arr[]=new int[5];
        System.out.println(Arrays.toString(arr));

        //  Ben bir kez olusturdugum Arrayin sonradan uzunlugunu degistirebilir miyim ?
        //  arr[5]=5;
        //  arrayin lenghti sonradan degistirilemez
        //  arrayin kullanissiz yapan da bu uzelligidir

        arr[2]=1;
        System.out.println(Arrays.toString(arr));
        arr=new int[6]; //   Bu ekleme yapamz 6 elemanlik yeni bir array olusturur

        System.out.println(Arrays.toString(arr));
        //  Arrayin lenghti degistirilemez

    }
}
