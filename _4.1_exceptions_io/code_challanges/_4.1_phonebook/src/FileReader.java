import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {
    private List<Person> storage = new ArrayList<>();

    public void fileRead(String fileName) throws FileNotFoundException {

        File file = new File(fileName);
        Scanner reader = new Scanner(file);
        while (reader.hasNextLine()) {
            String data = reader.nextLine(); // Read line by line
            String[] parts = data.split(" "); // Splitting data
            String name = parts[0];
            String phoneNumber = parts[1];
            Person person = new Person(name, phoneNumber); // Person object init
            this.storage.add(person);
        }
        reader.close();
    }

    public List<Person> getStorage() {
        return this.storage;
    }
}
