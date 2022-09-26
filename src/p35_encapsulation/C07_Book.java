package p35_encapsulation;

public class C07_Book {
    /*
    Book classi verilmistir
    Iki adet attribute olusturun
    bookName ve authorName (String ile )
    Book classini kapsulleyin
    Main classin icine object olusturun ve sonucu yazdirin

    "Book name is BOOKNAME and Author is AUTHORNAME"
     */

    private String bookName;
    private String authorName;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
