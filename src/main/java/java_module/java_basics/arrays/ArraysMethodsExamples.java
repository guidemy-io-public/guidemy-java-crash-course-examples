package java_module.java_basics.arrays;

import java.util.Arrays;

public class ArraysMethodsExamples {
    public static void main(String[] args) {
        // Create an array
        int[] arr1 = new int[5];

        // Fill array with zeroes
        Arrays.fill(arr1, 0);

        // Print gibberish
        System.out.println(arr1);

        // Print the contents of the array
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr3 = {4, 3, 1, 2, 6, 5, 8, 7};

        System.out.println("arr2: " + Arrays.toString(arr2));

        // Before sorting
        System.out.println("Unsorted arr3: " + Arrays.toString(arr3));
        System.out.println("Are arr2 and arr3 equal? " + Arrays.equals(arr2, arr3));

        Arrays.sort(arr3);

        // After sorting
        System.out.println("Sorted arr3: " + Arrays.toString(arr3));
        System.out.println("Are arr2 and arr3 equal? " + Arrays.equals(arr2, arr3));

        // Copy an array
        int[] arr4 = {4, 3, 1, 2, 6, 5, 8, 7};

        int[] arr5 = Arrays.copyOfRange(arr4, 0, arr4.length);
        System.out.println("Full Copy of arr4 (arr5): " + Arrays.toString(arr5));

        int[] arr6 = Arrays.copyOfRange(arr4, 2, 6);
        System.out.println("Partial Copy of arr4 (arr6): " + Arrays.toString(arr6));
    }
}
