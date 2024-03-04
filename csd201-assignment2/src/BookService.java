public interface BookService {

	boolean addBook(Book book); // 1. Add book, return true if succeed
	
	void showBook(int method); // 2-3.print the book in method 1:In-order, method 2: Breadth-first traverse
	
	Book searchBookbyCode(String bookCode); // 4.search Book by Code
	
	int countBook(); // 5.search Book by Code
	
	boolean removeBook(String bookCode); // 6.remove book
	
	void printAvailableBook(); //7. print all available books whose lended < quantity
	
	void balancing(); //8.simply balance the tree
	
	Book searchBookbyName(String name); //9.simply balance the tree
}
