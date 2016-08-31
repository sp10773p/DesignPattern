package pe.sdh.designpattern.adapter.exercise;

import java.io.IOException;

/**
 * Created by seongdonghun on 2016. 7. 27..
 */
public class Main {
    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try{
            String base = "/Users/seongdonghun/IdeaProjects/app/DesignPattern/src/pe/sdh/designpattern/adapter/exercise/";
            f.readFromFile(base+"file.txt");
            f.setValue("year", "2004");
            f.setValue("month", "4");
            f.setValue("day", "21");
            f.writeToFile(base+"newfile.txt");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
