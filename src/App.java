import java.util.Random;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        // sorting classes
        Selection selectSort = new Selection(); // 1.5s
        Merge mergeSort = new Merge(); // 0.5s
        Bubble bubbleSort = new Bubble();// 0.9s
        Insertion insertionSort = new Insertion();// 1.2s
        Quick quickSort = new Quick();// 0.7s

        // searching classes
        LinearSearch linearSearch = new LinearSearch();
        BinarySearch binarySearch = new BinarySearch();

        // creating an instance of random class for 10,000 number generation
        Random rand = new Random();

        // an array with the size of 5000
        int[] array = new int[5000];

        // generating a value between 1 to 10000 numbers
        int max = 10000;

        // appending array with the data

        for (int i = 0; i < array.length; i++) {
            int data = rand.nextInt(max);
            array[i] = data;
        }

        // selectSort.selectionSort(array);
        mergeSort.mergeSort(array);
        // bubbleSort.bubbleSort(array);
        // insertionSort.insertionSort(array);
        // removeDuplicate(array);
        int low = 0;
        int high = array.length - 1;

        // quickSort.quickSort(array, low, high);

        removeDuplicate(array);

        // search array
        // searching 500 data
        int searchData = 500;
        int[] searchArray = new int[searchData];
        for (int i = 0; i < searchArray.length; i++) {
            int search = rand.nextInt(searchData);
            searchArray[i] = search;
        }

        for (int j = 0; j < searchArray.length; j++) {
            // linearSearch.linearSearch(array, searchArray[j]);
            binarySearch.binarySearch(array, searchArray[j]);
        }

    }

    // this method removes the duplicate data in the array
    static void removeDuplicate(int[] array) {
        int next = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[next]) {
                next++;
                array[next] = array[i];
            }
        }
        int[] cleanArray = Arrays.copyOf(array, next + 1);
        System.out.println(Arrays.toString(cleanArray));
    }

}
