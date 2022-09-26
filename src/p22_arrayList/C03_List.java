package p22_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_List {
    public static void main(String[] args) {
        List <String> isimler = new ArrayList<>();
        isimler.add("Ahmet");
        isimler.add("Mehmet");
        isimler.add("Sureyya");

        isimler.set(2,"Ertugrul");
        System.out.println(isimler);
        System.out.println(isimler.set(0,"Burkut"));
        //  delil olarak eski elementi getirir
    }
}
