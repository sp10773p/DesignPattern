package pe.sdh.designpattern.adapter2;

import pe.sdh.designpattern.adapter.*;
import pe.sdh.designpattern.adapter.Banner;

/**
 * Created by seongdonghun on 2016. 7. 27..
 */
public class PrintBanner extends Print {
    Banner banner = null;
    public PrintBanner(String string)
    {
        this.banner = new Banner(string);
    }

    public void printWeak() {
        System.out.print("adapter2:");
        this.banner.showWithParen();
    }

    public void printStrong() {
        System.out.print("adapter2:");
        this.banner.showWithAster();
    }
}
