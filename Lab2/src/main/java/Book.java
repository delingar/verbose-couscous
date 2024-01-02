public abstract class Book implements Cloneable{
    protected int ISBN;
    protected int pages;
    protected String genre;

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getGenre() {
        return genre;
    }
    
    public abstract void printContent();
    
    @Override
    public Object clone(){
        Object cloneObject = null;
        try{
            cloneObject=super.clone();
        } catch (CloneNotSupportedException e){
            System.out.println("Cloning failed");
            e.printStackTrace();
        }
        return cloneObject;
    }
}
