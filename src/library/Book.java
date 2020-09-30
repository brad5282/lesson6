
package library;


public class Book {
    private String title;
    private String author;
    
    public Book(String author, String title){
        this.title = title;
        this.author = author;
}
    
    public String getTitle(){
        return title;
    }
    public String toString(){
        String str;
        str = "\nTitle: \t" + title;
        str += "\nAuthor: \t" + author;
        str +="\n------------------------";
        return str;
        
        
    } 
    
}

