public class Main {
    public static void main(String[] args) {
        HashTable<Integer, String> hashTable = new HashTable<Integer, String>();
        hashTable.put(1, "value1");
        hashTable.put(2, "value2");
        hashTable.put(3, "value3");
        System.out.println(hashTable.size());
    }
}
