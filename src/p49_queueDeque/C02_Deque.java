package p49_queueDeque;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class C02_Deque {
    public static void main(String[] args) {

        Deque <String> dq1=new LinkedList<>(Arrays.asList("suna","ugur","mustafa","suleyman","nazli","yagmur"));

        System.out.println(dq1);
        System.out.println(dq1.peekFirst());//Ilk elemani verir silmeden verir

        System.out.println(dq1.pollFirst()); //Ilk elemani verir silerek
        System.out.println(dq1);

        System.out.println(dq1.peekLast());//son elemani silmeden verir
        System.out.println(dq1);

        System.out.println(dq1.pollLast());//son elemani silerek verir
        System.out.println(dq1);

        System.out.println(dq1.getFirst());//istenilen elemani getirir ancak silmez
        System.out.println(dq1.getLast());//istenilen son elemani getirir ancak silmez
        System.out.println(dq1);

        dq1.clear();//sirayi bosalttik
        System.out.println(dq1.peekFirst());//bos siradan ilk elemani cagirdik
        System.out.println(dq1.peekLast());//bos siradan son elemani cagirdik
        System.out.println(dq1.getFirst());//bos siradan get metodu ile ilk eleman cagrilirsa NoSuchElementException firlatir
        System.out.println(dq1.getLast());//bos siradan get metodu ile son eleman cagrilirsa NoSuchElementException firlatir




    }
}
