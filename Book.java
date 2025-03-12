package library;
import java.util.Collection;
import java.util.TreeSet;

//complete this class - 2.5 pts
public class Book implements Comparable<Book>{ //your code
	
    protected String title;
    protected String author;


    
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
      
     
    }
// get title and author
    public String getTitle() {
        return title;
    }
	public String getAuthor() {
		return author;
	}
	
	//compare books
	@Override
	public int compareTo(Book other) {
		return this.title.compareTo(other.title);
	}
}

