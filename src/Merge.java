import java.util.Arrays;

public class Merge {
    void mergeSort(int[] array) {
        if (array.length > 1) {
            int mid = array.length / 2;

            int[] left = Arrays.copyOfRange(array, 0, mid);
            int[] right = Arrays.copyOfRange(array, mid, array.length);

            mergeSort(left);
            mergeSort(right);

            int leftIterator = 0;
            int rightIterator = 0;
            int mainIterator = 0;

            while (leftIterator < left.length && rightIterator < right.length) {
                if (left[leftIterator] < right[rightIterator]) {
                    array[mainIterator] = left[leftIterator];
                    leftIterator++;
                } else {
                    array[mainIterator] = right[rightIterator];
                    rightIterator++;
                }
                mainIterator++;
            }
            while (leftIterator < left.length) {
                array[mainIterator] = left[leftIterator];
                leftIterator++;
                mainIterator++;
            }
            while (rightIterator < right.length) {
                array[mainIterator] = right[rightIterator];
                rightIterator++;
                mainIterator++;
            }

        }

    }

}
