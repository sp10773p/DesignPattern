package pe.sdh.designpattern.factorymethod.idcard;

import pe.sdh.designpattern.factorymethod.framework.Product;

/**
 * Created by seongdonghun on 2016. 7. 28..
 * 메소드 use를 구현하고 있는 클래스
 */
public class IDCard extends Product{
    private String owner;
    private String id;

    IDCard(String owner, String id){
        System.out.println(owner +"의 카드("+id+")를 만듭니다.");
        this.owner = owner;
        this.id = id;
    }


    public void use() {
        System.out.println(owner + "의 카드("+id+")를 사용합니다.");
    }

    public String getOwner(){
        return this.owner;
    }

    public String getId(){
        return this.id;
    }
}
