package p41_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C03_Exceptions {
    public static void main(String[] args) {//inner try-catch parent child try-catch
        try {//file yerini kontrol ediyor ya evde yoksa diye
            FileInputStream fis  =new FileInputStream("C:\\Users\\Ertuğrul\\IdeaProjects\\javaPractice2022\\src\\p41_exceptions\\not");
            int i=0;

            try {// file icerigini okuma ve yazma islemini handle etti
                while ((i=fis.read())!=-1){// i int degeri fis obj read metodu ile atandiginda -1 esit while degilse bodye gir
                    System.out.print((char)(i));
                }
            }
            catch (IOException e){//I=,nput, O=output
                //e.printStackTrace();//daha cok kullanilir cunku hatanin tum verisini verir handle kolayligi saglar
                System.out.println(e.getMessage());
            }
        }

        catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("");
        System.out.println("Selam mesajini okuyorsan kod sikintisiz olarak run olmustur");
    }
}
