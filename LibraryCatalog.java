package library;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class LibraryCatalog {
	Scanner scanner = new Scanner (System.in);
	List<String> catalog = new ArrayList<String>();
	public int getCatalogSize() {
		int size = 0;
		size = catalog.size();
		return size;
	}
	public String searchBook(String sBook) {
		String title1 = scanner.next();
		if (title1 != null) {
			return title1;
		}else 
			return null;
		}
	public void removeBook(String string) {
		String title2 = scanner.next();
		catalog.remove(title2);
	}
	public void addBook(Book book) {

		catalog.remove(book);
		if (catalog.contains(book) != true) {
			throw new IllegalArgumentException("The book is already in the catalog.");
		}
	}
	public static void main (String[]args) throws Exception{
		List<String> catalog = new ArrayList<String>();

		
	}
}