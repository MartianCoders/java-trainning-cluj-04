import java.util.ArrayList;
import java.util.List;

interface MyIteratorPlane {
    public boolean hasNext();
    public Plane next();
}

interface MyCollectionPlane {
    void add(Plane e);
    void remove(Plane e);
    List<Plane> fetchPlaneCollection();
    MyIteratorPlane iterator();

}

class PlaneIterator implements MyIteratorPlane {
    private List<Plane> collection;
    private int position;

    public PlaneIterator(List<Plane> list) {
        this.collection = list;
    }

    @Override
    public boolean hasNext() {
        return (position < collection.size());
    }

    @Override
    public Plane next() {
        return (collection.get(position++));
    }
}

class PlaneCollection implements MyCollectionPlane {
    private List<Plane> collection;

    public PlaneCollection() {
        collection = new ArrayList<>();
    }

    @Override
    public void add(Plane e) {
        collection.add( e);
    }

    @Override
    public void remove(Plane e) {
        collection.remove(e);
    }

    @Override
    public List<Plane> fetchPlaneCollection() {
        return collection;
    }

    @Override
    public MyIteratorPlane iterator() {
        return new PlaneIterator(this.collection);
    }
}
