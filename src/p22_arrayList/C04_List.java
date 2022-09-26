package p22_arrayList;

import java.util.*;

public class C04_List {
    public static void main(String[] args) {
        //  Verilen bir arrayde tekrar eden elementleri silip
        //   tekrarsiz bir yeni array haline getirin

        int arr[]={2,3,4,5,6,7,8,9,34,3,2,4,1,5,3,2,6,4,2,4,2,1,};
        List <Integer> sayilar = new ArrayList<>();

        for (int i=0;i< arr.length;i++){
            if (!sayilar.contains(arr[i])){
                sayilar.add(arr[i]);
            }
        }
        System.out.println(sayilar);
        Collections.sort(sayilar);
        System.out.println("List olarak tekrarsiz sayilar : "+sayilar);

        //  yeni bir array olusuturup bu
        //  arraylisti arraye eklemeliyiz yeni arrayin lenghti 7 olacak

        int yeniArr[]=new int[sayilar.size()];
        for (int i=0;i< yeniArr.length;i++){
            yeniArr[i]=sayilar.get(i);
        }
        System.out.println("Tekrarsiz array : "+Arrays.toString(yeniArr));
    }
}
