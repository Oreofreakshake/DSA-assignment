public class LinearSearch {
    Boolean linearSearch(int[] array, int key) {
        int length = array.length;
        for (int index = 0; index < length; index++) {
            if (array[index] == key) {
                System.out.println("found at :" + index + "\n");
                return true;
            }
        }
        System.out.println("Couldn't find :" + key + "\n");
        return false;
    }

}
