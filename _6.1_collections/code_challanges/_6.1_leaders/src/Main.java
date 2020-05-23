import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        IntegCollection collection = new IntegCollection();
        collection.add(1);
        collection.add(4);
        collection.add(2);
        collection.add(0);
        collection.add(3);

        while(collection.hasNext()) {
            Integer element = collection.next();
            if(collection.leaderVariable(element, collection.getCounter()))
                System.out.println(element);
        }
    }
}
