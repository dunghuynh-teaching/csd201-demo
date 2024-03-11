
public class BookServiceImpl implements BookService {

    @Override
    public boolean addBook(Book book) {
        return true;
    }

    @Override
    public void showBook(int method) {        
        System.out.println(new Book("TEST","Test book",10,10,35.5));
    }

    @Override
    public Book searchBookbyCode(String bookCode) {
        return new Book("TEST","Test book",10,10,35.5);
    }

    @Override
    public int countBook() {
        return 0;
    }

    @Override
    public boolean removeBook(String bookCode) {
        return true;
    }
    @Override
    public void printAvailableBook() {
        System.out.println(new Book("TEST","Test book",10,10,35.5));
    }
    @Override
    public void balancing() {
    }
    @Override
    public Book searchBookbyName(String name) {
         return new Book("TEST","Test book",10,10,35.5);
    }    
}
