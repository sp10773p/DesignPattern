package pe.sdh.designpattern.abstractfactory.listfactory;

import pe.sdh.designpattern.abstractfactory.factory.Factory;
import pe.sdh.designpattern.abstractfactory.factory.Link;
import pe.sdh.designpattern.abstractfactory.factory.Page;
import pe.sdh.designpattern.abstractfactory.factory.Tray;

/**
 * Created by seongdonghun on 2016. 8. 31..
 */
public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
