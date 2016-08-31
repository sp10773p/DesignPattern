package pe.sdh.designpattern.iterator;

/**
 * Created by seongdonghun on 2016. 7. 27..
 */
public class BookShelfIterator implements Iterator {

    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf){
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    public boolean hasNext() {
        if(this.index < this.bookShelf.getLength())
            return true;
        else
            return false;
    }

    public Object next() {
        Book book = this.bookShelf.getBookAt(this.index);
        this.index++;
        return book;
    }
}
