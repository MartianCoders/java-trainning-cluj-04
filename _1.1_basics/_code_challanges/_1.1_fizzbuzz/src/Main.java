import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //fizzBuzz();
        //FooBarQix();
        //Pair2();
        Pair3();
    }

    public static void fizzBuzz() {
        StringBuilder finalString = new StringBuilder();

        FizzBuzz[] elements = {
                new FizzBuzz(3,"Fizz"),
                new FizzBuzz(5,"Buzz"),
                new FizzBuzz(7, "Rizz"),
                new FizzBuzz(11,"Jazz"),
        };

        for(short i = 1; i <= 100; i++) {
            boolean checkIfDiv = false;
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

    public static void FooBarQix() {
        FizzBuzz[] elements = {
                new FizzBuzz(3, "Foo"),
                new FizzBuzz(5,"Bar"),
                new FizzBuzz(7,"Qix"),
        };

        for(short i = 1; i <= 30; i++) {
            boolean checkIfDiv = false;
            StringBuilder string = new StringBuilder();
            string.setLength(0);
            for (FizzBuzz counter : elements) {
                if (i % counter.getNumber() == 0) {
                    checkIfDiv = true;
                    string.append(counter.getWord());
                    int copy = i;
                    while (copy > 0) {
                        int digit = copy % 10;
                        if (digit == counter.getNumber()) {
                            string.append(counter.getWord());
                        }
                        copy = copy / 10;
                    }
                    System.out.println(string);
                }
            }
            if(!checkIfDiv) {
                System.out.println(i);
            }
        }
    }

    public static void Pair2() {
        int[] a = { 5, 9, -5, 7, -5}; // -5, -5, 5, 7, 9
        int finalCounter = 0;
        int counter = 1;
        Arrays.sort(a);
        for(int i = 1; i < a.length; i++) {
            if (a[i] == a[i - 1])
                counter++;
            else {
                if (counter % 2 == 0)
                    finalCounter++;
                counter = 1;
            }
        }
        if (counter % 2 == 0)
            finalCounter++;
        System.out.println(finalCounter);
    }


    public static void Pair3() {
        int[] a = { 2, -1, -1, -1}; // -1, -1, -1, 2
        int finalCounter = 0;
        int counter = 1;
        Arrays.sort(a);
        for(int i = 1; i < a.length; i++) {
            if (a[i] == a[i - 1])
                counter++;
            else {
                if (counter % 3 == 0)
                    finalCounter++;
                counter = 1;
            }
        }
        if (counter % 3 == 0)
            finalCounter++;
        System.out.println(finalCounter);
    }
}
