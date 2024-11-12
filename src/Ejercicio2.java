class Book {
    public String title;
    public String author;
    public int pagesNum;

    Book (String title, String author, int pagesNum) {
        this.author = author;
        this.pagesNum = pagesNum;
        this.title = title;
    }

    public void printResume () {
        System.out.println("Author: "+author);
        System.out.println("Title: "+title);
    }

    public void pagesValidation () {
        if ( pagesNum >300){
            System.out.println("Book with more than 300 pages");
        }
    }
}

public class Ejercicio2 {
}
