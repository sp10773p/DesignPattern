package pe.sdh.designpattern.factorymethod.idcard;

import pe.sdh.designpattern.factorymethod.framework.Factory;
import pe.sdh.designpattern.factorymethod.framework.Product;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by seongdonghun on 2016. 7. 28..
 * 메소드 createProduct, registerProduct를 구현하고 있는 클래스
 */
public class IDCardFactory extends Factory
{
    private Map users = new HashMap();
    int id = 100;
    protected Product createProduct(String owner) {
        return new IDCard(owner, String.valueOf(id++));
    }

    protected void registerProduct(Product product) {
        this.users.put(String.valueOf(id), ((IDCard)product).getOwner());
    }


    public String  getOwners(String id){
        return (String)this.users.get(id);
    }

    public Map getUsers(){
        return users;
    }
}
