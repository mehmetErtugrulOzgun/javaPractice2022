package p50_maps;

import java.util.HashMap;

public class C02_HashMap {
    public static void main(String[] args) {

        HashMap<Integer, String> m1 = new HashMap<>();
        m1.put(101, "levent");
        m1.put(102, "canan");
        m1.put(103, "feyza");
        m1.put(104, "yigit");
        m1.put(105, "mehmet");
        System.out.println(m1);//{101=levent, 102=canan, 103=feyza, 104=yigit, 105=mehmet}

        m1.remove(101);//belirtilen keyde ki entry : key+value silinir
        System.out.println(m1);//{102=canan, 103=feyza, 104=yigit, 105=mehmet}

        m1.remove(102,"cAnan");//key value eslesmesi olursa entry silinir eslesme olmazsa(canan!=cAnan) herhangi bir islem yapmaz
        System.out.println(m1);//{102=canan, 103=feyza, 104=yigit, 105=mehmet}

        m1.remove(102,"canan");
        System.out.println(m1);//{103=feyza, 104=yigit, 105=mehmet}

        m1.remove(106,"merve");//olmayan keyde ki silmes islemi yapilmaz
        System.out.println(m1.remove(106,"merve"));//false
        System.out.println(m1.remove(106));//null
        System.out.println(m1);//{103=feyza, 104=yigit, 105=mehmet}

        System.out.println(m1.size());//3

        HashMap<Integer, String> m2 = new HashMap<>();
        m2.put(1,"guzel");
        m2.put(2,"insan");
        m2.put(3,"java");
        m2.put(4,"canlar");
        m2.put(5,"iyidir");
        System.out.println(m2);

        m1.putAll(m2);//m1 mape m2 put edildi dolayisiyla m1 update oldu ancak m2 ayni degerde
        //  Trick=putAll methodu calismasi icin her iki mapin Data Typelari eslesmeli
        System.out.println(m1);//{1=guzel, 2=insan, 3=java, 4=canlar, 5=iyidir, 103=feyza, 104=yigit, 105=mehmet}

        m1.compute(103,(key,value)->"haluk");//103 keyde value varsa ypdate eder yoksa entryi put eder
        System.out.println(m1);//{1=guzel, 2=insan, 3=java, 4=canlar, 5=iyidir, 103=haluk, 104=yigit, 105=mehmet}

        m1.compute(109,(key,value)->"selami");//109 keyde value olmadigi icin entry put eder
        System.out.println(m1);//{1=guzel, 2=insan, 3=java, 4=canlar, 5=iyidir, 103=haluk, 104=yigit, 105=mehmet, 109=selami}

        m1.putIfAbsent(111,"taner");//mapde 111 key varligini kontrol eder key yoksa girilen value atanir. key varsa islem yapilmaz
        System.out.println(m1);//{1=guzel, 2=insan, 3=java, 4=canlar, 5=iyidir, 103=haluk, 104=yigit, 105=mehmet, 109=selami, 111=taner}

        m1.putIfAbsent(109,"ipek");//mapde 109 key varligini kontrol eder 109 da key oldugu icin islem yapilmaz
        System.out.println(m1);//{{1=guzel, 2=insan, 3=java, 4=canlar, 5=iyidir, 103=haluk, 104=yigit, 105=mehmet, 109=selami, 111=taner}



        m1.computeIfPresent(109,(key,value)->"rabia");//mapde 109 key varligini kontrol eder 190 key oldugu icin rabia value ile update edildi
        System.out.println(m1);//{1=guzel, 2=insan, 3=java, 4=canlar, 5=iyidir, 103=haluk, 104=yigit, 105=mehmet, 109=rabia, 111=taner}

        m1.computeIfPresent(100,(key,value)->"neyzem");//mapde 100 keyi varligini kontrol eder 110 key olmadigi icin herhangi bir islem yapilmaz
        System.out.println(m1);//{1=guzel, 2=insan, 3=java, 4=canlar, 5=iyidir, 103=haluk, 104=yigit, 105=mehmet, 109=rabia, 111=taner}

    }
}
