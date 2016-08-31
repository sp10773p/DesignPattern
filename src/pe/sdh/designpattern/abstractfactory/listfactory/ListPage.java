package pe.sdh.designpattern.abstractfactory.listfactory;

import pe.sdh.designpattern.abstractfactory.factory.Item;
import pe.sdh.designpattern.abstractfactory.factory.Page;

import java.util.Iterator;

/**
 * Created by seongdonghun on 2016. 8. 31..
 */
public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><head><title>" + title + "</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>" + title + "</h1>\n");
        buffer.append("<ul>\n");

        Iterator it = content.iterator();
        while(it.hasNext()){
            Item item = (Item)it.next();
            buffer.append(item.makeHTML());
        }

        buffer.append("</ul>\n");
        buffer.append("<hr><address>" + author + "</address>");
        buffer.append("</body></html>");

        return buffer.toString();
    }
}
