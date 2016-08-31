package pe.sdh.designpattern.abstractfactory.factory;

/**
 * Created by seongdonghun on 2016. 8. 31..
 */
public abstract class Item {
    protected String caption;
    public Item(String caption){
        this.caption = caption;
    }

    public abstract String makeHTML();
}
