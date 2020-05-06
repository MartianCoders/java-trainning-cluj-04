import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader();
            fileReader.fileRead("phonebook.txt");
            nameFind(fileReader.getStorage());

        }
        catch (FileNotFoundException file) {
            System.out.println(Arrays.toString(file.getStackTrace()));
        }

    }

    /*
    Prints the objects from list with name "Abbey" and "Abdul"
    In: list, data storage
    Out: ~
     */
    static void nameFind(List<Person> list) {
        if(list.size() != 0)
            for(Person person : list)
                if(person.getName().contains("Abbey") || person.getName().contains("Abdul"))
                    System.out.println(person.toString());
    }
}
