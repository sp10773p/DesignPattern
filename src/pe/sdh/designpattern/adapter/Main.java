package pe.sdh.designpattern.adapter;

/**
 * Created by seongdonghun on 2016. 7. 27..
 * Adaptee(Banner) 역할의 메소드를 사용해서 어떻게든 Target(Print)을
 * 만족시키기 위함함 */
public class Main {
    public static void main(String[] args) {
        Print print = new PrintBanner("Hello");
        print.printWeak();
        print.printStrong();


    }
}
