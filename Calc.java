public class Calc {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        if (x * y > 30) {
            double ctg_a = 1.0 / Math.tan(x);
            System.out.println(ctg_a * 2);

        } else {
            System.out.println(x / 2);
        }
    }
}
