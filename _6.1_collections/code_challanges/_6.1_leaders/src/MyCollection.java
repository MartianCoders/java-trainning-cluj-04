import java.util.ArrayList;
import java.util.List;

interface MyCollection<T> {
    void add(T t);
    void delete(T t);
    boolean hasNext();
    T next();
    int getCounter();
    List<T> fetchStorage();
}

class IntegCollection implements MyCollection<Integer> {
    private List<Integer> list;
    private Integer position;

    IntegCollection() {
        list = new ArrayList<>();
        position = 0;
    }

    @Override
    public void add(Integer integer) {
        this.list.add(integer);
    }

    @Override
    public void delete(Integer integer) {
        this.list.remove(integer);
    }

    @Override
    public boolean hasNext() {
        return position < this.list.size();
    }

    @Override
    public Integer next() {
        return this.list.get(position++);
    }

    @Override
    public int getCounter() {
        return this.position;
    }

    public int getSize() {
        return this.list.size();
    }

    @Override
    public List<Integer> fetchStorage() {
        return this.list;
    }

    public boolean leaderVariable(Integer integer, Integer position) {
        for(int i = position; i < this.getSize(); i++)
            if(this.list.get(i) > integer)
                return false;
        return true;
    }
}
