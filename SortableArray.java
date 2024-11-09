import java.util.Arrays;

public class SortableArray {
    private int[] array;

    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 4, 2};

        SortableArray sortableArray = new SortableArray(numbers);

        System.out.print("Original Array: ");
        sortableArray.printArray();

        System.out.print("Sorted with Java sort: ");
        sortableArray.sortUsingJavaSort();
        sortableArray.printArray();

        System.out.print("Sorted with Bubble Sort: ");
        sortableArray.sortUsingBubbleSort();
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

    public void printArray() {
        System.out.println(Arrays.toString(array));
    }
}
