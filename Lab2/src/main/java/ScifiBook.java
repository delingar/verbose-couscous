public class ScifiBook extends Book{
    public ScifiBook() {
        this.genre = "Sci-Fi";
    }
    
    @Override
    public void printContent(){
        System.out.println(this.getISBN()+":"+this.getGenre()+", "+this.getPages()+"pp.");
    }
}