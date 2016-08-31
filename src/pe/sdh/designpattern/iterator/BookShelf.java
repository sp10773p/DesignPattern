package pe.sdh.designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by seongdonghun on 2016. 7. 27..
 * 서가를 나타내는 클래스
 * 집합체로 다루기 위해 Aggregate 인터페이스를 구현
 */
public class BookShelf implements Aggregate{
    private List books = new ArrayList();
    private int last = 0;


    public Book getBookAt(int index){
        return (Book)books.get(index);
    }

    public void appendBook(Book book){
        this.books.add(book);
        this.last = this.books.size();
    }

    public int getLength(){
        return this.last;
    }

    public Iterator iterator(){
        return new BookShelfIterator(this);
    }

}
