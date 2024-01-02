public class FantasyBook extends Book{
    public FantasyBook(){
        this.genre = "Fantasy";
    }
    
    @Override
    public void printContent(){
        System.out.println(this.getISBN()+":"+this.getGenre()+", "+this.getPages()+"pp.");
    }
}