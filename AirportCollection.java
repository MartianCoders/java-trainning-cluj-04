import java.util.ArrayList;
import java.util.List;

interface MyIteratorAirport {
    public boolean hasNext();
    public Airport next();
}

interface MyCollectionAirport {
    void add(Airport e);
    void remove(Airport e);
    List<Airport> fetchAirportCollection();
    MyIteratorAirport interator();

}

class AirportIterator implements MyIteratorAirport {
    private List<Airport> collection;
    private int position;

    public AirportIterator(List<Airport> list) {
        this.collection = list;
    }

    @Override
    public boolean hasNext() {
        return position < collection.size();
    }

    @Override
    public Airport next() {
        return collection.get(position++);
    }
}

public class AirportCollection implements MyCollectionAirport{
    List<Airport> collection;

    public AirportCollection() {
        this.collection = new ArrayList<>();
    }

    @Override
    public void add(Airport e) {
        collection.add(e);
    }

    @Override
    public void remove(Airport e) {
        collection.remove(e);
    }

    @Override
    public List<Airport> fetchAirportCollection() {
        return this.collection;
    }

    @Override
    public MyIteratorAirport interator() {
        return new AirportIterator(this.collection);
    }
}
