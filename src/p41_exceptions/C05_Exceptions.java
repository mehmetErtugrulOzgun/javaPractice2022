package p41_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C05_Exceptions {
    public static void main(String[] args) {
        /*
        Eger handle edilecek exceptionslar arasinda parent -child iliskisi varsa parent class exceptioni creat edilip
        child class exceptionu olmadan da code calisir ancak :
        olumlu durum: tek catch body ile tum exceptionlar handle edilebilir
        olumsuz durum: bir hata durumunda hatanin turu vs verileri ve ulasilamayacagi icin handle edilme imkani olmaz
         */
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Ertuğrul\\IdeaProjects\\javaPractice2022\\src\\p41_exceptions\\not");
            fis.close();
            int i = 0;
            while ((i = fis.read()) != -1) {
                System.out.print((char) (i));
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println("");
        System.out.println("Selam mesajini okuyorsan kod sikintisiz olarak run olmustur");
    }
}
