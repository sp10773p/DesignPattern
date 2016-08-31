package pe.sdh.designpattern.abstractfactory.factory;

/**
 * Created by seongdonghun on 2016. 8. 31..
 */
public abstract class Link extends Item {
    protected String url;
    public Link(String caption, String url){
        super(caption);
        this.url = url;
    }
}
