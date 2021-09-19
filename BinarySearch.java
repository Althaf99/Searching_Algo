import java.util.*;

public class BinarySearch {
    // Recursive Method

    Random random = new Random();
    int[] array;
    int count = 0;

    BinarySearch(int length) {
        array = new int[length];
    }

    public void generateRandomNumbers(int range) {
        while (count < array.length) {
            array[count++] = random.nextInt(range);
        }
        sortArray();
    }

    private void sortArray() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j])
                    swap(j - 1, j, array);
            }
        }
    }

    private void swap(int i, int j, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public int searchBinary(int target, int left, int right) {

        int mid = (left + right) / 2;
        if (left > right) {
            System.out.println("Item not found");
            return -1;
        }
        if (array[mid] == target) {
            System.out.println("Item found ::: " + mid);
            return mid;
        }

        if (array[mid] > target)
            return searchBinary(target, left, mid - 1);
        else
            return searchBinary(target, mid + 1, right);

    }

    public void display() {
        System.out.println(Arrays.toString(array));
    }
}