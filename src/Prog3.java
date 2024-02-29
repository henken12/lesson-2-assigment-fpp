public class Prog3 {
    public static void main(String[] args) {
        String[] inputArray = {"horse", "dog", "cat", "horse", "dog"};
        String[] uniqueArray = removeDuplicates(inputArray);

        // Printing the unique elements
        for (String element : uniqueArray) {
            System.out.println(element);
        }
    }

    private static String[] removeDuplicates(String[] input) {
        // This will keep track of the unique size
        int uniqueCount = 0;

        // Array to store unique elements
        String[] tempArray = new String[input.length];

        for (int i = 0; i < input.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (input[i].equals(tempArray[j])) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                tempArray[uniqueCount++] = input[i];
            }
        }

        // Creating a new array with the exact number of unique elements
        String[] uniqueArray = new String[uniqueCount];
        System.arraycopy(tempArray, 0, uniqueArray, 0, uniqueCount);

        return uniqueArray;
    }
}

