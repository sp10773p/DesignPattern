package pe.sdh.designpattern.abstractfactory.listfactory;

import pe.sdh.designpattern.abstractfactory.factory.Link;

/**
 * Created by seongdonghun on 2016. 8. 31..
 */
public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "    <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
