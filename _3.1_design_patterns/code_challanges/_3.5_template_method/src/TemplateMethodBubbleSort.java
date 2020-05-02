public abstract class TemplateMethodBubbleSort {
    void sort(Integer[] list) {
        int n = list.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (numbersInCorrectOrder(list[j], list[j + 1])) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
    }
    abstract boolean numbersInCorrectOrder(Integer i1, Integer i2);
}

class AcsBubbleSort extends TemplateMethodBubbleSort {

    @Override
    boolean numbersInCorrectOrder(Integer i1, Integer i2) {
        return i1 > i2;
    }
}

class DescBubbleSort extends TemplateMethodBubbleSort {

    @Override
    boolean numbersInCorrectOrder(Integer i1, Integer i2) {
        return i1 < i2;
    }
}
