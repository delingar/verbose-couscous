
import java.util.HashMap;
import java.util.Map;

public class BookStorage {
    private static Map <Integer,Book> bookMap=new HashMap<Integer,Book>();
    
    public static Book getBook(int id) throws CloneNotSupportedException{
        Book toBeClonedBook = bookMap.get(id);
        return (Book) toBeClonedBook.clone();
    }
    
    public static void loadStorage(){
        FantasyBook fb1=new FantasyBook();
        bookMap.put(1,fb1);
        
        ScifiBook sb1=new ScifiBook();
        bookMap.put(2,sb1);
        
        ComicBook cb1=new ComicBook();
        bookMap.put(3,cb1);
    }
}
