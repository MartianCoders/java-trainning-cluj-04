public class ArrayCustomIterator {
    private int[] arr;
    private int position;

    ArrayCustomIterator(int[] arr2) {
        this.arr = arr2;
        this.position = 0;
    }

    public boolean hasNext() {
        return position < arr.length;
    }

    public int next() {
        return arr[this.position++];
    }
}
