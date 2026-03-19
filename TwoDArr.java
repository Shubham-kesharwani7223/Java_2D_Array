import java.util.*;

public class TwoDArr {
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

        // output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

    }
}
