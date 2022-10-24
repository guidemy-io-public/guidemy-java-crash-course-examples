package java_module.java_basics.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class ArraysExamples {
    public static void main(String[] args) {
        // Declare an array
        String[] brands;

        // Allocate memory for the array
        brands = new String[5];

        // Get the size or length of the array
        System.out.println("Array Size: " + brands.length);  // prints 5

        // Initialize an array with curly braces
        int[] numbers1 = {0, 0, 0, 0, 0};

        // Initialize an array by index
        int[] numbers2 = new int[5];

        numbers2[0] = 0;
        numbers2[1] = 0;
        numbers2[2] = 0;
        numbers2[3] = 0;
        numbers2[4] = 0;

        // Fill an array with zeroes using the Arrays.fill() method
        Arrays.fill(numbers2, 0);

        // Create an array
        String[] companies = {"Amazon", "Apple", "Google", "Meta", "Netflix"};

        // Access each element of the array
        System.out.println("1. " + companies[0]);
        System.out.println("2. " + companies[1]);
        System.out.println("3. " + companies[2]);
        System.out.println("4. " + companies[3]);
        System.out.println("5. " + companies[4]);

        // Loop through the array elements using a for loop
        for (int i = 0; i < companies.length; i++) {
            System.out.println((i + 1) + ". " + companies[i]);
        }

        // Loop through the array elements using a for-each loop
        for (String company : companies) {
            System.out.println(company);
        }

        // Example - Compute Sum and Average of Array Elements
        BigDecimal[] elements = {
            new BigDecimal("1.2"),
            new BigDecimal("2.3"),
            new BigDecimal("3.4"),
            new BigDecimal("4.5"),
            new BigDecimal("5.6")
        };

        BigDecimal total = BigDecimal.ZERO;

        for (BigDecimal element : elements) {
            total = total.add(element);
        }

        BigDecimal arrayLengthInBigDecimal = new BigDecimal(elements.length);
        BigDecimal average = total.divide(arrayLengthInBigDecimal, RoundingMode.HALF_UP);

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}
