package p46_iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C02_Iterator {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("m", "e", "h", "m", "e", "t"));

        ListIterator lt1 = list.listIterator();//listiterator
        // interfaceden lt1 variable creat edildi degerini listten aldi

        System.out.println("Ilk hali : " + list);

        while (lt1.hasNext()) {
            lt1.set(lt1.next() + ":-)");//list elemanlarini update etti
        }
        System.out.print("Son hali :" + list);
        System.out.println("");

        List<String> list1 = new ArrayList<>(Arrays.asList("m", "e", "l", "i", "h"));
        //son elemanina :D ile update ediniz
        System.out.println("Ilk hali : " + list1);
        System.out.println("");
        ListIterator it1 = list1.listIterator();
        while (it1.hasNext()) {
            String depo = (String) it1.next();
            if (!it1.hasNext()) {
                it1.set(":D" + depo);
            }
        }
        System.out.println("");
        System.out.println("Sonra " + list1);

        while (it1.hasPrevious()) {
            String depo = (String) it1.previous();
            System.out.print(depo+" ");

        }
        /*
        Trick ---------> hasPrevious() ve previous() methodlarinin calismasi icin
        oncesinde MUTLAkA KESINLIKLE hasNext() ve next
        methodlari ile calistirilarak pointer en sona getirilmeli.

        "ITERATOR" ve "LISTITERATOR" arasinda ki farklar :
        1-) Iterator sadece hasNext(), next() ve remove() methodlarini icerir
            ListIterator ise hasNext(), next(), remove(), hasPrevious(), previous(), add(), set()
             methodlarini icerir

        2-) ListIterator sadece listler icin kullanilir. Iterator ise tum Collection(list,set,map)
         elemanlari icin kullanilir.

        3-) Iterator sadece ileri gider, ListIterator hem ileri hem geri cift yonlu
        gitmek icin kullanilir.
         */

    }
}
