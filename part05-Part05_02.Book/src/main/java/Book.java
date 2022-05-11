
public class Book {
    private String author;
    private String name;
    private int pages;
    
    public Book(String newAuthor, String newName, int newPages){
        this.author = newAuthor;
        this.name = newName;
        this.pages = newPages;
    }
    
    public String getAuthor(){
        return this.author;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getPages(){
        return this.pages;
    }
    
    public String toString(){
        return author + ", " + name + ", " + pages + " pages";
    }
}
