import java.util.Comparator;

public class Word{
    private String word;
    private Integer counter;

    Word(String word) {
        this.word = word;
        this.counter = 1;
    }

    public String getWord() {
        return word;
    }

    public Integer getCounter() {
        return counter;
    }

    public void increaseCounter() {
        this.counter = this.counter + 1;
    }

    @Override
    public String toString() {
        return word + " - " + counter;
    }
}

class CounterComparator implements Comparator<Word> {

    @Override
    public int compare(Word word, Word t1) {
        return t1.getCounter().compareTo(word.getCounter());
    }
}
