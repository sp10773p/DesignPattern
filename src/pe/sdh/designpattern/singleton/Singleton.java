package pe.sdh.designpattern.singleton;

/**
 * Created by seongdonghun on 2016. 7. 28..
 */
public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton(){
        System.out.println("Create Singleton class");
    }

    public static Singleton getInstance(){
        return singleton;
    }
}
