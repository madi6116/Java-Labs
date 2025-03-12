package library;

import java.util.*;

//complete the main method in this class - 2pts
public class LibraryManager {

	public static void main(String[] args) {
		//Adding books
		Book b1 = new Book ("Harry Potter","J. K. Rowling");
    	Book b2 = new Book("The Power of Habbit","Charles Duhigg");
    	Book b3 = new Book("The Lord of the Rings", "John Ronald Reuel Tolkien");
    	Book b4 = new Book("Sherlock Holmes", "Arthur Conan Doyle");
    	Book b5 = new Book("Arsene Lupin", "Maurice Leblanc");
    	Book b6 = new Book("Funny in Farsi", "Firoozeh Dumas");
    	Book b7 = new Book("Hercule Poirot", "Agatha Christie");
    	Book b8 = new Book("hercule poirot", "agatha christie");
    	
   
    	
    	//creating a BST for adding book objects. inserting each book to the BST
    	BST<Book> books = new BST<>();
    	books.insert(b1);
    	books.insert(b2);
    	books.insert(b3);
    	books.insert(b4);
    	books.insert(b5);
    	books.insert(b6);
    	books.insert(b7);
    	books.insert(b8);
    	//Print in ascending order by using transversal.
    	 System.out.println(" ");
         for(Book book: books.bstTraversal()) {
             System.out.println(book.getTitle() + " , " + book.getAuthor());
         }
         //Printing a new line so it looks cleaner. 
         System.out.println();
         //Printing unique items.
         System.out.println("Printing only unique items (arbitrary order) in books as a table with access complexity of almost O(1):");
         HashSet<String> uniqueTitles = new HashSet<>();
         for (Book book : books.bstTraversal()) {
             // Convert titles to lowercase for comparison
             String lowercaseTitle = book.getTitle().toLowerCase();
             // Check if the lowercase title has not been printed before
             if (uniqueTitles.add(lowercaseTitle)) {
                 System.out.println(book.getTitle() + " , " + book.getAuthor());
             }
         }
     }
 }
    	
    
