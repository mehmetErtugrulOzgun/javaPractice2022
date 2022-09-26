package p50_maps;

import java.util.HashMap;

public class C05_Ex01 {
    //  Ad ve soyad bulunduran iki ayri arrayi bir ampe ekleyip yazdiriniz
    //  input= {"ahmet","ahmet can","haluk"}; {"seref","erdem","bilgin"};
    public static void main(String[] args) {

        String ad[]={"ahmet","ahmet can","haluk"};
        String soyisim[]={"seref","erdem","bilgin"};

        int z=100;

        HashMap <Integer,String> hm=new HashMap<>();

        for (int i=0;i< ad.length;i++){
               hm.put(z,(ad[i]+" "+soyisim[i]));
                z++;
        }
        System.out.println(hm);

    }
}
