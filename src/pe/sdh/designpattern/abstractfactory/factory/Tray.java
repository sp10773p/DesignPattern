package pe.sdh.designpattern.abstractfactory.factory;

import java.util.ArrayList;

/**
 * Created by seongdonghun on 2016. 8. 31..
 */
public abstract class Tray extends Item{
    protected ArrayList tray = new ArrayList();
    public Tray(String caption){
        super(caption);
    }

    public void add(Item item){
        tray.add(item);
    }
}
