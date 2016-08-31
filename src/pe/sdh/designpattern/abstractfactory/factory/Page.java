package pe.sdh.designpattern.abstractfactory.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

/**
 * Created by seongdonghun on 2016. 8. 31..
 */
public abstract class Page {
    protected String title;
    protected String author;
    protected ArrayList content = new ArrayList();

    public Page(String title, String author){
        this.title = title;
        this.author = author;
    }

    public void add(Item item){
        this.content.add(item);
    }

    public void output(){
        try{
            String filename = title + ".html";
            Writer writer = new FileWriter(filename);
            writer.write(this.makeHTML());
            writer.close();
            System.out.println(filename + " 을 작성했습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract String makeHTML();
}
