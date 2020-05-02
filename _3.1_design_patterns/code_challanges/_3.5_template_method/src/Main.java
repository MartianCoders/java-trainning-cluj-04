import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = new Integer[] {1, 4, 5, 2, 3, 6, 9, 8, 7};
        Integer[] copy01OfArr = Arrays.copyOf(arr, arr.length);
        Integer[] copy02OfArr = Arrays.copyOf(arr, arr.length);

        AcsBubbleSort asc = new AcsBubbleSort();
        asc.sort(copy01OfArr);
        DescBubbleSort desc = new DescBubbleSort();
        desc.sort(copy02OfArr);

        displaySorted(copy01OfArr);
        displaySorted(copy02OfArr);
    }

    public static void displaySorted(Integer[] arr) {
        for (Integer integer : arr)
            System.out.print(integer + " ");
        System.out.println();
    }
}
