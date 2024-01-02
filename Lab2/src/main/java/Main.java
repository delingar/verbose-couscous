
import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Bookshelf shelf1 =Bookshelf.getInstance();
        
        for(int i=0;i<5;i++){
            Book random = BookGenerator.createBook();
            shelf1.addBook(random);
        }
        
        List<Book> booksOnShelf = shelf1.getBooks();
        for (Book book : booksOnShelf){
            book.printContent();
        }
    }
}
