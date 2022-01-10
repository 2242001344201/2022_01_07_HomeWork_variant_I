package homework;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        SortingContext bubble = new BubbleSort();
        SortingContext selection = new SelectionSort();
        bubble.execute();
        selection.execute();
    }
}
