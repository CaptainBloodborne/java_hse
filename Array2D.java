import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Array2D {
    public static int getRandomInt(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static void printArray(int arr[]) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.printf("%d ", arr[i]);
            } else {
                System.out.printf("%d", arr[i]);
            }
        }
        System.out.print("]\n");
    }

    public static void printArray2D(int matrix[][]) {
        for (int row[]: matrix) {
            printArray(row);
        }
    }

    public static int[] getBoundaries() throws Exception{
        BufferedReader buf = new BufferedReader(
            new InputStreamReader(System.in)
        );

        String str;

        System.out.println("Enter boundaries (split values with space): ?");
        str = buf.readLine();

        String user_input[] = str.split(" ", 2);

        if (user_input.length != 2) {
            throw new Exception("Enter two numbers!");
        }

        int min = Integer.parseInt(user_input[0]);
        int max = Integer.parseInt(user_input[1]);

        if (min > max) {
            throw new Exception("The lower bound must be less than upper bound!");
        }

        return new int[] {min, max};
    }


    public static void main(String[] args) throws Exception {
        System.out.println("Generating number of rows...");
        int boundaries[] = getBoundaries();
        int min = boundaries[0];
        int max = boundaries[1];
        int rows = getRandomInt(min, max);

        System.out.println();

        System.out.println("Generating number of columns...");
        boundaries = getBoundaries();
        min = boundaries[0];
        max = boundaries[1];
        int cols = getRandomInt(min, max);

        int arr[][] = new int[rows][cols];

        System.out.println();

        System.out.println("Generating matrix elements...");
        boundaries = getBoundaries();
        min = boundaries[0];
        max = boundaries[1];

        for (int i = 0 ; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = getRandomInt(min, max);
            }
        }

        System.out.println("Generated matrix: ");
        printArray2D(arr);

        System.out.println();

        for (int j = 0; j < cols; j++) {
            int sum = 0;

            for (int i = 0 ; i < rows; i++) {
                if (arr[i][j] > 0) {
                    sum += arr[i][j];
                }
            }

            System.out.printf("The sum of positive elements of column %d = %d\n",j, sum);
        }

    }
}