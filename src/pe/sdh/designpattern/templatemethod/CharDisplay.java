package pe.sdh.designpattern.templatemethod;

/**
 * Created by seongdonghun on 2016. 7. 28..
 */
public class CharDisplay extends AbstractDisplay {
    String s=null;
    public CharDisplay(String s){
        this.s = s;
    }
    public void open() {
        System.out.print("<<");
    }

    public void print() {
        System.out.print(this.s);
    }

    public void close() {
        System.out.println(">>");
    }
}
