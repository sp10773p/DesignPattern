package pe.sdh.designpattern.iterator;

/**
 * Created by seongdonghun on 2016. 7. 27..
 */
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();

        bookShelf.appendBook(new Book("Java Programming"));
        bookShelf.appendBook(new Book("Oracle 11g"));
        bookShelf.appendBook(new Book("Java DesignPattern"));
        bookShelf.appendBook(new Book("HTML5"));

        Iterator it = bookShelf.iterator();
        while (it.hasNext()){
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
    }
}

