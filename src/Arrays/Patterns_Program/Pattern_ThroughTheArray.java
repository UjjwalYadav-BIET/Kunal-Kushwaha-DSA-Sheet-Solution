package Arrays.Patterns_Program;

public class Pattern_ThroughTheArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 6, 2, 1,0};

        // Part 1: Find the highest number to determine the pattern's height.
        int maxHeight = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num > maxHeight) {
                maxHeight = num;
            }
        }

        // Part 2: Print the pattern from the top down, row by row.
        // The outer loop handles the rows (height).
        for (int height = maxHeight; height > 0; height--) {

            // The inner loop handles the columns (each number in the array).
            for (int i = 0; i < arr.length; i++) {
                int num = arr[i];
                // If the number in the array is tall enough for the current row,
                // print a dot. Otherwise, print a space.
                if (num >= height) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            // Move to the next line after finishing a row.
            System.out.println();
        }
    }
}

