import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            List<Word> list = fileRead();
            sortAndPrint(list);
        }
        catch (FileNotFoundException fl) {
            System.out.println(fl.getMessage());
        }
    }

    public static List<Word> fileRead() throws FileNotFoundException {
        List<Word> list = new ArrayList<>();
        File file = new File("input.txt");
        Scanner reader = new Scanner(file);

        while(reader.hasNext()) {
            String word = reader.next().toLowerCase();
            if(!(word.equals("!") || word.equals("?") || word.equals(",") || word.equals("."))) {
                boolean exists = false;
                for (Word element : list)
                    if (element.getWord().equals(word)) {
                        element.increaseCounter();
                        exists = true;
                    }
                if (!exists) {
                    Word newWord = new Word(word);
                    list.add(newWord);
                }
            }
        }
        return list;
    }

    public static void sortAndPrint(List<Word> list) {
        list.sort(new CounterComparator());
        for(Word element : list)
            System.out.println(element.toString());
    }
}
