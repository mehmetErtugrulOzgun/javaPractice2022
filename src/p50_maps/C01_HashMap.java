package p50_maps;

import java.util.HashMap;

public class C01_HashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hm1 = new HashMap<>();
        hm1.put(101, "levent");
        hm1.put(102, "canan");
        hm1.put(103, "feyza");
        hm1.put(104, "yigit");
        hm1.put(105, "mehmet");
        System.out.println(hm1);//{101=levent, 102=canan, 103=feyza, 104=yigit, 105=mehmet}

        hm1.put(101, "harun");//key value update edilir eski verinin uzerine yeni girilen veri yazilir
        System.out.println(hm1);//{101=harun, 102=canan, 103=feyza, 104=yigit, 105=mehmet}

        hm1.put(106, "canan");//ayni value farkli key atanabilir
        System.out.println(hm1);//{101=harun, 102=canan, 103=feyza, 104=yigit, 105=mehmet, 106=canan}
        //valuelar unique olmak zorunda degil

        hm1.put(null, "haluk");//key degeri null olabilir
        System.out.println(hm1);// {null=haluk, 101=harun, 102=canan, 103=feyza, 104=yigit, 105=mehmet, 106=canan}

        hm1.put(null, "seda");//key value update edilir eski verinin uzerine yeni girilen veri yazilir
        System.out.println(hm1);//{null=seda, 101=harun, 102=canan, 103=feyza, 104=yigit, 105=mehmet, 106=canan}

        hm1.put(107, null);//value degerleri coklu null olabilir
        hm1.put(108, null);//value degerleri coklu null olabilir
        hm1.put(109, null);//value degerleri coklu null olabilir
        System.out.println(hm1);//{null=seda, 101=harun, 102=canan, 103=feyza, 104=yigit, 105=mehmet, 106=canan, 107=null, 108=null, 109=null}

        System.out.println(hm1.get(105));//mehmet
        System.out.println(hm1.values());//[seda, harun, canan, feyza, yigit, mehmet, canan, null, null, null]---->
        // mapde ki tum elemeanlarin valuelarini return eder
        System.out.println(hm1.keySet());//[null, 101, 102, 103, 104, 105, 106, 107, 108, 109]

        System.out.println(hm1.getOrDefault(105, "boyle bir eleman yoktur"));//mehmet
        System.out.println(hm1.getOrDefault(111, "boyle bir eleman yoktur"));//boyle bir eleman yoktur

        hm1.putIfAbsent(110, "tugrul");//null // belirtilen keyde value yoksa verileni value ya ekler yazdirilirsa
        // belirtilen keyde value olup olmadigini return eder varsa var olan value yu dondurur yoksa false donduru
        System.out.println(hm1);//{null=seda, 101=harun, 102=canan, 103=feyza, 104=yigit,
        // 105=mehmet, 106=canan, 107=null, 108=null, 109=null, 110=tugrul}

        hm1.putIfAbsent(105, "beyrek");//105 keyde mehmet value oldugu icin beyrek put edilmedi
        System.out.println(hm1.putIfAbsent(105, "beyrek"));//105 keyde ki value degeri mehmet return edildi
        System.out.println(hm1);//{null=seda, 101=harun, 102=canan, 103=feyza,
        // 104=yigit, 105=mehmet, 106=canan, 107=null, 108=null, 109=null, 110=tugrul}
    }
}
