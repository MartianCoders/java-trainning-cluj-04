

public class Main {
    public static void main(String[] args) {
        fizzBuzz();
    }

    public static void fizzBuzz() {
        StringBuilder finalString = new StringBuilder();
        boolean checkIfDiv = false;

        FizzBuzz[] elements = {
                new FizzBuzz(3,"Fizz"),
                new FizzBuzz(5,"Buzz"),
                new FizzBuzz(7, "Rizz"),
                new FizzBuzz(11,"Jazz"),
        };

        for(short i = 1; i <= 100; i++) {
            for (FizzBuzz counter : elements) {
                if (i % counter.getNumber() == 0) {
                    checkIfDiv = true;
                    String string = counter.getWord() + ", ";
                    finalString.append(string);
                }
            }
            if (!checkIfDiv) {
                String string = String.valueOf(i) + ", ";
                finalString.append(string);
            }
        }
        System.out.println(finalString);
    }

}
