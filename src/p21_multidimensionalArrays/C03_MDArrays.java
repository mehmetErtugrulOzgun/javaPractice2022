package p21_multidimensionalArrays;

public class C03_MDArrays {
    public static void main(String[] args) {
        //  Soru 2) Asagidaki multi dimensional array’in
        //  ic array’lerindeki son elemanlarin carpimini
        //  ekrana yazdiran bir program yaziniz
        // { {1,2,3}, {4,5}, {6} }
        int arr[][]={ {1,2,3}, {4,5}, {6} };
        int carpim1=1;
        int carpim2=1;

        //  if ile
        for (int i=0;   i< arr.length;  i++){
            for (int j=0;   j<arr[i].length;    j++){
                if (j==arr[i].length-1){
                    carpim1*=arr[i][j];
                }
            }
        }
        System.out.print(carpim1);
        System.out.println("");
        //  forloop da deger degistirerek
        for (int i=0;   i< arr.length;  i++){
            for (int j=arr[i].length-1;   j<arr[i].length;    j++){
                    carpim2*=arr[i][j];
                }
            }
        System.out.println(carpim2);
        }
}