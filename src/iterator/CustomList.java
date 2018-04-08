package iterator;

import java.util.Iterator;

public class CustomList implements Iterable<Object>{

    private Object[] list = new Object[10];
    private int size = 0;

    public void add(Object elem){
        if (size < 10){
            list[size] = elem;
            size++;
        } else throw new IndexOutOfBoundsException("List is full");
    }

    public int size(){
        return size;
    }

    @Override
    public Iterator<Object> iterator() {
        return new Iterator<Object>() {

            private int currentIdx = 0;

            @Override
            public boolean hasNext() {
                return (currentIdx < size) && (list[currentIdx] != null);
            }

            @Override
            public Object next() {
                return list[currentIdx++];
            }
        };
    }
}
