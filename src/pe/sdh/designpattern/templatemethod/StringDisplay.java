package pe.sdh.designpattern.templatemethod;

/**
 * Created by seongdonghun on 2016. 7. 28..
 */
public class StringDisplay extends AbstractDisplay {
    private String s=null;
    private int width;
    public StringDisplay(String s){
        this.s = s;
        this.width = s.getBytes().length;
    }

    public void open() {
        printLine();
    }

    public void print() {
        System.out.println("|"+s+"|");
    }

    public void close() {
        printLine();
    }

    public void printLine(){
        System.out.print("+");
        for (int i=0; i<width; i++){
            System.out.print("-");
        }
        System.out.println("+");
    }
}
