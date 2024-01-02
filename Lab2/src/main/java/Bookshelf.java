
import java.util.LinkedList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Bookshelf {
    private static Bookshelf instance;
    private List<Book> books;
    
    private Bookshelf(){
    this.books=new LinkedList<Book>();
    }
    
    public static Bookshelf getInstance(){
        if(instance==null)
        {
            instance=new Bookshelf();
        }
        return instance;
    }
    
    public void addBook(Book book){
        books.add(book);
    }
    
    public void removeBook(Book book){
        books.remove(book);
    }
    
    public List<Book> getBooks() {
        return books;
    }
}