import java.util.Arrays;

class WaysToReadArrays {
    public static void main(String[] args) {
        // Array declaration
        int[] array = {10, 11, 12, 13, 14, 15, 16};

        // Selecting/Reading elements from an array

        // Case 1: By using index concept
        System.out.println("By using index concept:");
        System.out.println(array[0]); // Output: 10
        System.out.println(array[1]); // Output: 11
        System.out.println(array[2]); // Output: 12
        System.out.println(array[3]); // Output: 13
        System.out.println(array[4]); // Output: 14
        System.out.println(array[5]); // Output: 15
        System.out.println(array[6]); // Output: 16
        System.out.println();

        // Case 2: By using while loop
        System.out.println("By using while loop:");
        int index = 0;
        while (index < array.length)
            System.out.println(array[index++]);
        System.out.println();

        // Case 3: By using for loop
        System.out.println("By using for loop:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println();

        // Case 4: By using for-each loop
        System.out.println("By using for-each loop:");
        for (int item : array)
            System.out.println(item);
        System.out.println();

        // Case 5: By using toString() method
        System.out.println("By using toString() method:");
        System.out.println(Arrays.toString(array));  // Output: [10, 11, 12, 13, 14, 15, 16]
    }
}
