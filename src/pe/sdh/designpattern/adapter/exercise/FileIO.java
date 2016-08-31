package pe.sdh.designpattern.adapter.exercise;

import java.io.IOException;

/**
 * Created by seongdonghun on 2016. 7. 27..
 */
public interface FileIO {
    public void readFromFile(String filename) throws IOException;
    public void writeToFile(String filename) throws IOException;
    public void setValue(String key, String value);
    public String getValue(String key);
}
