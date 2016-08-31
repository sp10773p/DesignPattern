package pe.sdh.designpattern.adapter;

/**
 * Created by seongdonghun on 2016. 7. 27..
 */
public class PrintBanner extends Banner implements Print {

    public PrintBanner(String string){
        super(string);
    }

    public void printWeak() {
        showWithParen();
    }

    public void printStrong() {
        showWithAster();
    }
}
