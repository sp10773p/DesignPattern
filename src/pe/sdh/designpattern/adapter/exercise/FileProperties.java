package pe.sdh.designpattern.adapter.exercise;

import java.io.*;
import java.util.Properties;

/**
 * Created by seongdonghun on 2016. 7. 27..
 */
public class FileProperties extends Properties implements FileIO {

    public void readFromFile(String filename) throws IOException {
        InputStream in = new FileInputStream(new File(filename));
        load(in);
    }

    public void writeToFile(String filename) throws IOException {
        OutputStream out = new FileOutputStream(new File(filename));
        String comment = "written by FileProperties";
        store(out, comment);
    }

    public void setValue(String key, String value) {
        setProperty(key, value);
    }

    public String getValue(String key) {
        return getProperty(key);
    }
}
