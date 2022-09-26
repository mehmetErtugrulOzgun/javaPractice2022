package p41_exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class C13_Exceptions {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\Ertuğrul\\IdeaProjects\\javaPractice2022\\src\\p41_exceptions\\not");
        int i = 0;
            while ((i = fis.read()) != -1) {
                System.out.print((char) (i));
            }
    }
}
