package p46_iterator;

import java.util.*;

public class C01_Iterator {
    public static void main(String[] args) {
        List <String> l1=new ArrayList<>(Arrays.asList("e","r","t","u","g","r","u","l"));

        System.out.println("Listin ilk hali "+l1);

        //l1 elemanlarini for loop kullanarak yazdiriniz

        for (int i=0;i<l1.size();i++){
            System.out.print(l1.get(i));
        }
        System.out.println("");
        for (String each : l1){
            System.out.print(each);
        }
        System.out.println("");
        //l1 elemanlarini for loop kullanarak her lemanin yanina :-) yazdirip update yapiniz
        for (int i=0;i< l1.size();i++){
            System.out.print(l1.get(i)+":-)");
        }
        System.out.println("");
        System.out.println(":-) sonrasi l1"+l1);
        //for loop ile l1 elamanlari :-) concat edildigi halde l1 degismedi update edilmedi

        List <String> l2=new ArrayList<>(Arrays.asList("m","e","h","m","e","t"));

        Iterator it1=l2.iterator();//iterator variable it1 creat ettik.
        //iterator obje degildir. Interfaceden obje olmaz.
        //has next, next, remove
        //iterator demek while loop demek

        while (it1.hasNext()){
            it1.next();
            it1.remove();
        }
        System.out.println("l2nin iterator sonrasi : "+l2);


        List <String> l3=new ArrayList<>(Arrays.asList("s","a","i","d"));



    }
}
