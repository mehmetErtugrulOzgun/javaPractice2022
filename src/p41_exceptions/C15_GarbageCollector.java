package p41_exceptions;

public class C15_GarbageCollector {
    public static void main(String[] args) {
        String str="";

        for (int i=0;i<3;i--){
            str+=i;
            //sonsuz dongu icinde str variable yeni atama ile
            // her dongude yeni bir str creat edilir
        }
        /*
        Gabage collector finalize() methodunu calistirir.
        finalize() methodu silinecek objeleri isaretler ve siler
         */
    }
}
