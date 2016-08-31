package pe.sdh.designpattern.prototype;


import pe.sdh.designpattern.prototype.framework.Product;

/**
 * Created by seongdonghun on 2016. 8. 17..
 */
public class UnderlinePen extends Product {
    private char ulchar;

    public UnderlinePen(char decochar){
        this.ulchar = decochar;
    }

    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println("\"" + s + "\"");
        System.out.print(" ");

        for(int i=0; i<length; i++){
            System.out.print(ulchar);
        }

        System.out.println(" ");
    }
}
