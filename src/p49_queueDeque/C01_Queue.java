package p49_queueDeque;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C01_Queue {
    public static void main(String[] args) {

        /*
        FIFO : First in first out ---> elemanlardan ilk eklenen ilk silinir eczane yemekhane
        vs sektorlerde zaman kaydi olan elemanlarin tutulmasinda kullanilir

        Queue interface nin iki subClass constructoru ile obje creat edilebilir
        LinkedList constructoru ile obje creat edilerse elemanlar Queue icinde insertion order a gore siralanir

        PriorityQueue constructoru ile obje creat edilirse elemanlar Queue icinde Javanin kendine
        ozel algoritmasina gore siralanir

         */
        Queue <String> q1=new LinkedList<>();
        q1.add("basri");
        q1.add("sedef");
        q1.add("ahmet");
        q1.add("mehmet");
        q1.add("ayse");
        System.out.println(q1);//java LİnkedList geregi insertion orde a gore sira olusturdu

        Queue <String> q2=new PriorityQueue<>();
        q2.add("rabia");
        q2.add("fatma");
        q2.add("ece");
        q2.add("seda");
        q2.add("haluk");
        q2.add("yagiz");
        System.out.println(q2);//java kendi algoritmasini calistirdi PriorityQueue(oncelik sirasi)

        System.out.println(q1.peek());//Ilk elemani silmeden return eder
        System.out.println(q1);

        System.out.println(q1.poll());//Ilk elemani silerek return eder
        System.out.println(q1);

        //q1.clear();
        //System.out.println(q1.poll());//bos bir objeden ilk eleman silip return etme
        // komutu girdik null sonucunu aldik

        //System.out.println(q1.remove());//bos bir objeden ilk eleman silip return etme komutu
        // girdik sonucunu NoSuchElementException aldık
        // q1.remove();
        // System.out.println(q1);//

        System.out.println(q1.offer("merve"));
        System.out.println(q1);//offer() methodu add methodu gibi elemani ekler ancak offerin farki
        // eleman siniri konulduysa add methodu IllegalStateException firlatir ama offer methodu calismaya devam eder







    }
}
