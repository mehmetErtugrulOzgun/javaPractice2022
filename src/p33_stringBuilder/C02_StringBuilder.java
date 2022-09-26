package p33_stringBuilder;

import java.time.LocalTime;

public class C02_StringBuilder {
    //  Soru : For loop ile 1000 defa bir islem yapalim.
    //  Oncesinde ve sonrasinda zamani kontrol edip StringBuffer
    //  ve String class’larinin performanslarini karsilastiralim.
    //  Ipucu: long TimeSb = System.nanoTime(); kullanalim
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        String str="";
        StringBuilder sb=new StringBuilder("");

        LocalTime lt1=LocalTime.now();
        System.out.println(lt1);


        for (int i = 0; i < 50000; i++) {
            str+=i;
        }

        LocalTime lt2=LocalTime.now();
        System.out.println(lt2);

        LocalTime lt3=LocalTime.now();
        System.out.println(lt3);


        for (int i = 0; i < 50000; i++) {
            sb.append(i);
        }

        LocalTime lt4=LocalTime.now();
        System.out.println(lt4);
    }
}
