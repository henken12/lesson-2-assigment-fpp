public class Prog6 {

    static int min(int[] arrayOfInts) {
        if (arrayOfInts == null || arrayOfInts.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }
        int min = arrayOfInts[0];
        for (int i = 1; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] < min) {
                min = arrayOfInts[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] testArray = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
        System.out.println("The minimum value is: " + min(testArray));
    }
}

