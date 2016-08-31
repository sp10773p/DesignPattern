package pe.sdh.designpattern.prototype.framework;

import java.util.HashMap;

/**
 * Created by seongdonghun on 2016. 8. 17..
 */
public class Manager {
    private HashMap showcase = new HashMap();
    public void register(String name, Product product){
        showcase.put(name, product);
    }

    public Product create(String protoname){
        Product p = (Product)showcase.get(protoname);
        return p.createClone();
    }
}
