package homework;

import java.util.Arrays;

public class SelectionSortPerformance implements Sorter {
    @Override
    public void sort(int[] array) {
        for (int left = 0; left < array.length; left++) {
            int minInd = left;
            for (int i = left; i < array.length; i++) {
                if (array[i] < array[minInd]) {
                    minInd = i;
                }
            }
            int a = array[left];
            array[left] = array[minInd];
            array[minInd] = a;
        }
    }
}
