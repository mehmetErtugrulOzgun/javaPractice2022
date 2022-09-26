package p21_multidimensionalArrays;

public class C07_MDArrays {
    public static void main(String[] args) {
        //  Soru 3) Asagidaki multi dimensional array’lerin ic array’lerinde ayni index’e sahip
        //  elemanlarin toplamini ekrana yazdiran bir program yaziniz.
        //  (Zor soru) arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12}, {13} }

        int arr1[][] = {{1, 2}, {3, 4, 5}, {6}};
        int arr2[][] = {{7, 8, 9}, {10, 11}, {12}, {13}};
        int ikiArrayToplami=0;

       if (arr1.length<= arr2.length){                        //  i yi hangisi kucukse ona gore dondurecegiz
           for (int i=0;i< arr1.length;i++){                  //  bu olasilikta arr1kucukesit sarti sagladi
               if (arr1[i].length<=arr2[i].length){           //  child array uzunlugu hangisinde kucukse onu donuyoruz
                   for (int j=0;j<arr1[i].length;j++){        //  arr1e gore arr1 ve arr2yi dondurduk
                       ikiArrayToplami+=arr1[i][j]+arr2[i][j];//  dondurdugumuz arr1 ve arr2yi topluyoruz
                   }
               }
               else if (arr1[i].length>arr2[i].length){
                   for (int j=0; j<arr2[i].length;j++){
                       ikiArrayToplami+=arr1[i][j]+arr2[i][j];
                   }
               }
           }
       }
       else { //arr2.length<arr1.length
           for (int i=0;i<arr2.length;i++){
               if (arr2[i].length<=arr1[i].length){
                   for (int j=0;j<arr2[i].length;j++){
                       ikiArrayToplami+=arr1[i][j]+arr2[i][j];
                   }
               }
               else { //arr2[i]>arr1[i]
                   for (int j=0;j<arr1[i].length;j++){
                       ikiArrayToplami+=arr1[i][j]+arr2[i][j];
                   }
               }
           }
       }
        System.out.println(ikiArrayToplami);
    }
}