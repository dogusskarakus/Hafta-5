public class Book {

    private String name;
    private int NumberOfPages;
    private String author;
    private String date;

    public Book(String name, int numberOfPages, String author, String date) {
        this.name = name;
        this.NumberOfPages = numberOfPages;
        this.author = author;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPages() {
        return NumberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        NumberOfPages = numberOfPages;
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
