public class ComicBook extends Book{
    public ComicBook() {
        this.genre = "Comic";
    }
    
    @Override
    public void printContent(){
        System.out.println(this.getISBN()+":"+this.getGenre()+", "+this.getPages()+"pp.");
    }
}