public class BinarySearch {
    Boolean binarySearch(int[] array, int key) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;

            if (key < array[middle]) {
                end = middle - 1;
            } else if (key > array[middle]) {
                start = middle + 1;
            } else if (key == array[middle]) {
                System.out.println("found at :" + middle + "\n");
                return true;
            }
        }
        System.out.println("Couldn't find :" + key + "\n");
        return false;
    }
}
