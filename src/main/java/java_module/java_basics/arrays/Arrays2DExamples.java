package java_module.java_basics.arrays;

public class Arrays2DExamples {
    public static void main(String[] args) {
        // Initialize a 2D array with curly braces
        int[][] grid = {
                {1, 2, 3},
                {4, 5, 6, 7, 8},
                {9},
                {10, 11}
        };

        // Get the length of each row of a 2D array
        System.out.println("Length of row 1: " + grid[0].length);
        System.out.println("Length of row 2: " + grid[1].length);
        System.out.println("Length of row 3: " + grid[2].length);
        System.out.println("Length of row 4: " + grid[3].length);

        // Print a 2D array using for loops
        for (int i = 0; i < grid.length; i++) {
            int rowLength = grid[i].length;
            System.out.print("| ");

            for (int j = 0; j < rowLength; j++) {
                System.out.print(grid[i][j]);
                System.out.print(" | ");
            }

            System.out.println();
        }


        // Print a 2D array using for-each loops
        for (int[] row : grid) {
            System.out.print("| ");
            for (int number : row) {
                System.out.print(number);
                System.out.print(" | ");
            }
            System.out.println();
        }
    }
}
