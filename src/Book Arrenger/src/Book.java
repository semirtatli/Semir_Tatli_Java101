public class Book implements Comparable<Book>{
    private int ID;
    private String name;
    private int pageNumber;
    private String author;
    private String date;

    public Book(int ID, String name, int pageNumber, String author, String date) {
        this.ID = ID;
        this.name = name;
        this.pageNumber = pageNumber;
        this.author = author;
        this.date = date;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public int compareTo(Book other){
        return this.name.compareTo(other.name);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


}