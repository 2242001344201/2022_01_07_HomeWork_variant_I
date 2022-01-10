package homework;

public class SortingContext {
    Sorter sorter;

    int[] array = {5, 2,8,7,10,12,6};
    public void execute() {
        sorter.sort(this.array);
    }
}
