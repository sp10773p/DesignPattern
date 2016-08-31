package pe.sdh.designpattern.builder;

/**
 * Created by seongdonghun on 2016. 8. 18..
 */
public interface Builder {
    public void makeTitle(String title);
    public void makeString(String str);
    public void makeItems(String[] items);
    public void close();
}
