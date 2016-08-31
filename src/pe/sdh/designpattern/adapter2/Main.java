package pe.sdh.designpattern.adapter2;

/**
 * Created by seongdonghun on 2016. 7. 27..
 */
public class Main {
    public static void main(String[] args) {
        Print print = new PrintBanner("Hello2");
        print.printWeak();
        print.printStrong();


    }
}
