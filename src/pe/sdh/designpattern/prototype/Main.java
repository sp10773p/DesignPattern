package pe.sdh.designpattern.prototype;

import pe.sdh.designpattern.prototype.framework.Manager;
import pe.sdh.designpattern.prototype.framework.Product;

/**
 * Created by seongdonghun on 2016. 8. 17..
 */
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Product upen = new UnderlinePen('~');
        Product mbox = new MessageBox('*');
        Product sbox = new MessageBox('/');
        manager.register("strong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        Product p1 = manager.create("strong message");
        p1.use("Hello, world.");

        Product p2 = manager.create("warning box");
        p2.use("Hello, world.");

        Product p3 = manager.create("slash box");
        p3.use("Hello, world.");
    }
}
