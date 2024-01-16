import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Book> Books = new TreeSet<>(new OrderNameComparator());


        Books.add(new Book("Java",50,"doğuş","2018"));
        Books.add(new Book("Python",10,"burak","2019"));
        Books.add(new Book("JavaScript",350,"barış","2000"));
        Books.add(new Book("React",400,"mertcan","2003"));
        Books.add(new Book("HTML",1000,"berk","2010"));

        TreeSet<Book> BookPage = new TreeSet<>(new OrderPageNumberComparator());
        BookPage.addAll(Books);


        // Kitapları isim sırasına göre sırala

        for (Book bookName : Books){
            System.out.println(bookName.getName());
        }
        System.out.println("*********");

        // Sayfa numarasına göre sırala

        for (Book bookPageNumber : BookPage){
            System.out.println(bookPageNumber.getName());
        }





    }
}