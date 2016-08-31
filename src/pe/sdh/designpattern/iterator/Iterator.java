package pe.sdh.designpattern.iterator;

/**
 * Created by seongdonghun on 2016. 7. 27..
 * 요소를 하나씩 나열하면서 루프 변수와 같은 역할을 수행
 */
public interface Iterator {
    public abstract boolean hasNext();
    public abstract Object next();
}
