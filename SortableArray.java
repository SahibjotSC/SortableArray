import java.util.Arrays;

public class SortableArray {
    private int[] array;

    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 4, 2};

        SortableArray sortableArray = new SortableArray(numbers);

        System.out.print("Original Array: ");
        sortableArray.printArray();

        System.out.print("Sorted with Java sort: ");
        sortableArray = new SortableArray(numbers);
        sortableArray.sortUsingJavaSort();
        sortableArray.printArray();

        System.out.print("Sorted with Bubble Sort: ");
        sortableArray = new SortableArray(numbers);
        sortableArray.sortUsingBubbleSort();
        sortableArray.printArray();

        System.out.print("Sorted with Selection Sort: ");
        sortableArray = new SortableArray(numbers);
        sortableArray.sortUsingSelectionSort();
        sortableArray.printArray();
    }

    public SortableArray(int[] array) {
        this.array = array;
    }

    public void sortUsingJavaSort() {
        Arrays.sort(array);
    }

    public void sortUsingBubbleSort() {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public void sortUsingSelectionSort() {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public void printArray() {
        System.out.println(Arrays.toString(array));
    }
}
