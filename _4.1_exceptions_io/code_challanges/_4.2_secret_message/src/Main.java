import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        StringBuilder finalString = new StringBuilder();
        File file = new File("message.txt");
        Scanner reader = new Scanner(file);

        while(reader.hasNext()) {
            char[] chars = reader.next().toCharArray();
            for(char ch : chars)
                if(Character.isUpperCase(ch)) {
                    if(ch == 'X')
                        finalString.append(" ");
                    else
                        finalString.append(ch);
                }

        }
        System.out.println(finalString);
    }
}
