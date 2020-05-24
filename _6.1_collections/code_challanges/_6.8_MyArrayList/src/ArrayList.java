import java.util.List;

interface MyArrayList<T> {
    void add(T t);
    void remove(T t);
    T get(int index);
    void set(int index, T t);
    int size();
}

public class ArrayList<O> implements MyArrayList<O> {
    private List<O> array;

    ArrayList() {
        array = new java.util.ArrayList<O>();
    }

    @Override
    public void add(O o) {
        array.add(o);
    }

    @Override
    public void remove(O o) {
        array.remove(o);
    }

    @Override
    public O get(int index) {
        return array.get(index);
    }

    @Override
    public void set(int index, O o) {
        array.set(index, o);
    }

    @Override
    public int size() {
        return array.size();
    }
}
