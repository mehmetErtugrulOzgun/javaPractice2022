package p41_exceptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_Exceptions {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        System.out.println(arr1[2]);//3
        System.out.println(arr1[4]);//5
        //System.out.println(arr1[2231]);//ArrayIndexOutOfBoundsException

        List <String> arr2=new ArrayList<>();
        arr2.add("selam");
        arr2.add("canim");
        arr2.add("cukuladam");
        System.out.println(arr2.get(0));
        System.out.println(arr2.get(1));
        System.out.println(arr2.get(2));
        System.out.println(arr2.get(3));//IndexOutOfBoundsException
        //array ve listlerde olmayan bir index ile islem yapilirsa java bize bu hatayi verir

    }




}
