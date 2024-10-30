import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Book> books = new TreeSet<>();
        Book book1 = new Book(1, "Brave New World", 143, "Aldous Huxley", "1932");
        Book book2 =new Book(2, "The Great Gatsby", 276, "F. Scott Fitzgerald", "1925");
        Book book3 = new Book(3, "White Fang", 436, "Jack London", "1815");
        Book book4 = new Book(4, "The Karamazov Brothers", 1243, "Dostoyevski", "1753");
        Book book5 = new Book(5, "Robinson Cruose", 563,  "Daniel Defoe", "1719");


        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);


        TreeSet<Book> booksByPage = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o2.getPageNumber()-o1.getPageNumber();
            }
        });

        booksByPage.add(book1);
        booksByPage.add(book2);
        booksByPage.add(book3);
        booksByPage.add(book4);
        booksByPage.add(book5);


        System.out.println("Books by name is sorted as ");
        for (Book book : books) {
            System.out.println(book.getName());
        }

        System.out.println("\nBooks by page is sorted as ");
        for (Book book : booksByPage) {
            System.out.println(book.getName());
        }
    }


}
