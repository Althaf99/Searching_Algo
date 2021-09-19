import java.util.*;

public class Home {
    public static void main(String Args[]) {
        int arraySize = 100000;
        BinarySearch search = new BinarySearch(arraySize);
        search.generateRandomNumbers(100);
        long start = System.nanoTime();
        search.searchBinary(20, 0, arraySize);
        System.out.println("Time Taken in microSec : " + (System.nanoTime() - start) / 1000);
    }

}