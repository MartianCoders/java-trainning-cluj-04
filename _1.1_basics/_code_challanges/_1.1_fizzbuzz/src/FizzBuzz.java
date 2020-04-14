
public class FizzBuzz {
    private String word;
    private Integer number;

    /* Default constructor */
    public FizzBuzz(Integer number, String word) {
        this.word = word;
        this.number = number;
    }

    /* Get's */
    public Integer getNumber() { // Returns number (Out: number)
        return number;
    }

    public String getWord() { // Returns word (Out: word)
        return word;
    }
}
