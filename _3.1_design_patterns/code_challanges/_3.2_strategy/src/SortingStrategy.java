public interface SortingStrategy {
    Integer[] sort(Integer[] list);
}

class BubleSort implements SortingStrategy {
    @Override
    public Integer[] sort(Integer[] list) {
        int n = list.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (list[j] > list[j+1]) {
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
        return list;
    }
}

class MergeSort implements SortingStrategy {

    @Override
    public Integer[] sort(Integer[] list) {
        return mergeSort(list, 0, list.length - 1);
    }

    public Integer[] mergeSort(Integer[] array, int low, int high) {
        if (high <= low) return array;

        int mid = (low+high)/2;
        mergeSort(array, low, mid);
        mergeSort(array, mid+1, high);
        merge(array, low, mid, high);

        return array;
    }

    public static void merge(Integer[] array, int low, int mid, int high) {
        Integer[] leftArray = new Integer[mid - low + 1];
        Integer[] rightArray = new Integer[high - mid];

        if (leftArray.length >= 0) System.arraycopy(array, low, leftArray, 0, leftArray.length);
        for (int i = 0; i < rightArray.length; i++)
            rightArray[i] = array[mid + i + 1];

        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = low; i < high + 1; i++) {
            if (leftIndex < leftArray.length && rightIndex < rightArray.length) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                } else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            } else if (leftIndex < leftArray.length) {
                array[i] = leftArray[leftIndex];
                leftIndex++;
            } else if (rightIndex < rightArray.length) {
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }
}
