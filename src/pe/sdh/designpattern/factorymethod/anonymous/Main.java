package pe.sdh.designpattern.factorymethod.anonymous;

import pe.sdh.designpattern.factorymethod.framework.Factory;
import pe.sdh.designpattern.factorymethod.framework.Product;
import pe.sdh.designpattern.factorymethod.idcard.IDCardFactory;

/**
 * Created by seongdonghun on 2016. 7. 28..
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product p1 = factory.create("sdh");
        Product p2 = factory.create("oh");

        p1.use();
        p2.use();

    }
}
