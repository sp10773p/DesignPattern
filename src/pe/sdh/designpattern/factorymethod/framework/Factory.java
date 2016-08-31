package pe.sdh.designpattern.factorymethod.framework;

/**
 * Created by seongdonghun on 2016. 7. 28..
 * 메소드 create를 구현하고 있는 추상 클래스
 *
 * 추상클래스를 사용하지 않는 방법
 *
 * protected Product createProduct(String owner){
 *     throw new FactoryMethodRuntimeException(); // 하위 클래스에서 꼭 구현하게끔 예외를 시킨다
 * }
 */
public abstract class Factory {
    public final Product create(String owner){
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    protected abstract void registerProduct(Product p);

    protected abstract Product createProduct(String owner);
}
