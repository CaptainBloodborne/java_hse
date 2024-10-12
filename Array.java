import java.io.*;

public class Array {
    public static int getRandomInt(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static void printArray(int[] arr) {
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
        System.out.println("Generating array size...");
        int boundaries[] = getBoundaries();
        int min = boundaries[0];
        int max = boundaries[1];

        int array_size = getRandomInt(min, max);

        System.out.println();

        int arr[] = new int[array_size];

        System.out.println("Generating array elements...");
        boundaries = getBoundaries();
        min = boundaries[0];
        max = boundaries[1];

        int i;
        for (i = 0 ; i < array_size; i++) {
            arr[i] = getRandomInt(min, max);
        }

        System.out.println();

        System.out.println("Generated array: ");
        printArray(arr);

        System.out.println();

        int counter = 0;

        for (i = 1; i < array_size; i++) {
            if (arr[i] > arr[i - 1]) {
                counter++;
            }
        }

        System.out.println(String.format("%d elements of array are larger than previous element", counter));
        
    }
}
