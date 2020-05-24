import java.util.HashMap;
import java.util.Map;

interface MyHashTable<K, V> {
    V get(K key);
    void put(K key, V value);
    void remove(K key);
    boolean containsKey(K key);
    int size();
}

public class HashTable<T, O> implements MyHashTable<T, O> {
    private Map<T, O> map;

    HashTable() {
        map = new HashMap<T, O>();
    }

    @Override
    public O get(T key) {
        return map.get(key);
    }

    @Override
    public void put(T key, O value) {
        map.put(key, value);
    }

    @Override
    public void remove(T key) {
        map.remove(key);
    }

    @Override
    public boolean containsKey(T key) {
        return map.containsKey(key);
    }

    @Override
    public int size() {
        return map.size();
    }
}
