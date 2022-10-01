public class Bubble {
    void bubbleSort(int[] array) {
        if (array.length == 1) {
            System.out.println("not sortable");
        } else {
            int temp = 0;
            for (int i = 0; i < array.length; i++) {
                for (int element = 1; element < array.length - i; element++) {
                    if (array[element - 1] > array[element]) {
                        temp = array[element - 1];
                        array[element - 1] = array[element];
                        array[element] = temp;

                    }
                } // inner loop
            } // first for loop
        }
    }

}
