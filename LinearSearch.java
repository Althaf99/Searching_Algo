import java.util.*;

public class LinearSearch {
    int[] array;
    int length;
    Random random = new Random();

    LinearSearch(int length) {
        array = new int[length];
        this.length = length;
    }

    private int generateRandomNumbers() {
        int num = random.nextInt(101);
        return num;
    }

    private void addNumbersToArray() {
        for (int i = 0; i < length; i++) {
            generateRandomNumbers();
            int value = generateRandomNumbers();
            array[i] = value;
        }
    }

    public int linearSearch(int num) {
        addNumbersToArray();
        int index = 0;
        while (index < length) {
            if (array[index] == num)
                return num;
            else
                index += 1;
        }
        return -1;
    }

    public void displayArray() {
        System.out.print(Arrays.toString(array));
    }
}