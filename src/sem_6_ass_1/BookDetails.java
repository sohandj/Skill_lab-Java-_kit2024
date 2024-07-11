package sem_6_ass_1;

interface Printable {
    void print();
}

class Book implements Printable {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

   
    public void print() {
        System.out.println("Book: " + title + " by " + author);
    }
}

class Magazine implements Printable {
    private String title;
    private int issueNumber;

    public Magazine(String title, int issueNumber) {
        this.title = title;
        this.issueNumber = issueNumber;
    }

    @Override
    public void print() {
        System.out.println("Magazine: " + title + " Issue: " + issueNumber);
    }
}

public class BookDetails{
    public static void main(String[] args) {
        Printable book = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Printable magazine = new Magazine("National Geographic", 202);

        book.print();
        magazine.print();
    }
}
