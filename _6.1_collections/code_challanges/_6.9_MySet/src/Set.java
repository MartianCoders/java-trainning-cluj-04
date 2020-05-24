import java.util.HashSet;
import java.util.Set;

interface MySet<T> {
    void add(T t);
    void remove(T t);
    int size();
    boolean contains(T t);
}

class SetMy<O> implements MySet<O> {
    private Set<O> set;

    SetMy() {
        set = new HashSet<O>();
    }

    @Override
    public void add(O o) {
        set.add(o);
    }

    @Override
    public void remove(O o) {
        set.remove(o);
    }

    @Override
    public int size() {
        return set.size();
    }

    @Override
    public boolean contains(O o) {
        return set.contains(o);
    }
}
