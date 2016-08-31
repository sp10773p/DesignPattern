package pe.sdh.designpattern.adapter;

/**
 * Created by seongdonghun on 2016. 7. 27..
 * 미리 제공되어 있는 클래스
 */
public class Banner {
    private String string;

    public Banner(String string){
        this.string = string;
    }

    public void showWithParen(){
        System.out.println("("+this.string+")");
    }
    public void showWithAster(){
        System.out.println("*"+this.string+"*");
    }
}
