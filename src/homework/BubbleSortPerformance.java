package homework;

public class BubbleSortPerformance implements Sorter {
    @Override
    public void sort(int[] array) {
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int a = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = a;
                    needIteration = true;
                }
            }
        }
    }
}
