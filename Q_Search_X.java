import java.util.*;

//Qu -> Take a matrix as input from the user. search for a given number x and print the indices at which it occurs

public class Q_Search_X {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int nums[][] = new int[rows][cols];

        // input rows
        for (int i = 0; i < rows; i++) {

            // input cols
            for (int j = 0; j < cols; j++) {
                nums[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();

        // output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // compare with x
                if (nums[i][j] == x) {
                    System.out.println("x found at location (" + i + ", " + j + ")");
                }
            }
            System.out.println();
        }
    }
}
