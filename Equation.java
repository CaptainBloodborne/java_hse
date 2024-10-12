public class Equation {
    public static double calculate_d(int a, int b) {
        double d = (Math.min(a, 3 * b) - 2 * Math.sqrt(Math.max(a, 3 * b))) / (Math.pow(4, 3) + Math.max(a, 3 * b) / Math.min(a, b));
        return d;
    }
}