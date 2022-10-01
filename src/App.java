import java.util.Random;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        // sorting classes
        Selection selectSort = new Selection();
        Merge mergeSort = new Merge();
        Bubble bubbleSort = new Bubble();
        Insertion insertionSort = new Insertion();
        Quick quickSort = new Quick();

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
        // mergeSort.mergeSort(array);
        // bubbleSort.bubbleSort(array);
        // insertionSort.insertionSort(array);
        // removeDuplicate(array);
        int low = 0;
        int high = array.length - 1;

        // quickSort.quickSort(array, low, high);

        removeDuplicate(array);
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
