package p48_set;

import java.util.Arrays;
import java.util.HashSet;

public class C01_HashSet {
    /*
    Set :
    1-  unique(benzersiz tek) elemanlardan olusur Setlerin icinde bir eleman sadece bir kere
     kullanilabilir mukerrer(duplicate) eleman olamaz

    2-  sadece bir null degeri olabilir. (treeset haric) java elementleri unique yapmak icin
    hash algoritmasi kullanir.Java her data icin hashing teknigini kullanarak bir code uretir bu
    code"u almak icin Hashcode() methodu kullanilir. Hashing farkli buyuklukte ki girdilerden
    sabit buyuklukte ki bir cikti olusturma surecine verilen isimdir. Universitelerde ki ogrenci
     numaralari gibi bir ogrenci ismi soruldugunda numarasini bulursaniz onunla ilgili tum
      datalara ulasabilir




    HashSet :
    1-  HashSet, duplication a (tekrarli eleman) izin vermez. Eger bir elemani tekrar HashSete eklemek istersenğiz
    eski olan silinip yeni olan uzerine yazilir
    2-  HashSetler Setler arasinda ki en hizli olanilidir bir algoritmaya gore kayit eder
    degerlerin giris sirasina dikkat etmez LİnkedHashSet haric
    3-  HashSet "null" objectini eleman olarak kullanabilir.
    Ancak birden fazla null degerini bir HashSete eklemek isterseniz sadec bir tane null degeri olur

    LinkedHashSet :
    1-  Tekrarli eleman kabul etmezler. Elemanlari ekleme sirasina(insertion order) gore dizerler
    2-  LinkedHashSet, HashSetden daha yavas calisir
    3-  LinkedHashSet "null" objectini eleman olarak kullanabilir.
    4-  Ekleme ve remove islemlerinde hizlidir

    TreeSet :
    1-  TreeSet tekrarli eleman kabul etmez cunku Setdir
    2-  Elemanlari natural Ordera (String ise alfabetik, sayi ise kucukten buyuge) gore dizer
    3-  TreeSet setlerin en yavasidir. Bu yuzden TreeSet kullanirken dikkatli olunmali
    4-  ****TreeSet "null" objectini eleman olarak kullanamaz


    Set Methods :
    add(eleman)----Sete eleman ekler

    addAll(collection)--->istenilen colelction in tum elemanlarini ekler

    contains(eleman)---> istenilen eleman sette varsa true yoksa false dondurur

    containsAll(collections) ---> istenilen collectionin tumu
        aranan sette var ise true yoksa false dondurur

    remove(eleman)---> istenilen eleman bulursa siler ve true dondurur bulamazsa false donduru

    removeAll(collection)---> istenilen collectionin tum elemenlari bulursa siler ve true dondurur
        bulamazsa false dondur

    equals(set2)--->istenilen set2le tum elemanlar ayni ise true yoksa false dondurur

    retainAll(collection)---> collection1in elemenlarinin disindaki tum elemanlari siler silme islemi yapti
        ise true yoksa flase dondurur (kesisen ortak eleman)

    clear()---> setteki tum elemanlari siler

    isEmpty()--->sette hic eleman yoksa true varsa false donurur

    size()--->setin eleman sayisini verir
     */

    public static void main(String[] args) {
        HashSet <String> hs1=new HashSet<>(Arrays.asList("erdem","furkan","samet","ayse","burcu","emel"));

        hs1.add("halil");
        System.out.println(hs1);

        HashSet <String> hs2=new HashSet<>(Arrays.asList("basarili","azimli","nasipli"));

        hs1.addAll(hs2);
        System.out.println(hs1);

        hs1.remove("basarili");
        System.out.println(hs1);


        System.out.println(hs1.size());

        System.out.println(hs1.isEmpty());

        hs1.remove("halil");
        System.out.println(hs1);

        System.out.println(hs1.contains("erdem"));



    }

}
